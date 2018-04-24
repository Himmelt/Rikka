package rikka.api.effect.potion;

import rikka.api.CatalogType;
import rikka.api.text.translation.Translatable;
import rikka.api.text.translation.Translation;

public interface PotionEffectType extends CatalogType, Translatable {
    boolean isInstant();

    Translation getPotionTranslation();
}
