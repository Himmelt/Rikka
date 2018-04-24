package rikka.api.block;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import org.soraworld.rikka.Sponge;
import org.soraworld.rikka.data.ImmutableDataBuilder;
import org.soraworld.rikka.data.ImmutableDataHolder;
import org.soraworld.rikka.data.value.BaseValue;
import org.soraworld.rikka.util.Cycleable;
import org.soraworld.rikka.util.ResettableBuilder;
import org.soraworld.rikka.world.Location;
import org.soraworld.rikka.world.World;
import rikka.api.CatalogType;
import rikka.api.block.trait.BlockTrait;
import rikka.api.data.key.Key;
import rikka.api.data.manipulator.DataManipulator;
import rikka.api.data.property.DirectionRelativePropertyHolder;

import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Predicate;

import static com.google.common.base.Preconditions.*;

public interface BlockState extends ImmutableDataHolder<BlockState>, DirectionRelativePropertyHolder, CatalogType {

    static Builder builder() {
        return Sponge.getRegistry().createBuilder(Builder.class);
    }

    static MatcherBuilder matcher(BlockType type) {
        return new MatcherBuilder().type(type);
    }

    BlockType getType();

    BlockState withExtendedProperties(Location<World> location);

    BlockState cycleValue(Key<? extends BaseValue<? extends Cycleable<?>>> key);

    BlockSnapshot snapshotFor(Location<World> location);

    <T extends Comparable<T>> Optional<T> getTraitValue(BlockTrait<T> blockTrait);

    Optional<BlockTrait<?>> getTrait(String blockTrait);

    Optional<BlockState> withTrait(BlockTrait<?> trait, Object value);

    Collection<BlockTrait<?>> getTraits();

    Collection<?> getTraitValues();

    Map<BlockTrait<?>, ?> getTraitMap();

    interface Builder extends ImmutableDataBuilder<BlockState, Builder> {

        /**
         * Sets the {@link BlockType} for the {@link BlockState} to build.
         *
         * <p>The {@link BlockType} is used for some pre-validation on addition of
         * {@link DataManipulator}s through {@link #add(DataManipulator)}. It is
         * important to understand that not all manipulators are compatible with
         * all {@link BlockType}s.</p>
         *
         * @param blockType The block type
         * @return This builder, for chaining
         */
        Builder blockType(BlockType blockType);

    }

    final class MatcherBuilder implements ResettableBuilder<StateMatcher, MatcherBuilder> {

        @Nullable
        private BlockType type;
        private ArrayList<BlockTrait<?>> traits = new ArrayList<>();
        private ArrayList<Object> values = new ArrayList<>();

        private MatcherBuilder() {
        }

        /**
         * Sets the root {@link BlockType} for the {@link StateMatcher}.
         * <p>Note that the {@link BlockType type} <b>must be set prior</b>
         * to setting various {@link BlockTrait traits} and their values.</p>
         *
         * @param type The block type to use
         * @return This builder, for chaining
         */
        public MatcherBuilder type(BlockType type) {
            this.type = checkNotNull(type, "BlockType cannot be null!");
            return this;
        }

        /**
         * Adds the desired {@link BlockTrait} and {code value} to this
         * builder, if the desired {@link BlockTrait} does not belong to the
         * original {@link BlockType} as provided by {@link #type(BlockType)},
         * an exception is thrown. Likewise, if a {@code value} is not within
         * the possible values for the desired trait of the desired type, an
         * exception is thrown.
         *
         * @param trait The desired block trait
         * @param value the desired value
         * @param <T>   The type of comparable
         * @return This builder
         * @throws IllegalArgumentException If the block trait does not match
         *                                  the block type, or if the value does not belong to the trait
         *                                  with the desired block type
         */
        public <T extends Comparable<T>> MatcherBuilder trait(BlockTrait<T> trait, T value) throws IllegalArgumentException {
            checkState(this.type != null, "BlockType cannot be null! Must be set before using any traits!");
            checkArgument(this.type.getTraits().contains(trait), "BlockType does not contain the specified trait: %s", trait);
            checkArgument(trait.getPossibleValues().contains(value), "BlockTrait %s does not contain value %s", trait, value);
            checkArgument(!this.traits.contains(trait), "Already contains the trait %s! Cannot add multiple values!", trait);
            this.traits.add(trait);
            this.values.add(value);
            return this;
        }

        /**
         * Creates a new {@link StateMatcher}.
         *
         * @return The new state matcher
         * @throws IllegalStateException If there is no block type
         */
        public StateMatcher build() throws IllegalStateException {
            checkState(this.type != null, "BlockType cannot be null!");
            return new StateMatcher(this.type, this.traits.toArray(new BlockTrait<?>[this.traits.size() - 1]), this.values.toArray());

        }

        @SuppressWarnings({"unchecked", "rawtypes"})
        @Override
        public MatcherBuilder from(StateMatcher value) {
            reset();
            type(value.type);
            for (int i = 0; i < value.traits.length; i++) {
                trait(value.traits[i], (Comparable) value.values[i]);
            }
            return this;
        }

        @Override
        public MatcherBuilder reset() {
            this.type = null;
            this.traits.clear();
            this.values.clear();
            return this;
        }
    }

    final class StateMatcher implements Predicate<BlockState> {
        private final BlockType type;
        private final BlockTrait<?>[] traits;
        private final Object[] values;
        @Nullable
        private ImmutableList<BlockState> compatibleStates; // Lazily constructed

        private StateMatcher(BlockType type, BlockTrait<?>[] traits, Object[] values) {
            this.type = type;
            this.traits = new BlockTrait<?>[traits.length];
            System.arraycopy(traits, 0, this.traits, 0, traits.length);
            this.values = new Object[values.length];
            System.arraycopy(values, 0, this.values, 0, values.length);
        }

        private ImmutableList<BlockState> computeCompatibleStates() {
            return this.type.getAllBlockStates()
                    .stream()
                    .filter(this::matches)
                    .collect(ImmutableList.toImmutableList());
        }

        public boolean matches(BlockState state) {
            if (this.type != state.getType()) {
                return false;
            }
            for (int i = 0; i < this.traits.length; i++) {
                final BlockTrait<?> trait = this.traits[i];
                final Object value = this.values[i];
                final Optional<?> traitValue = state.getTraitValue(trait);
                if (!traitValue.isPresent()) { // If for any reason this fails, that means there's another problem, but alas, just in case
                    return false;
                }
                final Object o = traitValue.get();
                if (!value.equals(o)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public boolean test(BlockState blockState) {
            return matches(blockState);
        }

        public List<BlockState> getCompatibleStates() {
            if (this.compatibleStates == null) {
                this.compatibleStates = computeCompatibleStates();
            }
            return this.compatibleStates;
        }

        @Override
        public String toString() {
            return MoreObjects.toStringHelper(this)
                    .add("type", this.type)
                    .add("traits", this.traits)
                    .add("values", this.values)
                    .toString();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            StateMatcher that = (StateMatcher) o;
            return Objects.equal(this.type, that.type)
                    && Objects.equal(this.traits, that.traits)
                    && Objects.equal(this.values, that.values);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(this.type, this.traits, this.values);
        }
    }
}
