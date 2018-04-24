package rikka.api.effect.particle;

import com.flowpowered.math.vector.Vector3d;
import org.spongepowered.api.block.BlockState;
import org.spongepowered.api.data.type.NotePitch;
import org.spongepowered.api.effect.potion.PotionEffectType;
import org.spongepowered.api.item.FireworkEffect;
import org.spongepowered.api.item.inventory.ItemStackSnapshot;
import org.spongepowered.api.util.Color;
import org.spongepowered.api.util.Direction;
import org.spongepowered.api.util.generator.dummy.DummyObjectProvider;

import java.util.List;

public final class ParticleOptions {


    public static final ParticleOption<BlockState> BLOCK_STATE = DummyObjectProvider.createFor(ParticleOption.class, "BLOCK_STATE");

    public static final ParticleOption<Color> COLOR = DummyObjectProvider.createFor(ParticleOption.class, "COLOR");

    public static final ParticleOption<Direction> DIRECTION = DummyObjectProvider.createFor(ParticleOption.class, "DIRECTION");

    public static final ParticleOption<List<FireworkEffect>> FIREWORK_EFFECTS =
            DummyObjectProvider.createFor(ParticleOption.class, "FIREWORK_EFFECTS");

    public static final ParticleOption<ItemStackSnapshot> ITEM_STACK_SNAPSHOT =
            DummyObjectProvider.createFor(ParticleOption.class, "ITEM_STACK_SNAPSHOT");

    public static final ParticleOption<NotePitch> NOTE = DummyObjectProvider.createFor(ParticleOption.class, "NOTE");

    /**
     * This option will affect how all the particles are spread.
     */
    public static final ParticleOption<Vector3d> OFFSET = DummyObjectProvider.createFor(ParticleOption.class, "OFFSET");

    /**
     * This option will change the potion type of a particle. The only vanilla
     * {@link ParticleType}s this option is applicable to is
     * {@link ParticleTypes#SPLASH_POTION}.
     */
    public static final ParticleOption<PotionEffectType> POTION_EFFECT_TYPE = DummyObjectProvider
            .createFor(ParticleOption.class, "POTION_EFFECT_TYPE");

    /**
     * This option will affect the amount of particles that are spawned. The
     * minimum amount of particles is 1. The only vanilla {@link ParticleType}s
     * this option isn't applicable to are:
     *
     * <ul>
     * <li>{@link ParticleTypes#BREAK_BLOCK}</li>
     * <li>{@link ParticleTypes#ENDER_TELEPORT}</li>
     * <li>{@link ParticleTypes#FIRE_SMOKE}</li>
     * <li>{@link ParticleTypes#FIREWORKS}</li>
     * <li>{@link ParticleTypes#MOBSPAWNER_FLAMES}</li>
     * <li>{@link ParticleTypes#SPLASH_POTION}</li>
     * </ul>
     *
     * <p>The quantity must be at least 1, or a {@link IllegalArgumentException}
     * will be thrown when applying.</p>
     */
    public static final ParticleOption<Integer> QUANTITY = DummyObjectProvider.createFor(ParticleOption.class, "QUANTITY");

    /**
     * This option will change the scale of a particle. The only
     * vanilla {@link ParticleType}s this option is applicable to are:
     *
     * <ul>
     * <li>{@link ParticleTypes#LARGE_EXPLOSION}</li>
     * <li>{@link ParticleTypes#SWEEP_ATTACK}</li>
     * </ul>
     *
     * <p>The scale may never be negative, or a {@link IllegalArgumentException}
     * will be thrown when applying.</p>
     */
    public static final ParticleOption<Double> SCALE = DummyObjectProvider.createFor(ParticleOption.class, "SCALE");

    /**
     * This option will affect whether a particle type will have a lower
     * velocity in the horizontal plane. The only vanilla {@link ParticleType}s
     * that this option will affect are:
     *
     * <ul>
     * <li>{@link ParticleTypes#SPELL}</li>
     * <li>{@link ParticleTypes#INSTANT_SPELL}</li>
     * <li>{@link ParticleTypes#WITCH_SPELL}</li>
     * </ul>
     *
     * <p>These particle types don't have a configurable velocity (through
     * {@link #VELOCITY}) in the horizontal plane.</p>
     */
    public static final ParticleOption<Boolean> SLOW_HORIZONTAL_VELOCITY =
            DummyObjectProvider.createFor(ParticleOption.class, "SLOW_HORIZONTAL_VELOCITY");

    /**
     * This option will affect how all the particles are moving.
     */
    public static final ParticleOption<Vector3d> VELOCITY = DummyObjectProvider.createFor(ParticleOption.class, "VELOCITY");

    // SORTFIELDS:OFF

    // Suppress default constructor to ensure non-instantiability.
    private ParticleOptions() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }

}
