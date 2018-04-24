package rikka.api.effect.potion;

import rikka.api.data.DataSerializable;
import rikka.api.data.persistence.DataBuilder;
import rikka.api.data.property.PropertyHolder;

public interface PotionEffect extends DataSerializable, PropertyHolder {

    static PotionEffect of(PotionEffectType type, int amplifier, int duration) {
        //builder().potionType(type).amplifier(amplifier).duration(duration).build();
        return null;
    }

    PotionEffectType getType();

    int getDuration();

    int getAmplifier();

    boolean isAmbient();

    boolean getShowParticles();

    interface Builder extends DataBuilder<PotionEffect> {

        @Override
        Builder from(PotionEffect potionEffect);

        /**
         * Sets the {@link PotionEffectType} of the potion.
         *
         * @param potionEffectType The type of item
         * @return This builder, for chaining
         */
        Builder potionType(PotionEffectType potionEffectType);

        /**
         * Sets the duration in ticks of the potion effect.
         *
         * @param duration The duration in ticks of this effect
         * @return This builder, for chaining
         */
        Builder duration(int duration);

        /**
         * Sets the amplifier power of the potion effect.
         *
         * <p>Amplifiers must be above zero.</p>
         *
         * @param amplifier The amplifier power
         * @return This builder, for chaining
         * @throws IllegalArgumentException If the amplifier is less than zero
         */
        Builder amplifier(int amplifier) throws IllegalArgumentException;

        /**
         * Sets the potion effect to be ambient or not.
         *
         * @param ambience Whether the potion effect is ambient
         * @return This builder, for chaining
         */
        Builder ambience(boolean ambience);

        /**
         * Sets the potion effect to show particles when applied or not.
         *
         * @param showsParticles Whether the potion effect will show particles
         * @return This builder, for chaining
         */
        Builder particles(boolean showsParticles);

        /**
         * Builds an instance of a PotionEffect.
         *
         * @return A new instance of a PotionEffect
         * @throws IllegalStateException If the potion effect is not completed
         */
        PotionEffect build() throws IllegalStateException;

        @Override
        Builder reset();
    }

}
