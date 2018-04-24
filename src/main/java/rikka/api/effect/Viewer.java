package rikka.api.effect;

import rikka.api.block.BlockState;
import rikka.api.effect.particle.ParticleEffect;
import rikka.api.effect.sound.SoundCategory;
import rikka.api.effect.sound.SoundType;
import rikka.api.effect.sound.record.RecordType;
import rikka.api.text.BookView;
import rikka.api.text.title.Title;
import rikka.api.util.math.Vector3d;
import rikka.api.util.math.Vector3i;

public interface Viewer {

    void spawnParticles(ParticleEffect particleEffect, Vector3d position);

    void spawnParticles(ParticleEffect particleEffect, Vector3d position, int radius);

    default void playSound(SoundType sound, Vector3d position, double volume) {
        this.playSound(sound, SoundCategory.MASTER, position, volume);
    }

    void playSound(SoundType sound, SoundCategory category, Vector3d position, double volume);

    default void playSound(SoundType sound, Vector3d position, double volume, double pitch) {
        this.playSound(sound, SoundCategory.MASTER, position, volume, pitch);
    }

    void playSound(SoundType sound, SoundCategory category, Vector3d position, double volume, double pitch);

    default void playSound(SoundType sound, Vector3d position, double volume, double pitch, double minVolume) {
        this.playSound(sound, SoundCategory.MASTER, position, volume, pitch, minVolume);
    }

    void playSound(SoundType sound, SoundCategory category, Vector3d position, double volume, double pitch, double minVolume);

    void stopSounds();

    void stopSounds(SoundType sound);

    void stopSounds(SoundCategory category);

    void stopSounds(SoundType sound, SoundCategory category);

    void playRecord(Vector3i position, RecordType recordType);

    void stopRecord(Vector3i position);

    void sendTitle(Title title);

    default void resetTitle() {
        sendTitle(Title.RESET);
    }

    default void clearTitle() {
        sendTitle(Title.CLEAR);
    }

    void sendBookView(BookView bookView);

    default void sendBlockChange(Vector3i vec, BlockState state) {
        this.sendBlockChange(vec.x, vec.y, vec.z, state);
    }

    void sendBlockChange(int x, int y, int z, BlockState state);

    default void resetBlockChange(Vector3i vec) {
        this.resetBlockChange(vec.x, vec.y, vec.z);
    }

    void resetBlockChange(int x, int y, int z);

}
