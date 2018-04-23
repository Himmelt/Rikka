package org.soraworld.rikka.effect.potion;

import org.soraworld.rikka.CatalogType;
import org.soraworld.rikka.text.translation.Translatable;
import org.soraworld.rikka.text.translation.Translation;

public interface PotionEffectType extends CatalogType, Translatable {
    boolean isInstant();

    Translation getPotionTranslation();
}
