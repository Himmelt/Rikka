package rikka.api.entity;

import org.bukkit.entity.*;
import org.bukkit.entity.minecart.CommandMinecart;
import org.bukkit.entity.minecart.HopperMinecart;
import org.spongepowered.api.entity.explosive.PrimedTNT;
import org.spongepowered.api.entity.living.Human;
import org.spongepowered.api.entity.living.animal.Mooshroom;
import org.spongepowered.api.entity.living.complex.ComplexLivingPart;
import org.spongepowered.api.entity.living.golem.SnowGolem;
import org.spongepowered.api.entity.living.monster.ZombiePigman;
import org.spongepowered.api.entity.projectile.EyeOfEnder;
import org.spongepowered.api.entity.vehicle.minecart.*;
import org.spongepowered.api.entity.weather.Lightning;
import org.spongepowered.api.entity.weather.WeatherEffect;

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
    COMPLEX_PART("complex_part", ComplexEntityPart.class, ComplexLivingPart.class),
    COW("cow", Cow.class, org.spongepowered.api.entity.living.animal.Cow.class),
    CREEPER("creeper", Creeper.class, org.spongepowered.api.entity.living.monster.Creeper.class),
    DONKEY("donkey", Donkey.class, org.spongepowered.api.entity.living.animal.Donkey.class),
    DRAGON_FIREBALL("dragon_fireball", DragonFireball.class, org.spongepowered.api.entity.projectile.explosive.DragonFireball.class),
    EGG("egg", Egg.class, org.spongepowered.api.entity.projectile.Egg.class),
    // TODO check
    ELDER_GUARDIAN("elder_guardian", ElderGuardian.class, org.spongepowered.api.entity.living.monster.Guardian.class),
    ENDERMAN("enderman", Enderman.class, org.spongepowered.api.entity.living.monster.Enderman.class),
    ENDERMITE("endermite", Endermite.class, org.spongepowered.api.entity.living.monster.Endermite.class),
    ENDER_CRYSTAL("ender_crystal", EnderCrystal.class, org.spongepowered.api.entity.EnderCrystal.class),
    ENDER_DRAGON("ender_dragon", EnderDragon.class, org.spongepowered.api.entity.living.complex.EnderDragon.class),
    ENDER_PEARL("ender_pearl", EnderPearl.class, org.spongepowered.api.entity.projectile.EnderPearl.class),
    // TODO check
    EVOCATION_FANGS("evocation_fangs", EvokerFangs.class, org.spongepowered.api.entity.living.monster.Evoker.class),
    // TODO check
    // EVOCATION_ILLAGER,
    EXPERIENCE_ORB("exp_orb", ExperienceOrb.class, org.spongepowered.api.entity.ExperienceOrb.class),
    // TODO check
    EYE_OF_ENDER("eye_of_ender", null, EyeOfEnder.class),
    FALLING_BLOCK("falling_block", FallingBlock.class, org.spongepowered.api.entity.FallingBlock.class),
    FIREBALL("fireball", Fireball.class, org.spongepowered.api.entity.projectile.explosive.fireball.Fireball.class),
    FIREWORK("firework", Firework.class, org.spongepowered.api.entity.projectile.Firework.class),
    FISH_HOOK("fish_hook", FishHook.class, org.spongepowered.api.entity.projectile.FishHook.class),
    // TODO check
    FURNACE_MINECART("furnace_minecart", null, FurnaceMinecart.class),
    GHAST("ghast", Ghast.class, org.spongepowered.api.entity.living.monster.Ghast.class),
    GIANT("giant", Giant.class, org.spongepowered.api.entity.living.monster.Giant.class),
    GUARDIAN("guardian", Guardian.class, org.spongepowered.api.entity.living.monster.Guardian.class),
    HOPPER_MINECART("hopper_minecart", HopperMinecart.class, org.spongepowered.api.entity.vehicle.minecart.HopperMinecart.class),
    HORSE("horse", Horse.class, org.spongepowered.api.entity.living.animal.Horse.class),
    // TODO Human Humanoid
    HUMAN("human", HumanEntity.class, Human.class),
    HUSK("husk", Husk.class, org.spongepowered.api.entity.living.monster.Husk.class),
    ILLUSIONER("illusioner", Illusioner.class, org.spongepowered.api.entity.living.monster.Illusioner.class),
    IRON_GOLEM("iron_golem", IronGolem.class, org.spongepowered.api.entity.living.golem.IronGolem.class),
    ITEM("item", Item.class, org.spongepowered.api.entity.Item.class),
    ITEM_FRAME("item_frame", ItemFrame.class, org.spongepowered.api.entity.hanging.ItemFrame.class),
    LEASH_HITCH("leash_hitch", LeashHitch.class, org.spongepowered.api.entity.hanging.LeashHitch.class),
    LIGHTNING("lighting", LightningStrike.class, Lightning.class),
    LLAMA("llama", Llama.class, org.spongepowered.api.entity.living.animal.Llama.class),
    LLAMA_SPIT("llama_spit", LlamaSpit.class, org.spongepowered.api.entity.projectile.LlamaSpit.class),
    MAGMA_CUBE("magma_cube", MagmaCube.class, org.spongepowered.api.entity.living.monster.MagmaCube.class),
    // TODO check
    MOB_SPAWNER_MINECART("mob_spawner_minecart", null, MobSpawnerMinecart.class),
    MULE("mule", Mule.class, org.spongepowered.api.entity.living.animal.Mule.class),
    MUSHROOM_COW("mushroom", MushroomCow.class, Mooshroom.class),
    OCELOT("ocelot", Ocelot.class, org.spongepowered.api.entity.living.animal.Ocelot.class),
    PAINTING("painting", Painting.class, org.spongepowered.api.entity.hanging.Painting.class),
    PARROT("parrot", Parrot.class, org.spongepowered.api.entity.living.animal.Parrot.class),
    PIG("pig", Pig.class, org.spongepowered.api.entity.living.animal.Pig.class),
    PIG_ZOMBIE("pig_zombie", PigZombie.class, ZombiePigman.class),
    PLAYER("player", Player.class, org.spongepowered.api.entity.living.player.Player.class),
    POLAR_BEAR("polar_bear", PolarBear.class, org.spongepowered.api.entity.living.animal.PolarBear.class),
    PRIMED_TNT("primed_tnt", TNTPrimed.class, PrimedTNT.class),
    RABBIT("rabbit", Rabbit.class, org.spongepowered.api.entity.living.animal.Rabbit.class),
    // TODO check
    // RIDEABLE_MINECART,
    SHEEP("sheep", Sheep.class, org.spongepowered.api.entity.living.animal.Sheep.class),
    SHULKER("shulker", Shulker.class, org.spongepowered.api.entity.living.golem.Shulker.class),
    SHULKER_BULLET("shulker_bullet", ShulkerBullet.class, org.spongepowered.api.entity.ShulkerBullet.class),
    SILVERFISH("silverfish", Silverfish.class, org.spongepowered.api.entity.living.monster.Silverfish.class),
    SKELETON("skeleton", Skeleton.class, org.spongepowered.api.entity.living.monster.Skeleton.class),
    SKELETON_HORSE("skeleton_horse", SkeletonHorse.class, org.spongepowered.api.entity.living.animal.SkeletonHorse.class),
    SLIME("slime", Slime.class, org.spongepowered.api.entity.living.monster.Slime.class),
    SMALL_FIREBALL("small_fireball", SmallFireball.class, org.spongepowered.api.entity.projectile.explosive.fireball.SmallFireball.class),
    SNOWBALL("snowball", Snowball.class, org.spongepowered.api.entity.projectile.Snowball.class),
    SNOWMAN("snowman", Snowman.class, SnowGolem.class),
    SPECTRAL_ARROW("spectral_arrow", SpectralArrow.class, org.spongepowered.api.entity.projectile.arrow.SpectralArrow.class),
    SPIDER("spider", Spider.class, org.spongepowered.api.entity.living.monster.Spider.class),
    // TODO check
    SPLASH_POTION("splash_potion", SplashPotion.class, null),
    SQUID("squid", Squid.class, org.spongepowered.api.entity.living.Squid.class),
    STRAY("stray", Stray.class, org.spongepowered.api.entity.living.monster.Stray.class),
    THROWN_EXP_BOTTLE("exp_bottle", ThrownExpBottle.class, org.spongepowered.api.entity.projectile.ThrownExpBottle.class),
    TIPPED_ARROW("tipped_arrow", TippedArrow.class, org.spongepowered.api.entity.projectile.arrow.TippedArrow.class),
    // TODO check
    TNT_MINECART("tnt_minecart", null, TNTMinecart.class),
    VEX("vex", Vex.class, org.spongepowered.api.entity.living.monster.Vex.class),
    VILLAGER("villager", Villager.class, org.spongepowered.api.entity.living.Villager.class),
    VINDICATOR("vindicator", Vindicator.class, org.spongepowered.api.entity.living.monster.Vindicator.class),
    WEATHER("weather", Weather.class, WeatherEffect.class),
    WITCH("witch", Witch.class, org.spongepowered.api.entity.living.monster.Witch.class),
    WITHER("wither", Wither.class, org.spongepowered.api.entity.living.monster.Wither.class),
    WITHER_SKELETON("wither_skeleton", WitherSkeleton.class, org.spongepowered.api.entity.living.monster.WitherSkeleton.class),
    WITHER_SKULL("wither_skull", WitherSkull.class, org.spongepowered.api.entity.projectile.explosive.WitherSkull.class),
    WOLF("wolf", Wolf.class, org.spongepowered.api.entity.living.animal.Wolf.class),
    ZOMBIE("zombie", Zombie.class, org.spongepowered.api.entity.living.monster.Zombie.class),
    ZOMBIE_HORSE("zombie_horse", ZombieHorse.class, org.spongepowered.api.entity.living.animal.ZombieHorse.class),
    ZOMBIE_VILLAGER("zombie_villager", ZombieVillager.class, org.spongepowered.api.entity.living.monster.ZombieVillager.class),
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
