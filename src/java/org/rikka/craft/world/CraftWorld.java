package org.rikka.craft.world;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldServer;
import org.rikka.RikkaType;
import org.rikka.block.IBlock;
import org.rikka.craft.CraftRikka;
import org.rikka.craft.block.CraftBlock;
import org.rikka.craft.event.RikkaException;
import org.rikka.craft.script.IScriptHandler;
import org.rikka.craft.script.ScriptHandler;
import org.rikka.craft.script.ScriptManager;
import org.rikka.data.IData;
import org.rikka.entity.IPlayer;
import org.rikka.tile.ITileEntity;
import org.rikka.world.IWorld;

import static net.minecraft.block.Block.getBlockFromName;

public class CraftWorld extends CraftRikka<WorldServer> implements IWorld {

    private final IScriptHandler handler;

    public CraftWorld(WorldServer world) {
        super(world);
        handler = new ScriptHandler(this);
        ScriptManager.worldHandlers.put(original.hashCode(), handler);
    }

    @Override
    public IData getTData() {
        return handler.getTData();
    }

    @Override
    public IData getSData() {
        return handler.getSData();
    }

    @Override
    public long getTime() {
        return original.getWorldTime();
    }

    @Override
    public void setTime(long time) {
        original.setWorldTime(time);
    }

    @Override
    public IBlock getBlock(int x, int y, int z) {
        BlockPos pos = new BlockPos(x, y, z);
        Block block = original.getBlockState(pos).getBlock();
        return new CraftBlock(this, block, pos);
    }

    @Override
    public ITileEntity getTile(int x, int y, int z) {
        TileEntity tile = original.getTileEntity(new BlockPos(x, y, z));
        if (tile != null && tile.hasCapability(ScriptManager.capability, null)) {
            return (ITileEntity) tile.getCapability(ScriptManager.capability, null).getRikka();
        }
        return null;
    }

    @Override
    @SuppressWarnings("deprecation")
    public IBlock setBlock(int x, int y, int z, String name, int meta) {
        BlockPos pos = new BlockPos(x, y, z);
        if (name.equals("air")) {
            original.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
            return new CraftBlock(this, Blocks.AIR, pos);
        }
        Block block = getBlockFromName(name);
        if (block == null) {
            throw new RikkaException("There is no such block: %s .");
        }
        // 可能没有成功放置,超出高度或其他原因
        if (original.setBlockState(pos, (meta == -1 ? block.getDefaultState() : block.getStateFromMeta(meta)), 3)) {
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
        Block _block = block.getOriginal();
        original.setBlockState(pos, _block.getStateFromMeta(block.getMetadata()));
        return new CraftBlock(this, _block, pos);
    }

    @Override
    public IPlayer getPlayer(String name) {
        EntityPlayer player = original.getPlayerEntityByName(name);
        if (player instanceof EntityPlayerMP && player.hasCapability(ScriptManager.capability, null)) {
            return (IPlayer) player.getCapability(ScriptManager.capability, null).getRikka();
        }
        return null;
    }

    @Override
    public RikkaType getType() {
        return RikkaType.WORLD;
    }

    @Override
    public int getX() {
        return original.getSpawnPoint().getX();
    }

    @Override
    public int getY() {
        return original.getSpawnPoint().getY();
    }

    @Override
    public int getZ() {
        return original.getSpawnPoint().getZ();
    }

    @Override
    public IWorld getWorld() {
        return this;
    }

    public IScriptHandler getHandler() {
        return handler;
    }
}
