package org.rikka.craft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldServer;
import org.rikka.World;
import org.rikka.block.Block;
import org.rikka.craft.block.CraftBlock;
import org.rikka.craft.entity.CraftPlayer;
import org.rikka.craft.event.RikkaException;
import org.rikka.entity.Player;

public class CraftWorld implements World {

    private final WorldServer world;

    public CraftWorld(net.minecraft.world.World world) {
        //客户端与服务端区分转换!!!
        this.world = (WorldServer) world;
    }

    @Override
    public long getTime() {
        return world.getWorldTime();
    }

    @Override
    public void setTime(long time) {
        world.setWorldTime(time);
    }

    @Override
    public Block getBlock(int x, int y, int z) {
        BlockPos pos = new BlockPos(x, y, z);
        net.minecraft.block.Block block = world.getBlockState(pos).getBlock();
        return new CraftBlock(world, block, pos);
    }

    @Override
    @SuppressWarnings("deprecation")
    public void setBlock(int x, int y, int z, String name, int meta) {
        net.minecraft.block.Block block = net.minecraft.block.Block.getBlockFromName(name);
        if (block == null) {
            throw new RikkaException("There is no such block: %s .");
        } else {
            // 可能没有成功放置,超出高度或其他原因
            world.setBlockState(new BlockPos(x, y, z), block.getStateFromMeta(meta));
        }
    }

    @Override
    public Player getPlayerByName(String name) {
        EntityPlayer player = world.getPlayerEntityByName(name);
        if (player != null && !player.worldObj.isRemote) {
            return new CraftPlayer<>((EntityPlayerMP) player);
        } else {
            return null;
        }
    }

    @Override
    public net.minecraft.world.World getMCWorld() {
        return world;
    }
}
