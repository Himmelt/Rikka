package rikka.api.effect.potion;

public interface PotionEffect {

    static PotionEffect of(PotionEffectType type, int amplifier, int duration) {
        return null;
    }

    PotionEffectType getType();

    int getDuration();

    int getAmplifier();

    boolean isAmbient();

    boolean getShowParticles();

}
