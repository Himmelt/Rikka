package org.rikka.craft.block;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import org.rikka.RikkaType;
import org.rikka.block.IBlock;
import org.rikka.craft.CraftRikka;
import org.rikka.world.IWorld;

public class CraftBlock extends CraftRikka<Block> implements IBlock {

    private final IWorld world;
    private final BlockPos pos;

    public CraftBlock(IWorld world, Block block, BlockPos pos) {
        super(block);
        this.world = world;
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
        return original.getMetaFromState(world.getOriginal().getBlockState(pos));
    }

    @Override
    @SuppressWarnings("deprecation")
    public void setMetadata(int meta) {
        world.getOriginal().setBlockState(pos, original.getStateFromMeta(meta), 2);
    }

    @Override
    public void remove() {
        world.setBlock(pos.getX(), pos.getY(), pos.getZ(), "air", 0);
    }

    @Override
    public IBlock replace(String name) {
        return world.setBlock(pos.getX(), pos.getY(), pos.getZ(), name, -1);
    }

    @Override
    public IBlock replace(IBlock block) {
        return world.setBlock(block);
    }

    @Override
    public IWorld getWorld() {
        return world;
    }

    @Override
    public RikkaType getType() {
        return RikkaType.BLOCK;
    }
}
