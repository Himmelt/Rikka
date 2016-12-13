package org.rikka.craft.event;

import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * 事件订阅集合,用于触发脚本.
 */
public class SubscribeScript {

    /**
     * [客户端/服务端] 玩家交互,分左右手引发两次事件.
     *
     * @param event 事件
     */
    @SubscribeEvent
    public void onPlayerInteract(PlayerInteractEvent event) {
    }

    /**
     * [客户端] 玩家扔出物品或将物品拖出容器.
     * 可阻止物品在世界生成实体,但是无法阻止物品移除.
     *
     * @param event 事件
     */
    @SubscribeEvent
    public void onItemToss(ItemTossEvent event) {
    }

}
