package rikka.api.block;

import com.flowpowered.math.vector.Vector3i;
import rikka.api.block.tileentity.TileEntityArchetype;
import rikka.api.data.DataContainer;
import rikka.api.data.ImmutableDataBuilder;
import rikka.api.data.LocatableSnapshot;
import rikka.api.util.generator.dummy.DummyObjectProvider;
import rikka.api.world.BlockChangeFlag;
import rikka.api.world.Location;
import rikka.api.world.World;
import rikka.api.world.storage.WorldProperties;

import java.util.Optional;
import java.util.UUID;

public interface BlockSnapshot extends LocatableSnapshot<BlockSnapshot> {

    BlockSnapshot NONE = DummyObjectProvider.createFor(BlockSnapshot.class, "NONE");

    static Builder builder() {
        return null;
        //Sponge.getRegistry().createBuilder(Builder.class);
    }

    IBlockState getState();

    IBlockState getExtendedState();

    BlockSnapshot withState(IBlockState blockState);

    BlockSnapshot withContainer(DataContainer container);

    boolean restore(boolean force, BlockChangeFlag flag);

    Optional<UUID> getCreator();

    Optional<UUID> getNotifier();

    Optional<TileEntityArchetype> createArchetype();

    interface Builder extends ImmutableDataBuilder<BlockSnapshot, Builder> {

        /**
         * Sets the {@link WorldProperties} for this {@link BlockSnapshot}.
         *
         * <p>
         * This is used to grab the {@link UUID} of the World for this snapshot.
         * </p>
         *
         * @param worldProperties The WorldProperties
         * @return This builder, for chaining
         */
        Builder world(WorldProperties worldProperties);

        /**
         * Sets the {@link IBlockState} for this {@link BlockSnapshot}.
         *
         * @param blockState The BlockState
         * @return This builder, for chaining
         */
        Builder blockState(IBlockState blockState);

        /**
         * Sets the coordinates of this {@link BlockSnapshot} from a {@link Vector3i}.
         *
         * @param position The Vector3i representing the coordinates
         * @return This builder, for chaining
         */
        Builder position(Vector3i position);

        /**
         * Copies over block data from a {@link Location}.
         *
         * @param location The Location to copy from
         * @return This builder, for chaining
         */
        Builder from(Location<World> location);

        /**
         * Sets the {@link UUID} of the user who created this
         * {@link BlockSnapshot}.
         *
         * @param uuid The {@link UUID} of the creator
         * @return This builder, for chaining
         */
        Builder creator(UUID uuid);

        /**
         * Sets the {@link UUID} of the user who last notified this
         * {@link BlockSnapshot}.
         *
         * @param uuid The {@link UUID} of the notifier
         * @return This builder, for chaining
         */
        Builder notifier(UUID uuid);
    }
}
