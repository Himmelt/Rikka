package org.soraworld.rikka.craft.world;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldServer;
import org.rikka.block.IBlock;
import org.rikka.data.IData;
import org.rikka.entity.IPlayer;
import org.rikka.handler.IDataHandler;
import org.rikka.tileentity.ITileEntity;
import org.rikka.world.IWorld;
import org.soraworld.rikka.craft.CraftRikka;
import org.soraworld.rikka.craft.block.CraftBlock;
import org.soraworld.rikka.craft.event.RikkaException;

import static net.minecraft.block.Block.getBlockFromName;

public class CraftWorld extends CraftRikka<WorldServer> implements IWorld {

    private IData tData;
    private IData sData;

    public CraftWorld(WorldServer world, IDataHandler data) {
        super(world);
        copy(data);
        worlds.put(origin.hashCode(), this);
    }

    @Override
    public long getTime() {
        return origin.getWorldTime();
    }

    @Override
    public void setTime(long time) {
        origin.setWorldTime(time);
    }

    @Override
    public IBlock getBlock(int x, int y, int z) {
        BlockPos pos = new BlockPos(x, y, z);
        Block block = origin.getBlockState(pos).getBlock();
        return new CraftBlock(this, block, pos);
    }

    @Override
    public ITileEntity getTile(int x, int y, int z) {
        TileEntity tile = origin.getTileEntity(new BlockPos(x, y, z));
        return null;
    }

    @Override
    @SuppressWarnings("deprecation")
    public IBlock setBlock(int x, int y, int z, String name, int meta) {
        BlockPos pos = new BlockPos(x, y, z);
        if (name.equals("air")) {
            origin.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
            return new CraftBlock(this, Blocks.AIR, pos);
        }
        Block block = getBlockFromName(name);
        if (block == null) {
            throw new RikkaException("There is no such block: %s .");
        }
        // 可能没有成功放置,超出高度或其他原因
        if (origin.setBlockState(pos, (meta == -1 ? block.getDefaultState() : block.getStateFromMeta(meta)), 3)) {
            return new CraftBlock(this, block, pos);
        }
        return getBlock(x, y, z);
    }

    @Override
    @SuppressWarnings("deprecation")
    public IBlock setBlock(IBlock block) {
        if (block == null) {
            return null;
        }
        BlockPos pos = new BlockPos(block.getX(), block.getY(), block.getZ());
        Block _block = block.getOrigin();
        origin.setBlockState(pos, _block.getStateFromMeta(block.getmeta()));
        return new CraftBlock(this, _block, pos);
    }

    @Override
    public IPlayer getPlayer(String name) {

        return null;
    }

    @Override
    public IData getTData() {
        return tData;
    }

    @Override
    public IData getSData() {
        return sData;
    }

    @Override
    public void copy(IDataHandler data) {
        if (data != null) {
            tData = data.getTData();
            sData = data.getSData();
        }
    }

}
