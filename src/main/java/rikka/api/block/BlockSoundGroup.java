package rikka.api.block;

import rikka.api.effect.sound.SoundType;

public interface BlockSoundGroup {
    double getVolume();

    double getPitch();

    SoundType getBreakSound();

    SoundType getStepSound();

    SoundType getPlaceSound();

    SoundType getHitSound();

    SoundType getFallSound();
}
