package org.soraworld.rikka.effect.sound.record;

import org.soraworld.rikka.CatalogType;
import org.soraworld.rikka.effect.sound.SoundType;
import org.soraworld.rikka.text.translation.Translatable;

public interface RecordType extends CatalogType, Translatable {
    SoundType getSound();
}
