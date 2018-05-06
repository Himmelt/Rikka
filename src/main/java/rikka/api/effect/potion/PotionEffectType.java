package rikka.api.effect.potion;

import rikka.api.CatalogType;
import rikka.api.text.translation.RTranslatable;
import rikka.api.text.translation.Translation;

public interface PotionEffectType extends CatalogType, RTranslatable {
    boolean isInstant();

    Translation getPotionTranslation();
}
