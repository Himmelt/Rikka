package rikka.api.world;

import com.flowpowered.math.vector.Vector3i;
import rikka.api.Sponge;
import rikka.api.block.IBlockState;
import rikka.api.data.ImmutableDataHolder;
import rikka.api.data.persistence.DataBuilder;

public interface LocatableBlock extends ImmutableDataHolder<LocatableBlock>, Locatable {

    static Builder builder() {
        return Sponge.getRegistry().createBuilder(Builder.class);
    }

    IBlockState getBlockState();

    default Vector3i getPosition() {
        return getLocation().getBlockPosition();
    }

    interface Builder extends DataBuilder<LocatableBlock> {

        /**
         * Sets the {@link IBlockState} for this builder.
         *
         * @param blockState The block state
         * @return This builder, for chaining
         */
        Builder state(IBlockState blockState);

        /**
         * Sets the {@link IBlockState} and {@link Vector3i position} for this
         * builder.
         *
         * @param location The location containing the block state and position
         * @return This builder, for chaining
         */
        Builder location(Location<IWorld> location);

        /**
         * Sets the {@link Vector3i position} for this builder.
         *
         * @param position The position
         * @return This builder, for chaining
         */
        Builder position(Vector3i position);

        /**
         * Sets the {@code x} {@code y} {@code z} positions for this builder.
         *
         * @param x The x coordinate
         * @param y The y coordinate
         * @param z The z coordinate
         * @return This builder, for chaining
         */
        Builder position(int x, int y, int z);

        /**
         * Sets the {@link IWorld} for this builder, used to get the {@link IBlockState}
         * for a desired position.
         *
         * @param world The world
         * @return This builder, for chaining
         */
        Builder world(IWorld world);

        @Override
        Builder reset();

        @Override
        Builder from(LocatableBlock value);

        /**
         * Creates a new {@link LocatableBlock}.
         *
         * @return The new locatable block
         */
        LocatableBlock build();
    }

}
