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
package rikka.api.world.gamerule;

import rikka.api.block.BlockTypes;
import rikka.api.block.tileentity.CommandBlock;
import rikka.api.entity.living.Bat;
import rikka.api.entity.living.IAgent;
import rikka.api.entity.living.Villager;
import rikka.api.entity.living.animal.IRabbit;
import rikka.api.entity.living.animal.ISheep;
import rikka.api.entity.living.complex.EnderDragon;
import rikka.api.entity.living.golem.SnowGolem;
import rikka.api.entity.living.monster.*;
import rikka.api.entity.living.player.IPlayer;
import rikka.api.entity.living.player.gamemode.GameModes;
import rikka.api.entity.vehicle.IBoat;
import rikka.api.entity.vehicle.minecart.IMinecart;

/**
 * An enumeration of all possible GameRule names in vanilla minecraft.
 */
public class DefaultGameRules {

    /**
     * If advancements should be announced to the server.
     *
     * <p>This is a boolean game rule, with a default value of {@code true}.</p>
     */
    public static final String ANNOUNCE_ADVANCEMENTS = "announceAdvancements";

    /**
     * Whether {@link CommandBlock}s should notify admins when
     * they perform commands.
     *
     * <p>This is a boolean game rule, with a default value of {@code true}.</p>
     */
    public static final String COMMAND_BLOCK_OUTPUT = "commandBlockOutput";

    /**
     * Whether the server should skip checking player speed when
     * the player is wearing elytra.
     *
     * <p>This is a boolean game rule, with a default value of
     * {@code false}.</p>
     */
    public static final String DISABLE_ELYTRA_MOVEMENT_CHECK = "disableElytraMovementCheck";

    /**
     * Whether the day-night cycle and moon phases progress.
     *
     * <p>This is a boolean game rule, with a default value of
     * {@code true}.</p>
     */
    public static final String DO_DAYLIGHT_CYCLE = "doDaylightCycle";

    /**
     * Whether entities that are not mobs should have drops.
     *
     * <p>This is a boolean game rule, with a default value of
     * {@code true}.</p>
     */
    public static final String DO_ENTITY_DROPS = "doEntityDrops";

    /**
     * Whether fire should spread and naturally extinguish.
     *
     * <p>This is a boolean game rule, with a default value of
     * {@code true}.</p>
     */
    public static final String DO_FIRE_TICK = "doFireTick";

    /**
     * Whether {@link IPlayer}s can only craft recipes they have unlocked.
     *
     * <p>This is a boolean game rule, with a default value of
     * {@code false}.</p>
     */
    public static final String DO_LIMITED_CRAFTING = "doLimitedCrafting";

    /**
     * Whether {@link IAgent}s should drop items.
     *
     * <p>This is a boolean game rule, with a default value of {@code true}.</p>
     */
    public static final String DO_MOB_LOOT = "doMobLoot";

    /**
     * Whether {@link IAgent}s should naturally spawn.
     *
     * <p>This is a boolean game rule, with a default value of {@code true}.</p>
     */
    public static final String DO_MOB_SPAWNING = "doMobSpawning";

    /**
     * Whether blocks should have drops.
     *
     * <p>This is a boolean game rule, with a default value of {@code true}.</p>
     */
    public static final String DO_TILE_DROPS = "doTileDrops";

    /**
     * Whether the weather will change.
     *
     * <p>This is a boolean game rule, with a default value of {@code true}.</p>
     */
    public static final String DO_WEATHER_CYCLE = "doWeatherCycle";

    /**
     * A function to be executed once per tick.
     *
     * <p>This is a string game rule, with a default value of {@code -}.</p>
     */
    public static final String GAME_LOOP_FUNCTION = "gameLoopFunction";

    /**
     * Whether {@link IPlayer}s should keep items in their inventory
     * after death.
     *
     * <p>This is a boolean game rule, with a default value of
     * {@code false}.</p>
     */
    public static final String KEEP_INVENTORY = "keepInventory";

    /**
     * Whether to log admin commands to server log.
     *
     * <p>This is a boolean game rule, with a default value of
     * {@code true}.</p>
     */
    public static final String LOG_ADMIN_COMMANDS = "logAdminCommands";

    /**
     * The total number of {@link BlockTypes#CHAIN_COMMAND_BLOCK chain command
     * blocks} that can run during a single tick.
     *
     * <p>This is a numerical game rule, with a default value
     * of {@code 65536}.</p>
     */
    public static final String MAX_COMMAND_CHAIN_LENGTH = "maxCommandChainLength";

    /**
     * The maximum number of other pushable entities a mob or player can push,
     * before taking 3 suffocation damage per half-second.
     *
     * <p>Damage affects {@link GameModes#SURVIVAL survival mode} or
     * {@link GameModes#ADVENTURE adventure mode} {@link IPlayer}s, and all
     * mobs but bats. Pushable entities include non-spectator-mode
     * {@link IPlayer}, any mob except {@link Bat}s, as well as
     * {@link IBoat}s and {@link IMinecart}.</p>
     *
     * <p>Setting to {@code 0} disables the rule.</p>
     *
     * <p>This is a numerical game rule, with a default value of {@code 24}.</p>
     */
    public static final String MAX_ENTITY_CRAMMING = "maxEntityCramming";

    /**
     * Whether {@link IAgent}s should be able to change blocks, and whether
     * {@link IAgent}s can pick up items.
     *
     * <p>In vanilla Minecraft, the following entities can change blocks when
     * this gamerule is {@code true}:
     * <ul>
     * <li>{@link ICreeper}</li>
     * <li>{@link IZombie}</li>
     * <li>{@link IEnderman}</li>
     * <li>{@link IGhast}</li>
     * <li>{@link IWither}</li>
     * <li>{@link EnderDragon}</li>
     * <li>{@link IRabbit}</li>
     * <li>{@link ISheep}</li>
     * <li>{@link Villager}</li>
     * <li>{@link SnowGolem}</li>
     * <li>{@link ISilverfish}</li>
     * </ul></p>
     *
     * <p>In vanilla Minecraft, the following entities can pick up items when
     * this gamerule is{@code true}:
     * <ul>
     * <li>{@link Villager}</li>
     * <li>{@link IZombie}</li>
     * <li>{@link ISkeleton}</li>
     * <li>{@link IPigZombie}</li>
     * </ul></p>
     *
     * <p>This is a boolean game rule, with a default value of {@code true}.</p>
     */
    public static final String MOB_GRIEFING = "mobGriefing";

    /**
     * Whether {@link IPlayer}s can regenerate health naturally if their
     * hunger is full enough (doesn't affect external healing, such as
     * golden apples, the Regeneration effect, etc.).
     *
     * <p>This is a boolean game rule, with a default value of {@code true}.</p>
     */
    public static final String NATURAL_REGENERATION = "naturalRegeneration";

    /**
     * How often a random block tick occurs (such as plant growth,
     * leaf decay, etc.) per chunk section per game tick.
     *
     * <p>0 will disable random ticks, higher numbers will increase random
     * ticks</p>
     *
     * <p>This is a numerical game rule, with a default value of {@code 3}.</p>
     */
    public static final String RANDOM_TICK_SPEED = "randomTickSpeed";

    /**
     * Whether the debug screen shows all or reduced information.
     *
     * <p>This is a boolean game rule, with a default value of
     * {@code false}.</p>
     */
    public static final String REDUCED_DEBUG_INFO = "reducedDebugInfo";

    /**
     * Whether the feedback from commands executed by a {@link IPlayer}
     * should show up in chat.
     *
     * <p>This game rule affects the default behavior of whether
     * {@link CommandBlock}s store their output text.</p>
     *
     * <p>This is a boolean game rule, with a default value of {@code true}.</p>
     */
    public static final String SEND_COMMAND_FEEDBACK = "sendCommandFeedback";

    /**
     * Whether a message appears in chat when a {@link IPlayer} dies.
     *
     * <p>This is a boolean game rule, with a default value of {@code true}.</p>
     */
    public static final String SHOW_DEATH_MESSAGES = "showDeathMessages";

    /**
     * The number of blocks outward from the world spawn coordinates
     * that a player will spawn in when first joining a server or when
     * dying without a spawn point.
     *
     * <p>This is a numerical game rule, with a default value of {@code 10}.</p>
     */
    public static final String SPAWN_RADIUS = "spawnRadius";

    /**
     * Whether players in {@link GameModes#SPECTATOR spectator mode} can
     * generate chunks.
     *
     * <p>This is a boolean game rule, with a default value of {@code true}.</p>
     */
    public static final String SPECTATORS_GENERATE_CHUNKS = "spectatorsGenerateChunks";

}
