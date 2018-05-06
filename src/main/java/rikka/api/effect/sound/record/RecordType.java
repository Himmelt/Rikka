package rikka.api.effect.sound.record;

import rikka.api.CatalogType;
import rikka.api.effect.sound.SoundType;
import rikka.api.text.translation.RTranslatable;

public interface RecordType extends CatalogType, RTranslatable {
    SoundType getSound();
}
