package rikka.api.world;

import org.spongepowered.api.world.World;
import rikka.api.block.BlockType;
import rikka.api.block.IBlockState;
import rikka.api.entity.EntityType;
import rikka.api.entity.IEntity;
import rikka.api.tileentity.ITileEntity;
import rikka.api.util.Direction;
import rikka.api.util.math.Vector3d;
import rikka.api.util.math.Vector3i;
import rikka.api.world.biome.BiomeType;
import rikka.bukkit.BukkitRikka;
import rikka.sponge.SpongeRikka;

import java.util.Collection;

public final class Location {

    private final IWorld world;
    private double x, y, z;

    public Location(IWorld world, Vector3d pos) {
        this(world, pos.x, pos.y, pos.z);
    }

    public Location(IWorld world, Vector3i block) {
        this(world, block.x, block.y, block.z);
    }

    public Location(IWorld world, double x, double y, double z) {
        this.world = world;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Location(org.bukkit.Location location) {
        this.world = BukkitRikka.getWorld(location.getWorld());
        this.x = location.getX();
        this.y = location.getY();
        this.z = location.getZ();
    }

    public Location(org.spongepowered.api.world.Location<World> location) {
        this.world = SpongeRikka.getWorld(location.getExtent());
        this.x = location.getX();
        this.y = location.getY();
        this.z = location.getZ();
    }

    public IWorld getWorld() {
        return world;
    }

    public Vector3d getPosition() {
        return new Vector3d(x, y, z);
    }

    public Vector3i getBlockPosition() {
        return new Vector3i((int) x, (int) y, (int) z);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public int getBlockX() {
        return (int) x;
    }

    public int getBlockY() {
        return (int) y;
    }

    public int getBlockZ() {
        return (int) z;
    }

    public Location sub(Vector3d v) {
        return sub(-v.x, -v.y, -v.z);
    }

    public Location sub(Vector3i v) {
        return sub(-v.x, -v.y, -v.z);
    }

    public Location sub(double x, double y, double z) {
        return add(-x, -y, -z);
    }

    public Location add(Vector3d v) {
        return add(v.x, v.y, v.z);
    }

    public Location add(Vector3i v) {
        return add(v.x, v.y, v.z);
    }

    public Location add(double x, double y, double z) {
        this.x += x;
        this.y += y;
        this.z += z;
        return this;
    }

    public Location getRelative(Direction direction) {
        return add(direction.asOffset());
    }

    public Location getBlockRelative(Direction direction) {
        return add(direction.asBlockOffset());
    }

    public BiomeType getBiome() {
        return world.getBiome(x, y, z);
    }

    public BlockType getBlockType() {
        return world.getBlockType(x, y, z);
    }

    public IBlockState getBlock() {
        return world.getBlockState(x, y, z);
    }

    public boolean hasTileEntity() {
        return world.getTileEntity(x, y, z) != null;
    }

    public ITileEntity getTileEntity() {
        return world.getTileEntity(x, y, z);
    }

    public boolean setBlock(IBlockState state) {
        return world.setBlock(x, y, z, state, null);
    }

    public boolean setBlock(IBlockState state, BlockChangeFlag flag) {
        return world.setBlock(x, y, z, state, flag);
    }

    public boolean setBlockType(BlockType type) {
        // TODO flag
        return world.setBlockType(getBlockPosition(), type, BlockChangeFlags.NONE);
    }

    public boolean setBlockType(BlockType type, BlockChangeFlag flag) {
        return world.setBlockType(getBlockPosition(), type, flag);
    }

    public boolean removeBlock() {
        return world.setBlockType(getBlockPosition(), BlockType.AIR, BlockChangeFlags.ALL);
    }

    public IEntity createEntity(EntityType type) {
        return world.createEntity(type, this.getPosition());
    }

    public boolean spawnEntity(IEntity entity) {
        return world.spawnEntity(entity);
    }

    public Collection<IEntity> spawnEntities(Iterable<? extends IEntity> entities) {
        return world.spawnEntities(entities);
    }

    public Location copy() {
        return new Location(world, x, y, z);
    }

    public String toString() {
        return "Location{" + getPosition() + " in " + world + "}";
    }

    public boolean equals(Object obj) {
        if (obj instanceof Location) {
            Location loc = (Location) obj;
            return world.equals(loc.world) && x == loc.x && y == loc.y && z == loc.z;
        }
        return false;
    }

}
