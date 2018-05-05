package rikka.api.entity;

import rikka.api.text.translation.Translatable;
import rikka.api.text.translation.Translation;

public enum EntityType implements Translatable {
    AREA_EFFECT_CLOUD("area_effect_cloud", org.bukkit.entity.AreaEffectCloud.class, org.spongepowered.api.entity.AreaEffectCloud.class),
    ARMOR_STAND("armor_stand"),
    BAT,
    BLAZE,
    BOAT,
    CAVE_SPIDER,
    CHESTED_MINECART,
    CHICKEN,
    OMMANDBLOCK_MINECART,
    COMPLEX_PART,
    COW,
    CREEPER,
    DONKEY,
    DRAGON_FIREBALL,
    EGG,
    ELDER_GUARDIAN,
    ENDERMAN,
    ENDERMITE,
    ENDER_CRYSTAL,
    ENDER_DRAGON,
    ENDER_PEARL,
    EVOCATION_FANGS,
    EVOCATION_ILLAGER,
    EXPERIENCE_ORB,
    EYE_OF_ENDER,
    FALLING_BLOCK,
    FIREBALL,
    FIREWORK,
    FISHING_HOOK,
    FURNACE_MINECART,
    GHAST,
    GIANT,
    GUARDIAN,
    HOPPER_MINECART,
    HORSE,
    HUMAN,
    HUSK,
    ILLUSION_ILLAGER,
    IRON_GOLEM,
    ITEM,
    ITEM_FRAME,
    LEASH_HITCH,
    LIGHTNING,
    LLAMA,
    LLAMA_SPIT,
    MAGMA_CUBE,
    MOB_SPAWNER_MINECART,
    MULE,
    MUSHROOM_COW,
    OCELOT,
    PAINTING,
    PARROT,
    PIG,
    PIG_ZOMBIE,
    PLAYER,
    POLAR_BEAR,
    PRIMED_TNT,
    RABBIT,
    RIDEABLE_MINECART,
    SHEEP,
    SHULKER,
    SHULKER_BULLET,
    SILVERFISH,
    SKELETON,
    SKELETON_HORSE,
    SLIME,
    SMALL_FIREBALL,
    SNOWBALL,
    SNOWMAN,
    SPECTRAL_ARROW,
    SPIDER,
    SPLASH_POTION,
    SQUID,
    STRAY,
    THROWN_EXP_BOTTLE,
    TIPPED_ARROW,
    TNT_MINECART,
    UNKNOWN,
    VEX,
    VILLAGER,
    VINDICATION_ILLAGER,
    WEATHER,
    WITCH,
    WITHER,
    WITHER_SKELETON,
    WITHER_SKULL,
    WOLF,
    ZOMBIE,
    ZOMBIE_HORSE,
    ZOMBIE_VILLAGER;

    EntityType(String id, Class<? extends org.bukkit.entity.Entity> bukkitClass, Class<? extends org.spongepowered.api.entity.Entity> spongeClass) {

    }

    public static <T extends org.bukkit.entity.Entity> EntityType getType(T source) {
        source.getType();
        return null;
    }

    public static <T extends org.spongepowered.api.entity.Entity> EntityType getType(T source) {
        String id = source.getType().getId();
        return null;
    }

    public Translation getTranslation() {
        return null;
    }

}
