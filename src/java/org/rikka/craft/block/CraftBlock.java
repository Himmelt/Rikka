package org.rikka.craft.block;

import net.minecraft.util.math.BlockPos;
import org.rikka.World;
import org.rikka.block.Block;
import org.rikka.craft.CraftWorld;

public class CraftBlock implements Block {

    private final World world;
    private final BlockPos pos;
    private final net.minecraft.block.Block block;

    public CraftBlock(net.minecraft.world.World world, net.minecraft.block.Block block, BlockPos pos) {
        this.world = new CraftWorld(world);
        this.block = block;
        this.pos = pos;
    }

    @Override
    public int getX() {
        return pos.getX();
    }

    @Override
    public int getY() {
        return pos.getY();
    }

    @Override
    public int getZ() {
        return pos.getZ();
    }

    @Override
    public int getMetadata() {
        return block.getMetaFromState(world.getMCWorld().getBlockState(pos));
    }

    @Override
    @SuppressWarnings("deprecation")
    public void setMetadata(int meta) {
        world.getMCWorld().setBlockState(pos, block.getStateFromMeta(meta), 2);
    }

    @Override
    public World getWorld() {
        return world;
    }

    @Override
    public net.minecraft.block.Block getMCBlock() {
        return null;
    }

}
