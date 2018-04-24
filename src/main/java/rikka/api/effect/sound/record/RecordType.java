package rikka.api.effect.sound.record;

import rikka.api.CatalogType;
import rikka.api.effect.sound.SoundType;
import rikka.api.text.translation.Translatable;

public interface RecordType extends CatalogType, Translatable {
    SoundType getSound();
}
