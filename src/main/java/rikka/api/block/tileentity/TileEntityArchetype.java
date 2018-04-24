package rikka.api.block.tileentity;

import rikka.api.block.BlockSnapshot;
import rikka.api.block.BlockState;
import rikka.api.data.Archetype;
import rikka.api.data.DataContainer;
import rikka.api.data.DataView;
import rikka.api.data.key.Key;
import rikka.api.data.manipulator.DataManipulator;
import rikka.api.data.persistence.DataBuilder;
import rikka.api.data.persistence.InvalidDataException;
import rikka.api.data.value.BaseValue;
import rikka.api.world.Location;
import rikka.api.world.World;

public interface TileEntityArchetype extends Archetype<BlockSnapshot, TileEntity> {

    static Builder builder() {
        return null;
        //Sponge.getRegistry().createBuilder(Builder.class);
    }

    BlockState getState();

    TileEntityType getTileEntityType();

    DataContainer getTileData();

    @Override
    void setRawData(DataView container) throws InvalidDataException;

    @Override
    TileEntityArchetype copy();

    interface Builder extends DataBuilder<TileEntityArchetype> {

        @Override
        Builder reset();

        @Override
        Builder from(TileEntityArchetype value);

        Builder from(Location<World> location);

        /**
         * Sets the {@link BlockState} of the archetype.
         *
         * @param state The new block state
         * @return This builder, for chaining
         */
        Builder state(BlockState state);

        Builder tile(TileEntityType tileEntityType);

        Builder tile(TileEntity tileEntity);

        Builder tileData(DataView dataView);

        Builder setData(DataManipulator<?, ?> manipulator);

        <E, V extends BaseValue<E>> Builder set(V value);

        <E, V extends BaseValue<E>> Builder set(Key<V> key, E value);

        /**
         * Creates a new {@link TileEntityArchetype} from this builder.
         *
         * @return The new instance
         */
        TileEntityArchetype build();

    }
}
