/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package rikka.api.data.manipulator.catalog;

import rikka.api.block.BlockState;
import rikka.api.data.manipulator.DataManipulator;
import rikka.api.data.manipulator.mutable.*;
import rikka.api.data.manipulator.mutable.entity.*;
import rikka.api.data.type.*;
import rikka.api.effect.potion.PotionEffect;
import rikka.api.entity.ExperienceOrb;
import rikka.api.entity.FallingBlock;
import rikka.api.entity.IEntity;
import rikka.api.entity.Item;
import rikka.api.entity.explosive.Explosive;
import rikka.api.entity.hanging.ItemFrame;
import rikka.api.entity.hanging.Painting;
import rikka.api.entity.living.*;
import rikka.api.entity.living.animal.*;
import rikka.api.entity.living.golem.IronGolem;
import rikka.api.entity.living.monster.*;
import rikka.api.entity.living.player.IPlayer;
import rikka.api.entity.living.player.User;
import rikka.api.entity.living.player.gamemode.GameMode;
import rikka.api.entity.projectile.EyeOfEnder;
import rikka.api.entity.projectile.Firework;
import rikka.api.entity.projectile.Projectile;
import rikka.api.entity.projectile.Snowball;
import rikka.api.entity.projectile.arrow.Arrow;
import rikka.api.entity.vehicle.minecart.Minecart;
import rikka.api.item.FireworkEffect;
import rikka.api.item.inventory.ItemStack;
import rikka.api.item.merchant.TradeOffer;
import rikka.api.statistic.Statistic;
import rikka.api.world.weather.Weather;

/**
 * An enumeration of all known vanilla {@link DataManipulator}s that may be
 * applicable to any {@link IEntity}.
 */
public final class CatalogEntityData {

    /**
     * The {@link AgeableData} that represents age determining whether an
     * {@link IEntity} is a child or an adult. Always exists for
     * {@link Ageable} entities.
     */
    public static final Class<AgeableData> AGEABLE_DATA = AgeableData.class;
    /**
     * The {@link AgentData} that signifies that an {@link Agent}'s AI is
     * enabled.
     */
    public static final Class<AgentData> AGENT_DATA = AgentData.class;
    /**
     * The {@link AggressiveData} that signifies whether an {@link Agent} is
     * considered aggressive, may attack other entities.
     */
    public static final Class<AggressiveData> AGGRESSIVE_DATA = AggressiveData.class;
    /**
     * The {@link AngerableData} that signifies an {@link Agent} is angry but
     * will calm down after a certain amount of time has passed.
     */
    public static final Class<AngerableData> ANGERABLE_DATA = AngerableData.class;
    /**
     * The {@link ArtData} that signifies what piece of {@link Art} is being
     * displayed. It is applicable for {@link Painting} entities.
     */
    public static final Class<ArtData> ART_DATA = ArtData.class;

    /**
     * Represents the mapped rotational data for all known body parts. Usually
     * applicable to {@link Humanoid}s and {@link ArmorStand}s.
     */
    public static final Class<BodyPartRotationalData> BODY_PART_ROTATIONAL_DATA = BodyPartRotationalData.class;
    /**
     * Entities that have {@link BreathingData} when under water. Usually
     * applies to {@link ILiving} entities but not {@link IAquatic} entities.
     */
    public static final Class<BreathingData> BREATHING_DATA = BreathingData.class;
    /**
     * Signifies an entity is ready to breed. Usually applies to
     * {@link IAnimal}s, or sometimes for {@link IZombie}s to call
     * reinforcements.
     */
    public static final Class<BreedableData> BREEDABLE_DATA = BreedableData.class;
    /**
     * Mainly for {@link Villager}s to determine their applicable
     * {@link TradeOffer}s.
     */
    public static final Class<CareerData> CAREER_DATA = CareerData.class;
    /**
     * Represents whether an entity is considered "charged". Usually applies
     * to {@link ICreeper}s.
     */
    public static final Class<ChargedData> CHARGED_DATA = ChargedData.class;
    /**
     * Signifies that an entity will perform a "critical hit" the next attack.
     * Usually applies to {@link Arrow}s.
     */
    public static final Class<CriticalHitData> CRITICAL_HIT_DATA = CriticalHitData.class;
    /**
     * Signifies that an entity can take damage and tracks it's last damage
     * source. Usually applies to {@link ILiving} entities.
     */
    public static final Class<DamageableData> DAMAGEABLE_DATA = DamageableData.class;
    /**
     * Signifies that an owner is going to deal a certain amount of damage
     * on the next "attack". Usually applicable to {@link Arrow}s and other
     * {@link Projectile}s.
     */
    public static final Class<DamagingData> DAMAGING_DATA = DamagingData.class;
    /**
     * Represents the custom name of an entity. Usually applies to
     * {@link IPlayer}s and {@link ILiving} entities.
     */
    public static final Class<DisplayNameData> DISPLAY_NAME_DATA = DisplayNameData.class;
    /**
     * Represents the dominant {@link HandPreference} used by an entity for for "main"
     * interactions such as such as tool use or block breaking. Usually
     * applicable to {@link ILiving} entities.
     */
    public static final Class<DominantHandData> DOMINANT_HAND_DATA = DominantHandData.class;
    /**
     * Signifies that the entity can be dyed a specific {@link DyeColor}.
     * Usually applies to {@link ISheep}.
     */
    public static final Class<DyeableData> DYEABLE_DATA = DyeableData.class;
    /**
     * Signifies that an entity can hold "experience". Usually applies to
     * {@link IPlayer}s.
     */
    public static final Class<ExperienceHolderData> EXPERIENCE_HOLDER_DATA = ExperienceHolderData.class;
    /**
     * Signifies that an entity can expire after a certain amount of time.
     * Usually applies to {@link Weather}, {@link IEndermite}s, and
     * {@link Item}s.
     */
    public static final Class<ExpirableData> EXPIRABLE_DATA_CLASS = ExpirableData.class;
    /**
     * Represents the "explosion radius" that an entity will have upon
     * detonation. Usually applies to all {@link Explosive}s.
     */
    public static final Class<ExplosionRadiusData> EXPLOSIVE_RADIUS_DATA = ExplosionRadiusData.class;
    /**
     * Represents a falling block that can deal damage upon landing.
     * Applies to {@link FallingBlock}s.
     */
    public static final Class<FallingBlockData> FALLING_BLOCK_DATA = FallingBlockData.class;
    /**
     * Represents the {@link FireworkEffect}s that a {@link Firework} will have
     * upon detonation.
     */
    public static final Class<FireworkEffectData> FIREWORK_EFFECT_DATA = FireworkEffectData.class;
    /**
     * Represents the flight time of a {@link Firework}.
     */
    public static final Class<FireworkRocketData> FIREWORK_ROCKET_DATA = FireworkRocketData.class;
    /**
     * Represents when an entity is considering to be "flying". Applicable for
     * almost all types of {@link IEntity}.
     */
    public static final Class<FlyingData> FLYING_DATA = FlyingData.class;
    /**
     * Represents the saturation, exhaustion, and food level for an entity.
     * Usually applicable to {@link IPlayer}s.
     */
    public static final Class<FoodData> FOOD_DATA = FoodData.class;
    /**
     * Represents the expiring "fuse" duration on an explosive entity before
     * the {@link Explosive} detonates.
     */
    public static final Class<FuseData> FUSE_DATA = FuseData.class;
    /**
     * Signifies that an entity has a {@link GameMode}. Usually applies to
     * {@link IPlayer}s.
     */
    public static final Class<GameModeData> GAME_MODE_DATA = GameModeData.class;
    /**
     * Represents that an entity has a glowing outline. Few entities, such
     * as {@link Snowball}, do not show this glow.
     * <!-- TODO: Find all non-effected entities -->
     */
    public static final Class<GlowingData> GLOWING_DATA = GlowingData.class;
    /**
     * Signifies that an entity will ignore gravity. Usually applies to all
     * known types of entities.
     */
    public static final Class<GravityData> GRAVITY_DATA = GravityData.class;
    /**
     * Signifies that an entity can modify blocks in the world. Usually applies
     * to {@link IEnderman} and {@link Humanoid}s.
     */
    public static final Class<GriefingData> GRIEFING_DATA = GriefingData.class;
    /**
     * Signifies that an entity can have health and dies upon the depletion
     * of health. Usually applies to all {@link ILiving} entities.
     */
    public static final Class<HealthData> HEALTH_DATA = HealthData.class;
    /**
     * Represents a {@link IRideableHorse}s specific data, such as {@link HorseStyle},
     * and {@link HorseColor}.
     */
    public static final Class<HorseData> HORSE_DATA = HorseData.class;
    /**
     * Represents that an entity is self igniting. Usually applies to
     * {@link IBlaze}.
     */
    public static final Class<IgniteableData> IGNITEABLE_DATA = IgniteableData.class;
    /**
     * Signifies that an entity is rendered vanish. Usually applies to all
     * known types of {@link ILiving} entities.
     */
    public static final Class<InvisibilityData> INVISIBILITY_DATA = InvisibilityData.class;
    /**
     * Represents whether an entity is exhibiting "johnny" behavior. In vanilla
     * this is only applicable to {@link IVindicator}s.
     */
    public static final Class<JohnnyData> JOHNNY_DATA = JohnnyData.class;
    /**
     * Represents the specific information of an initial joined time on the
     * server. Usually applicable to {@link IPlayer}s and {@link User}s.
     */
    public static final Class<JoinData> JOIN_DATA = JoinData.class;
    /**
     * Represents the "level" of knockback an entity will perform in the
     * next attack. Usually applicable to {@link Arrow}s.
     */
    public static final Class<KnockbackData> KNOCKBACK_DATA = KnockbackData.class;
    /**
     * Represents the information for the {@link IEntity} leashing another
     * {@link IEntity}. Usually applicable to {@link ILiving} entities.
     */
    public static final Class<LeashData> LEASH_DATA = LeashData.class;
    /**
     * Represents the target location an entity is either guided or aiming
     * towards. Usually applicable for {@link EyeOfEnder}s.
     */
    public static final Class<TargetedLocationData> LOCATION_DATA = TargetedLocationData.class;
    /**
     * Represents a {@link Minecart} with a {@link BlockState} shown inside.
     */
    public static final Class<MinecartBlockData> MINECART_BLOCK_DATA = MinecartBlockData.class;
    /**
     * Represents the {@link OcelotType} of an {@link IOcelot}.
     */
    public static final Class<OcelotData> OCELOT_DATA = OcelotData.class;
    /**
     * Represents the amount of "experience" an {@link ExperienceOrb}
     * contains.
     */
    public static final Class<ExpOrbData> ORB_DATA = ExpOrbData.class;
    /**
     * Signifies that an entity is a "passenger" riding another {@link IEntity}.
     * Usually applicable for all {@link IEntity}.
     */
    public static final Class<PassengerData> PASSENGER_DATA = PassengerData.class;
    /**
     * Signifies that an entity will "persist" in the world data. Usually
     * applicable to all {@link IEntity}.
     */
    public static final Class<PersistingData> PERSISTING_DATA = PersistingData.class;
    /**
     * Signifies that an entity was created by a {@link IPlayer}. Usually
     * applicable to {@link IronGolem}s.
     */
    public static final Class<PlayerCreatedData> PLAYER_CREATED_DATA = PlayerCreatedData.class;
    /**
     * Signifies that an entity is "playing". Usually applicable to
     * {@link Villager}s.
     */
    public static final Class<PlayingData> PLAYING_DATA = PlayingData.class;
    /**
     * Signifies that an entity is currently affected by some variety of
     * {@link PotionEffect}s. Applicable to all {@link IEntity}.
     */
    public static final Class<PotionEffectData> POTION_EFFECT_DATA = PotionEffectData.class;
    /**
     * Represents the {@link RabbitType} of a {@link IRabbit}.
     */
    public static final Class<RabbitData> RABBIT_DATA = RabbitData.class;
    /**
     * Signifies that an entity is representing an {@link ItemStack}.
     * Usually applicable to {@link Item}s and {@link ItemFrame}s.
     */
    public static final Class<RepresentedItemData> REPRESENTED_ITEM_DATA = RepresentedItemData.class;
    /**
     * Signifies that an entity will respawn after death and has a respawn
     * location. Usually applicable to {@link IPlayer}s.
     */
    public static final Class<RespawnLocationData> RESPAWN_LOCATION_DATA = RespawnLocationData.class;
    /**
     * Signifies that an entity has a "saddle". Usually applicable to
     * {@link Pig}s.
     */
    public static final Class<PigSaddleData> PIG_SADDLE_DATA = PigSaddleData.class;
    /**
     * Signifies that an entity is currently "screaming". Usually applicable
     * to {@link IEnderman}.
     */
    public static final Class<ScreamingData> SCREAMING_DATA = ScreamingData.class;
    /**
     * Signifies that an entity is currently "silent", and will play no sounds.
     * Usually applicable to all {@link IEntity Entities}.
     */
    public static final Class<SilentData> SILENT_DATA = SilentData.class;
    /**
     * Signifies that an entity will "shatter" upon expiration. Usually
     * applicable to {@link EyeOfEnder}.
     */
    public static final Class<ShatteringData> SHATTERING_DATA = ShatteringData.class;
    /**
     * Signifies that an entity is currently "sheared" and will regrow at some
     * point. Usually applicable to {@link ISheep}.
     */
    public static final Class<ShearedData> SHEARED_DATA = ShearedData.class;
    /**
     * Signifies that an entity is currently sitting. Usually applicable to
     * {@link IWolf} and {@link IOcelot}s.
     */
    public static final Class<SittingData> SITTING_DATA = SittingData.class;
    /**
     * Represents the base and height sizes of an entity if it has physical
     * form. Usually applies to all types of {@link IEntity}.
     */
    public static final Class<SizeData> SIZE_DATA = SizeData.class;
    /**
     * Signifies that the owner is currently "sleeping". This will usually
     * apply to {@link Humanoid}s and {@link Bat}s.
     */
    public static final Class<SleepingData> SLEEPING_DATA = SleepingData.class;
    /**
     * Represents the size of a {@link ISlime}. Usually applicable to all
     * {@link ISlime}s and {@link IMagmaCube}s.
     */
    public static final Class<SlimeData> SLIME_DATA = SlimeData.class;
    /**
     * Signifies that an entity is currently "sneaking". Usually applicable to
     * {@link IPlayer}s.
     */
    public static final Class<SneakingData> SNEAKING_DATA = SneakingData.class;
    /**
     * Represents the container of all known applied {@link Statistic}s. Usually
     * applicable to {@link IPlayer}s and {@link User}s.
     */
    public static final Class<StatisticData> STATISTIC_DATA = StatisticData.class;
    /**
     * Signifies that an entity is "tamed" and has an owner. Usually applicable
     * to {@link IRideableHorse}s, {@link IOcelot}s, and {@link IWolf} entities.
     */
    public static final Class<TameableData> TAMEABLE_DATA = TameableData.class;
    /**
     * Signifies that an entity is currently being ridden by another
     * {@link IEntity}.
     */
    public static final Class<VehicleData> VEHICLE_DATA = VehicleData.class;
    /**
     * Represents the current velocity of an entity. Applicable to all
     * {@link IEntity}.
     */
    public static final Class<VelocityData> VELOCITY_DATA = VelocityData.class;
    /**
     * Signifies that an entity is currently "wet". Usually applicable to
     * {@link IWolf} entities.
     */
    public static final Class<WetData> WET_DATA = WetData.class;

    private CatalogEntityData() {
    }

}
