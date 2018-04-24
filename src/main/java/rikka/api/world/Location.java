package rikka.api.world;

import rikka.api.block.*;
import rikka.api.block.tileentity.TileEntity;
import rikka.api.data.*;
import rikka.api.data.key.Key;
import rikka.api.data.manipulator.DataManipulator;
import rikka.api.data.merge.MergeFunction;
import rikka.api.data.persistence.InvalidDataException;
import rikka.api.data.value.BaseValue;
import rikka.api.data.value.immutable.ImmutableValue;
import rikka.api.entity.EntityType;
import rikka.api.entity.IEntity;
import rikka.api.util.Direction;
import rikka.api.util.math.Vector3d;
import rikka.api.util.math.Vector3i;
import rikka.api.world.biome.BiomeType;
import rikka.api.world.extent.Extent;

import javax.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

public final class Location<E extends Extent> implements DataHolder {

    private final WeakReference<E> extent;
    @Nullable
    private Vector3d position = null;
    @Nullable
    private Vector3i blockPosition = null;
    @Nullable
    private Vector3i chunkPosition = null;
    @Nullable
    private Vector3i biomePosition = null;

    public Location(E extent, Vector3d position) {
        //this.extent = new WeakReference<>(checkNotNull(extent, "extent"));
        //this.position = checkNotNull(position, "position");
    }

    public Location(E extent, double x, double y, double z) {
        this(extent, new Vector3d(x, y, z));
    }

    public Location(E extent, Vector3i blockPosition) {
        //this.extent = new WeakReference<>(checkNotNull(extent, "extent"));
        //this.blockPosition = checkNotNull(blockPosition, "blockPosition");
    }

    public Location(E extent, int x, int y, int z) {
        this(extent, new Vector3i(x, y, z));
    }

    public E getExtent() {
        final E currentExtent = this.extent.get();
        if (currentExtent == null) {
            throw new IllegalStateException();
        }
        return currentExtent;
    }

    public Vector3d getPosition() {
        if (this.position == null) {
            //checkState(this.blockPosition != null);
            //this.position = getBlockPosition().toDouble();
        }
        return this.position;
    }

    public Vector3i getBlockPosition() {
        if (this.blockPosition == null) {
            //checkState(this.position != null);
            //this.blockPosition = getPosition().toInt();
        }
        return this.blockPosition;
    }

    public Vector3i getChunkPosition() {
        if (this.chunkPosition == null) {
            //this.chunkPosition = Sponge.getServer().getChunkLayout().forceToChunk(getBlockPosition());
        }
        return this.chunkPosition;
    }

    public Vector3i getBiomePosition() {
        if (this.biomePosition == null) {
            final Vector3i blockPosition = getBlockPosition();
            //this.biomePosition = new Vector3i(blockPosition.getX(), 0, blockPosition.getZ());
        }
        return this.biomePosition;
    }

    public double getX() {
        return getPosition().x;
    }

    public double getY() {
        return getPosition().y;
    }

    public double getZ() {
        return getPosition().z;
    }

    public int getBlockX() {
        return getBlockPosition().x;
    }

    public int getBlockY() {
        return getBlockPosition().y;
    }

    public int getBlockZ() {
        return getBlockPosition().z;
    }

    public boolean inExtent(Extent extent) {
        return getExtent().equals(extent);
    }

    public boolean hasBiome() {
        return getExtent().containsBiome(getBiomePosition());
    }

    public boolean hasBlock() {
        return getExtent().containsBlock(getBlockPosition());
    }

    public Optional<LocatableBlock> getLocatableBlock() {
        return getExtent() instanceof World
                ? Optional.of(
                LocatableBlock
                        .builder()
                        .world((World) getExtent())
                        .position(this.getBlockPosition())
                        .build()
        )
                : Optional.empty();
    }

    public Location<E> setExtent(E extent) {
        if (extent == getExtent()) {
            return this;
        }
        return new Location<>(extent, getPosition());
    }

    public Location<E> setPosition(Vector3d position) {
        if (position == getPosition()) {
            return this;
        }
        return new Location<>(getExtent(), position);
    }

    public Location<E> setBlockPosition(Vector3i position) {
        if (position == getBlockPosition()) {
            return this;
        }
        return new Location<>(getExtent(), position);
    }

    public Location<E> sub(Vector3d v) {
        return sub(v.x, v.y, v.z);
    }

    public Location<E> sub(Vector3i v) {
        return sub(v.x, v.y, v.z);
    }

    public Location<E> sub(double x, double y, double z) {
        return setPosition(getPosition().sub(x, y, z));
    }

    public Location<E> add(Vector3d v) {
        return add(v.x, v.y, v.z);
    }

    public Location<E> add(Vector3i v) {
        return add(v.x, v.y, v.z);
    }

    public Location<E> add(double x, double y, double z) {
        return setPosition(getPosition().add(x, y, z));
    }

    public <T> T map(BiFunction<E, Vector3d, T> mapper) {
        return mapper.apply(getExtent(), getPosition());
    }

    public <T> T mapBlock(BiFunction<E, Vector3i, T> mapper) {
        return mapper.apply(getExtent(), getBlockPosition());
    }

    public <T> T mapChunk(BiFunction<E, Vector3i, T> mapper) {
        return mapper.apply(getExtent(), getChunkPosition());
    }

    public <T> T mapBiome(BiFunction<E, Vector3i, T> mapper) {
        return mapper.apply(getExtent(), getBiomePosition());
    }

    public Location<E> getRelative(Direction direction) {
        return add(direction.asOffset());
    }

    public Location<E> getBlockRelative(Direction direction) {
        return add(direction.asBlockOffset());
    }

    public BiomeType getBiome() {
        return getExtent().getBiome(getBiomePosition());
    }

    public BlockType getBlockType() {
        return getExtent().getBlockType(getBlockPosition());
    }

    public BlockState getBlock() {
        return getExtent().getBlock(getBlockPosition());
    }

    public boolean hasTileEntity() {
        return getExtent().getTileEntity(getBlockPosition()).isPresent();
    }

    public Optional<TileEntity> getTileEntity() {
        return getExtent().getTileEntity(getBlockPosition());
    }

    public boolean setBlock(BlockState state) {
        return getExtent().setBlock(getBlockPosition(), state);
    }

    public boolean setBlock(BlockState state, BlockChangeFlag flag) {
        return getExtent().setBlock(getBlockPosition(), state, flag);
    }

    public boolean setBlockType(BlockType type) {
        return getExtent().setBlockType(getBlockPosition(), type);
    }

    public boolean setBlockType(BlockType type, BlockChangeFlag flag) {
        return getExtent().setBlockType(getBlockPosition(), type, flag);
    }

    public boolean restoreSnapshot(BlockSnapshot snapshot, boolean force, BlockChangeFlag flag) {
        return getExtent().restoreSnapshot(getBlockPosition(), snapshot, force, flag);
    }

    public boolean removeBlock() {
        return getExtent().setBlockType(getBlockPosition(), BlockTypes.AIR, BlockChangeFlags.ALL);
    }

    public IEntity createEntity(EntityType type) {
        return this.getExtent().createEntity(type, this.getPosition());
    }

    public boolean spawnEntity(IEntity entity) {
        return this.getExtent().spawnEntity(entity);
    }

    public Collection<IEntity> spawnEntities(Iterable<? extends IEntity> entities) {
        return this.getExtent().spawnEntities(entities);
    }

    public Location<E> asHighestLocation() {
        return this.setBlockPosition(this.getExtent().getHighestPositionAt(getBlockPosition()));
    }

    public DataTransactionResult remove(Class<? extends DataManipulator<?, ?>> containerClass) {
        return getExtent().remove(getBlockPosition(), containerClass);
    }

    public DataTransactionResult remove(BaseValue<?> value) {
        return getExtent().remove(getBlockPosition(), value.getKey());
    }

    public DataTransactionResult remove(Key<?> key) {
        return getExtent().remove(getBlockPosition(), key);
    }

    public BlockSnapshot createSnapshot() {
        return getExtent().createSnapshot(getBlockPosition());
    }

    public Collection<ScheduledBlockUpdate> getScheduledUpdates() {
        return getExtent().getScheduledUpdates(getBlockPosition());
    }

    public ScheduledBlockUpdate addScheduledUpdate(int priority, int ticks) {
        return getExtent().addScheduledUpdate(getBlockPosition(), priority, ticks);
    }

    public void removeScheduledUpdate(ScheduledBlockUpdate update) {
        getExtent().removeScheduledUpdate(getBlockPosition(), update);
    }

    public <T extends Property<?, ?>> Optional<T> getProperty(Class<T> propertyClass) {
        return getExtent().getProperty(getBlockPosition(), propertyClass);
    }

    public Collection<Property<?, ?>> getApplicableProperties() {
        return getExtent().getProperties(getBlockPosition());
    }

    public boolean validateRawData(DataView container) {
        return getExtent().validateRawData(getBlockPosition(), container);
    }

    public void setRawData(DataView container) throws InvalidDataException {
        getExtent().setRawData(getBlockPosition(), container);
    }

    public int getContentVersion() {
        return 1;
    }

    public DataContainer toContainer() {
        final DataContainer container = DataContainer.createNew();
        container.set(Queries.CONTENT_VERSION, getContentVersion());
        if (getExtent() instanceof World) {
            container.set(Queries.WORLD_NAME, ((World) getExtent()).getName());
            container.set(Queries.WORLD_ID, getExtent().getUniqueId().toString());
        } else if (getExtent() instanceof Chunk) {
            container.set(Queries.CHUNK_X, ((Chunk) getExtent()).getPosition().getX())
                    .set(Queries.CHUNK_Y, ((Chunk) getExtent()).getPosition().getY())
                    .set(Queries.CHUNK_Z, ((Chunk) getExtent()).getPosition().getZ())
                    .set(Queries.WORLD_NAME, ((Chunk) getExtent()).getWorld().getName())
                    .set(Queries.WORLD_ID, ((Chunk) getExtent()).getWorld().getUniqueId().toString());
        }
        container.set(Queries.BLOCK_TYPE, this.getExtent().getBlockType(getBlockPosition()).getId())
                .set(Queries.POSITION_X, this.getX())
                .set(Queries.POSITION_Y, this.getY())
                .set(Queries.POSITION_Z, this.getZ());
        return container;
    }

    public <T extends DataManipulator<?, ?>> Optional<T> get(Class<T> containerClass) {
        return getExtent().get(getBlockPosition(), containerClass);
    }

    public <T> Optional<T> get(Key<? extends BaseValue<T>> key) {
        return getExtent().get(getBlockPosition(), key);
    }

    public <T extends DataManipulator<?, ?>> Optional<T> getOrCreate(Class<T> containerClass) {
        return getExtent().getOrCreate(getBlockPosition(), containerClass);
    }

    public <T> DataTransactionResult offer(Key<? extends BaseValue<T>> key, T value) {
        return getExtent().offer(getBlockPosition(), key, value);
    }

    public DataTransactionResult offer(Iterable<DataManipulator<?, ?>> valueHolders) {
        return getExtent().offer(getBlockPosition(), valueHolders);
    }

    public DataTransactionResult offer(Iterable<DataManipulator<?, ?>> values, MergeFunction function) {
        return getExtent().offer(getBlockPosition(), values, function);
    }

    public <T> DataTransactionResult offer(BaseValue<T> value) {
        return getExtent().offer(getBlockPosition(), value);
    }

    public DataTransactionResult offer(DataManipulator<?, ?> valueContainer) {
        return getExtent().offer(getBlockPosition(), valueContainer);
    }

    public DataTransactionResult offer(DataManipulator<?, ?> valueContainer, MergeFunction function) {
        return getExtent().offer(getBlockPosition(), valueContainer, function);
    }

    public DataTransactionResult undo(DataTransactionResult result) {
        return getExtent().undo(getBlockPosition(), result);
    }

    public boolean supports(Class<? extends DataManipulator<?, ?>> holderClass) {
        return getExtent().supports(getBlockPosition(), holderClass);
    }

    public boolean supports(Key<?> key) {
        return getExtent().supports(getBlockPosition(), key);
    }

    public <T> DataTransactionResult transform(Key<? extends BaseValue<T>> key, Function<T, T> function) {
        return getExtent().transform(getBlockPosition(), key, function);
    }

    public DataTransactionResult copyFrom(DataHolder that) {
        return getExtent().copyFrom(getBlockPosition(), that);
    }

    public DataTransactionResult copyFrom(DataHolder that, MergeFunction strategy) {
        return getExtent().copyFrom(getBlockPosition(), that, strategy);
    }

    public Collection<DataManipulator<?, ?>> getContainers() {
        return getExtent().getManipulators(getBlockPosition());
    }

    public <T, V extends BaseValue<T>> Optional<V> getValue(Key<V> key) {
        return getExtent().getValue(getBlockPosition(), key);
    }

    public Location<E> copy() {
        return new Location<>(getExtent(), getPosition());
    }

    public Set<Key<?>> getKeys() {
        return getExtent().getKeys(getBlockPosition());
    }

    public Set<ImmutableValue<?>> getValues() {
        return getExtent().getValues(getBlockPosition());
    }

    public String toString() {
        return "Location{" + getPosition() + " in " + getExtent() + "}";
    }

    public int hashCode() {
        return 0;//Objects.hashCode(getExtent(), getPosition());
    }

    public boolean equals(Object other) {
        if (!(other instanceof Location<?>)) {
            return false;
        }
        Location<?> otherLoc = (Location<?>) other;
        return otherLoc.getExtent().equals(getExtent())
                && otherLoc.getPosition().equals(getPosition());
    }

}
