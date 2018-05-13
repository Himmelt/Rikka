package rikka.api.entity;

import org.bukkit.entity.Chicken;
import org.bukkit.entity.Entity;
import org.bukkit.entity.minecart.CommandMinecart;
import org.spongepowered.api.entity.vehicle.minecart.ChestMinecart;
import org.spongepowered.api.entity.vehicle.minecart.CommandBlockMinecart;

import javax.annotation.Nonnull;
import java.util.HashMap;

public enum EntityType {
    AREA_EFFECT_CLOUD("area_effect_cloud", org.bukkit.entity.AreaEffectCloud.class, org.spongepowered.api.entity.AreaEffectCloud.class),
    ARMOR_STAND("armor_stand", org.bukkit.entity.ArmorStand.class, org.spongepowered.api.entity.living.ArmorStand.class),
    BAT("bat", org.bukkit.entity.Bat.class, org.spongepowered.api.entity.living.Bat.class),
    BLAZE("blaze", org.bukkit.entity.Blaze.class, org.spongepowered.api.entity.living.monster.Blaze.class),
    BOAT("boat", org.bukkit.entity.Boat.class, org.spongepowered.api.entity.vehicle.Boat.class),
    CAVE_SPIDER("cave_spider", org.bukkit.entity.CaveSpider.class, org.spongepowered.api.entity.living.monster.CaveSpider.class),
    CHESTED_MINECART("chested_minecart", org.bukkit.entity.Minecart.class, ChestMinecart.class),
    CHICKEN("chicken", Chicken.class, org.spongepowered.api.entity.living.animal.Chicken.class),
    COMMANDBLOCK_MINECART("commandblock_minecart", CommandMinecart.class, CommandBlockMinecart.class),
    /*   COMPLEX_PART,
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
       ZOMBIE_VILLAGER,*/
    UNKNOWN("unknown", Entity.class, org.spongepowered.api.entity.Entity.class);

    private final String nameId;
    private final Class<? extends org.bukkit.entity.Entity> bukkitClass;
    private final Class<? extends org.spongepowered.api.entity.Entity> spongeClass;

    private static final HashMap<String, EntityType> nameIdMap = new HashMap<>();
    private static final HashMap<Class<? extends org.bukkit.entity.Entity>, EntityType> bukkitClassMap = new HashMap<>();
    private static final HashMap<Class<? extends org.spongepowered.api.entity.Entity>, EntityType> spongeClassMap = new HashMap<>();


    static {
        nameIdMap.clear();
        bukkitClassMap.clear();
        spongeClassMap.clear();
        for (EntityType type : values()) {
            bukkitClassMap.put(type.bukkitClass, type);
            spongeClassMap.put(type.spongeClass, type);
            if (type.nameId != null && !type.nameId.isEmpty()) {
                if (nameIdMap.containsKey(type.nameId)) {
                    throw new RuntimeException("Multi Map of EntityType nameId: " + type.nameId);
                }
                nameIdMap.put(type.nameId, type);
            }
        }
    }

    EntityType(String nameId, @Nonnull Class<? extends org.bukkit.entity.Entity> bukkitClass, @Nonnull Class<? extends org.spongepowered.api.entity.Entity> spongeClass) {
        this.nameId = nameId;
        this.bukkitClass = bukkitClass;
        this.spongeClass = spongeClass;
    }

    public static <T extends org.bukkit.entity.Entity> EntityType getType(T source) {
        return bukkitClassMap.getOrDefault(source.getClass(), UNKNOWN);
    }

    public static <T extends org.spongepowered.api.entity.Entity> EntityType getType(T source) {
        return spongeClassMap.getOrDefault(source.getClass(), UNKNOWN);
    }

}
