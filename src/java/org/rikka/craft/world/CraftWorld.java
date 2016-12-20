package org.rikka.craft.world;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import org.rikka.RikkaType;
import org.rikka.block.IBlock;
import org.rikka.craft.CraftRikka;
import org.rikka.craft.block.CraftBlock;
import org.rikka.craft.event.RikkaException;
import org.rikka.craft.script.ScriptManager;
import org.rikka.entity.IPlayer;
import org.rikka.tile.ITileEntity;
import org.rikka.world.IWorld;

import static net.minecraft.block.Block.getBlockFromName;

public class CraftWorld extends CraftRikka<WorldServer> implements IWorld {

    public CraftWorld(WorldServer world) {
        super(world);
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
        net.minecraft.block.Block block = original.getBlockState(pos).getBlock();
        return new CraftBlock(this, block, pos);
    }

    @Override
    public ITileEntity getTile(int x, int y, int z) {
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
        return null;
    }

    @Override
    @SuppressWarnings("deprecation")
    public IBlock setBlock(IBlock block) {
        if (block == null) {
            return null;
        }
        BlockPos pos = new BlockPos(block.getBlockX(), block.getBlockY(), block.getBlockZ());
        Block _block = block.getMCBlock();
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
    public World getMCWorld() {
        return original;
    }

    @Override
    public RikkaType type() {
        return RikkaType.WORLD;
    }

    @Override
    public int getBlockX() {
        return original.getSpawnPoint().getX();
    }

    @Override
    public int getBlockY() {
        return original.getSpawnPoint().getY();
    }

    @Override
    public int getBlockZ() {
        return original.getSpawnPoint().getZ();
    }

    @Override
    public IWorld getWorld() {
        return this;
    }

}
