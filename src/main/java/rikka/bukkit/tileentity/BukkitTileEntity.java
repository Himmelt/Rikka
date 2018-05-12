package rikka.bukkit.tileentity;

import net.minecraft.server.v1_12_R1.TileEntity;
import org.bukkit.block.BlockState;
import org.bukkit.craftbukkit.v1_11_R1.block.CraftBlockState;
import org.bukkit.craftbukkit.v1_12_R1.block.CraftBlockEntityState;
import org.bukkit.craftbukkit.v1_7_R4.CraftWorld;
import rikka.api.block.IBlockState;
import rikka.api.tileentity.ITileEntity;
import rikka.api.world.IWorld;
import rikka.api.world.Location;
import rikka.bukkit.BukkitRikka;
import rikka.bukkit.block.BukkitBlockState;

import java.lang.reflect.Field;

import static rikka.bukkit.server.NMSVersion.*;

public class BukkitTileEntity<T extends BlockState> extends BukkitRikka<T> implements ITileEntity {

    private static final Field tileEntity;

    static {
        Field field = null;
        if (v1_12_R1) {
            try {
                field = CraftBlockEntityState.class.getDeclaredField("tileEntity");
                field.setAccessible(true);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
        }
        tileEntity = field;
    }

    public BukkitTileEntity(T source) {
        super(source);
    }

    public T getSource() {
        return source;
    }

    public boolean isValid() {
        if (v1_12_R1 && source instanceof CraftBlockEntityState) {
            try {
                return ((TileEntity) tileEntity.get(source)).y();
            } catch (Throwable e) {
                return false;
            }
        } else if (v1_11_R1 && source instanceof CraftBlockState) {
            return ((CraftBlockState) source).getTileEntity().y();
        } else if (v1_10_R1 && source instanceof org.bukkit.craftbukkit.v1_10_R1.block.CraftBlockState) {
            return ((org.bukkit.craftbukkit.v1_10_R1.block.CraftBlockState) source).getTileEntity().x();
        } else if (v1_7_R4 && source.getWorld() instanceof CraftWorld) {
            return ((CraftWorld) source.getWorld()).getTileEntityAt(source.getX(), source.getY(), source.getZ()).r();
        }
        return false;
    }

    public void setValid(boolean valid) {
        if (v1_12_R1 && source instanceof CraftBlockEntityState) {
            try {
                if (valid) ((TileEntity) tileEntity.get(source)).z();
                else ((TileEntity) tileEntity.get(source)).A();
            } catch (Throwable ignored) {
            }
        } else if (v1_11_R1 && source instanceof CraftBlockState) {
            if (valid) ((CraftBlockState) source).getTileEntity().z();
            else ((CraftBlockState) source).getTileEntity().A();
        } else if (v1_10_R1 && source instanceof org.bukkit.craftbukkit.v1_10_R1.block.CraftBlockState) {
            org.bukkit.craftbukkit.v1_10_R1.block.CraftBlockState state = (org.bukkit.craftbukkit.v1_10_R1.block.CraftBlockState) source;
            if (valid) state.getTileEntity().y();
            else state.getTileEntity().z();
        } else if (v1_7_R4 && source.getWorld() instanceof CraftWorld) {
            CraftWorld world = (CraftWorld) source.getWorld();
            if (valid) world.getTileEntityAt(source.getX(), source.getY(), source.getZ()).s();
            else world.getTileEntityAt(source.getX(), source.getY(), source.getZ()).t();
        }
    }

    public IBlockState getBlock() {
        return new BukkitBlockState(source.getBlock());
    }

    public Location getLocation() {
        return new Location(source.getLocation());
    }

    public final IWorld getWorld() {
        return getWorld(source.getWorld());
    }
}
