package rikka.api.item.enchantment;

import rikka.api.CatalogType;

public enum EnchantmentType implements CatalogType {

    AQUA_AFFINITY,
    BANE_OF_ARTHROPODS,
    BINDING_CURSE,
    BLAST_PROTECTION,
    DEPTH_STRIDER,
    EFFICIENCY,
    FEATHER_FALLING,
    FIRE_ASPECT,
    FIRE_PROTECTION,
    FLAME,
    FORTUNE,
    FROST_WALKER,
    INFINITY,
    KNOCKBACK,
    LOOTING,
    LUCK_OF_THE_SEA,
    LURE,
    MENDING,
    POWER,
    PROJECTILE_PROTECTION,
    PROTECTION,
    PUNCH,
    RESPIRATION,
    SHARPNESS,
    SILK_TOUCH,
    SMITE,
    SWEEPING,
    THORNS,
    UNBREAKING,
    VANISHING_CURSE;

    public int weight;

    public int minimumLevel;

    public int maximumLevel;

    public String getId() {
        return null;
    }

    public String getName() {
        return null;
    }
}
