package org.rikka.craft.block;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import org.rikka.RikkaType;
import org.rikka.block.IBlock;
import org.rikka.craft.CraftRikka;
import org.rikka.world.IWorld;

public class CraftBlock extends CraftRikka<Block> implements IBlock {

    private final BlockPos pos;

    public CraftBlock(IWorld world, Block block, BlockPos pos) {
        super(block);
        this.world = world;
        this.pos = pos;
    }

    @Override
    public int getBlockX() {
        return pos.getX();
    }

    @Override
    public int getBlockY() {
        return pos.getY();
    }

    @Override
    public int getBlockZ() {
        return pos.getZ();
    }

    @Override
    public int getMetadata() {
        return original.getMetaFromState(getWorld().getMCWorld().getBlockState(pos));
    }

    @Override
    @SuppressWarnings("deprecation")
    public void setMetadata(int meta) {
        getWorld().getMCWorld().setBlockState(pos, original.getStateFromMeta(meta), 2);
    }

    @Override
    public void remove() {
        getWorld().setBlock(pos.getX(), pos.getY(), pos.getZ(), "air", 0);
    }

    @Override
    public IBlock replace(String name) {
        return getWorld().setBlock(pos.getX(), pos.getY(), pos.getZ(), name, -1);
    }

    @Override
    public IBlock replace(IBlock block) {
        getWorld().setBlock(block);
        return new CraftBlock(world, block.getMCBlock(), pos);
    }

    @Override
    public IWorld getWorld() {
        return world;
    }

    @Override
    public Block getMCBlock() {
        return original;
    }

    @Override
    public RikkaType type() {
        return RikkaType.BLOCK;
    }
}
