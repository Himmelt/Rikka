package org.rikka.craft.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.rikka.craft.item.CraftItemStack;
import org.rikka.craft.script.EnumHook;
import org.rikka.craft.script.IScriptHandler;
import org.rikka.craft.script.ScriptManager;
import org.rikka.entity.Player;
import org.rikka.event.entity.player.PlayerTossEvent;

/**
 * 玩家事件订阅集合,用于玩家触发脚本.
 * 特别注意事项,不要订阅触发频率高,却很少执行脚本的事件.
 */
public class SubscribePlayerEvent {

    /**
     * [服务端] 玩家重生(死亡后复活或者从末地返回主世界)事件.
     * 需要手动同步Capability数据.
     *
     * @param event 事件
     */
    @SubscribeEvent
    public void on(PlayerEvent.Clone event) {
        EntityPlayer o = event.getOriginal();
        EntityPlayer p = event.getEntityPlayer();
        if (o != null && p != null && o.hasCapability(ScriptManager.capability, null) && p.hasCapability(ScriptManager.capability, null)) {
            IScriptHandler oh = o.getCapability(ScriptManager.capability, null);
            IScriptHandler ph = p.getCapability(ScriptManager.capability, null);
            ph.readFromNBT(oh.writeToNBT(new NBTTagCompound()));
        }
    }

    /**
     * [客户端/服务端] 玩家右键实体事件.
     * 主副手各触发一次.
     * 先于{@link PlayerInteractEvent.EntityInteract}发生.
     *
     * @param event 事件
     */
    @SubscribeEvent
    public void on(PlayerInteractEvent.EntityInteractSpecific event) {
        System.out.println("EntityInteractSpecific");
    }

    /**
     * [客户端/服务端] 玩家右键实体事件.
     * 主副手各触发一次.
     * 后于{@link PlayerInteractEvent.EntityInteractSpecific}发生.
     *
     * @param event 事件
     */
    @SubscribeEvent
    public void on(PlayerInteractEvent.EntityInteract event) {
        System.out.println("EntityInteract");
    }

    /**
     * [客户端/服务端] 玩家右键方块事件.
     * 若手持可放置方块,则不触发???.比较复杂.
     *
     * @param event 事件
     */
    @SubscribeEvent
    public void on(PlayerInteractEvent.RightClickBlock event) {
        System.out.println("RightClickBlock");
    }

    /**
     * [客户端/服务端] 玩家右键物品事件.
     *
     * @param event 事件
     */
    @SubscribeEvent
    public void on(PlayerInteractEvent.RightClickItem event) {
        System.out.println("RightClickItem");
    }

    /**
     * [客户端] 玩家右键空手空气事件.
     * 双手空时,仅主手触发;仅副手空时,副手触发.
     *
     * @param event 事件
     */
    @SubscribeEvent
    public void on(PlayerInteractEvent.RightClickEmpty event) {
        System.out.println("RightClickEmpty");
    }

    @SubscribeEvent
    public void on(PlayerInteractEvent.LeftClickBlock event) {
        System.out.println("LeftClickBlock");
    }

    /**
     * [客户端] 玩家左键空气事件.
     * 仅主手触发.
     *
     * @param event 事件
     */
    @SubscribeEvent
    public void on(PlayerInteractEvent.LeftClickEmpty event) {
        System.out.println("LeftClickEmpty");
    }

    /**
     * [服务端] 玩家拾取物品事件.
     *
     * @param event 事件
     */
    @SubscribeEvent
    public void on(EntityItemPickupEvent event) {
        System.out.println("EntityItemPickupEvent");
    }

    /**
     * [客户端/服务端] 玩家右键使用桶事件.
     *
     * @param event 事件
     */
    @SubscribeEvent
    public void on(FillBucketEvent event) {
        System.out.println("FillBucketEvent");
    }

    /**
     * [服务端] 玩家扔出物品或将物品拖出容器.
     * [可取消] 可阻止物品在世界生成实体,但是无法阻止物品移除.
     * 注意: 此处已将事件主体由物品改为玩家!!!
     *
     * @param event 事件
     */
    @SubscribeEvent
    public void on(ItemTossEvent event) {
        System.out.println("toss");
        EntityPlayer player = event.getPlayer();
        ItemStack itemStack = event.getEntityItem().getEntityItem();
        if (player instanceof EntityPlayerMP && ScriptManager.playerHandlers.containsKey(player.hashCode())) {
            IScriptHandler handler = ScriptManager.playerHandlers.get(player.hashCode());
            Object object = handler.getObject();
            if (object instanceof Player) {
                PlayerTossEvent tossEvent = new PlayerTossEvent(object, new CraftItemStack(itemStack));
                handler.run(EnumHook.toss, tossEvent);
                event.setCanceled(tossEvent.isCanceled());
            }
        }
    }

    /**
     * [服务端/客户端] 铁砧修复事件.
     *
     * @param event 事件.
     */
    @SubscribeEvent
    public void on(AnvilRepairEvent event) {
        System.out.println("repair");
        EntityPlayer player = event.getEntityPlayer();
        if (player != null && !player.canUseCommandBlock()) {
            ItemStack in = event.getItemInput();
            ItemStack out = event.getItemResult();
            if (!in.hasDisplayName()) {
                out.clearCustomName();
            } else {
                out.setStackDisplayName(in.getDisplayName());
            }
        }
    }
}
