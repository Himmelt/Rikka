package rikka.api.effect.particle;

import com.flowpowered.math.vector.Vector3d;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.data.DataSerializable;
import org.spongepowered.api.data.persistence.DataBuilder;

import java.util.Map;
import java.util.Optional;

public interface ParticleEffect extends DataSerializable {

    static Builder builder() {
        return Sponge.getRegistry().createBuilder(Builder.class);
    }

    ParticleType getType();

    <V> Optional<V> getOption(ParticleOption<V> option);

    default <V> Optional<V> getOptionOrDefault(ParticleOption<V> option) {
        final Optional<V> value = getOption(option);
        return value.isPresent() ? value : getType().getDefaultOption(option);
    }

    Map<ParticleOption<?>, Object> getOptions();

    interface Builder extends DataBuilder<ParticleEffect> {

        @Override
        Builder from(ParticleEffect particleEffect);

        @Override
        Builder reset();

        /**
         * Sets the particle type for the particle effect.
         *
         * @param particleType The particle type
         * @return This builder for chaining
         */
        Builder type(ParticleType particleType);

        /**
         * Sets the value of the specified {@link ParticleOption}.
         *
         * @param option The option
         * @param value  The value
         * @return This builder for chaining
         * @throws IllegalArgumentException If the specified value isn't valid
         */
        <V> Builder option(ParticleOption<V> option, V value) throws IllegalArgumentException;

        /**
         * Sets the velocity of the particle effect.
         *
         * <p>The default velocity is {@link Vector3d#ZERO}.</p>
         *
         * @param velocity The velocity
         * @return This builder for chaining
         */
        default Builder velocity(Vector3d velocity) {
            return option(ParticleOptions.VELOCITY, velocity);
        }

        /**
         * Sets the offset of the particle effect.
         *
         * <p>The default offset is {@link Vector3d#ZERO}.</p>
         *
         * @param offset The offset
         * @return This builder for chaining
         */
        default Builder offset(Vector3d offset) {
            return option(ParticleOptions.OFFSET, offset);
        }

        /**
         * Sets the amount of particles of the particle effect.
         *
         * <p>The default quantity is 1.</p>
         *
         * @param quantity The quantity particles
         * @return This builder, for chaining
         * @throws IllegalArgumentException If the quantity is less than one
         */
        default Builder quantity(int quantity) throws IllegalArgumentException {
            return option(ParticleOptions.QUANTITY, quantity);
        }

        /**
         * Builds an instance of a ParticleEffect.
         *
         * @return A new instance of a ParticleEffect
         */
        ParticleEffect build();
    }
}
