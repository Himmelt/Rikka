package rikka.api.effect.sound.record;

import rikka.api.CatalogType;
import rikka.api.effect.sound.SoundType;

public interface RecordType extends CatalogType {
    SoundType getSound();
}
