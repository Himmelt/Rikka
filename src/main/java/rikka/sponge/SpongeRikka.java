package rikka.sponge;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.block.tileentity.TileEntity;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.entity.*;
import org.spongepowered.api.entity.explosive.PrimedTNT;
import org.spongepowered.api.entity.hanging.ItemFrame;
import org.spongepowered.api.entity.hanging.LeashHitch;
import org.spongepowered.api.entity.hanging.Painting;
import org.spongepowered.api.entity.living.Bat;
import org.spongepowered.api.entity.living.Living;
import org.spongepowered.api.entity.living.Squid;
import org.spongepowered.api.entity.living.Villager;
import org.spongepowered.api.entity.living.animal.*;
import org.spongepowered.api.entity.living.complex.EnderDragon;
import org.spongepowered.api.entity.living.golem.IronGolem;
import org.spongepowered.api.entity.living.golem.Shulker;
import org.spongepowered.api.entity.living.golem.SnowGolem;
import org.spongepowered.api.entity.living.monster.*;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.entity.projectile.Firework;
import org.spongepowered.api.entity.projectile.Projectile;
import org.spongepowered.api.entity.vehicle.Boat;
import org.spongepowered.api.entity.vehicle.minecart.Minecart;
import org.spongepowered.api.entity.weather.Lightning;
import org.spongepowered.api.entity.weather.WeatherEffect;
import org.spongepowered.api.world.World;
import org.spongepowered.api.world.gen.populator.Mushroom;
import rikka.api.command.ICommandSender;
import rikka.api.entity.vehicle.minecart.IChestMinecart;
import rikka.sponge.entity.*;
import rikka.sponge.entity.living.*;
import rikka.sponge.entity.living.animal.*;
import rikka.sponge.entity.living.golem.SpongeIronGolem;
import rikka.sponge.entity.living.golem.SpongeShulker;
import rikka.sponge.entity.living.golem.SpongeSnowGolem;
import rikka.sponge.entity.living.monster.*;
import rikka.sponge.entity.projectile.SpongeProjectile;
import rikka.sponge.tileentity.SpongeTileEntity;
import rikka.sponge.world.SpongeWorld;

import java.util.HashMap;
import java.util.UUID;

public abstract class SpongeRikka<T> {

    protected final T source;

    public SpongeRikka(T source) {
        this.source = source;
    }

    public abstract T getSource();


    private static final HashMap<String, ICommandSender> senders = new HashMap<>();
    private static final HashMap<UUID, SpongePlayer> players = new HashMap<>();
    private static final HashMap<UUID, SpongeWorld> worlds = new HashMap<>();
    private static final HashMap<UUID, SpongeLiving> monsters = new HashMap<>();
    private static final HashMap<UUID, SpongeLiving> animals = new HashMap<>();
    private static final HashMap<UUID, SpongeLiving> livings = new HashMap<>();
    private static final HashMap<UUID, SpongeEntity> entities = new HashMap<>();
    private static final HashMap<UUID, SpongeEntity> minecarts = new HashMap<>();

    public static ICommandSender getCommandSender(CommandSource source) {
        if (source == null) return null;
        ICommandSender sender = senders.get(source.getName());
        if (sender != null) return sender;
        if (source instanceof Player)
            sender = new SpongePlayer((Player) source);
        else return null;
        senders.put(source.getName(), sender);
        return sender;
    }


    public static SpongeWorld getWorld(World world) {
        SpongeWorld iWorld = worlds.get(world.getUniqueId());
        if (iWorld == null) {
            iWorld = new SpongeWorld(world);
            worlds.put(world.getUniqueId(), iWorld);
        }
        return iWorld;
    }

    public static SpongeWorld getWorld(UUID worldId) {
        SpongeWorld iWorld = worlds.get(worldId);
        if (iWorld == null) {
            World world = Sponge.getServer().getWorld(worldId).orElse(null);
            if (world != null) {
                iWorld = new SpongeWorld(world);
                worlds.put(worldId, iWorld);
            }
        }
        return iWorld;
    }

    public static SpongePlayer getPlayer(Player player) {
        SpongePlayer iPlayer = players.get(player.getUniqueId());
        if (iPlayer == null) {
            iPlayer = new SpongePlayer(player);
            players.put(player.getUniqueId(), iPlayer);
        }
        return iPlayer;
    }

    public static SpongeEntity getEntity(Entity entity) {
        if (entity == null) return null;
        if (entity instanceof Living) return getLiving((Living) entity);
        if (entity instanceof Projectile) return getProjectile((Projectile) entity);
        if (entity instanceof Minecart) return getMinecart((Minecart) entity);
        SpongeEntity ent = entities.get(entity.getUniqueId());
        if (ent == null) {
            if (entity instanceof Item) return new SpongeEntityItem((Item) entity);// return without cache
            if (entity instanceof PrimedTNT) return new SpongePrimedTNT((PrimedTNT) entity);
            if (entity instanceof ExperienceOrb) return new SpongeExpOrb((ExperienceOrb) entity);
            if (entity instanceof EnderCrystal) return new SpongeEnderCrystal((EnderCrystal) entity);
            if (entity instanceof FallingBlock) return new SpongeFallingBlock((FallingBlock) entity);
            if (entity instanceof LeashHitch) return new SpongeLeashHitch((LeashHitch) entity);
            if (entity instanceof Firework) return new SpongeFirework((Firework) entity);
            if (entity instanceof Lightning) return new SpongeLighting((Lightning) entity);
            if (entity instanceof WeatherEffect) return new SpongeWeatherEffect<>((WeatherEffect) entity);
            if (entity instanceof AreaEffectCloud) return new SpongeEffectCloud((AreaEffectCloud) entity);
            // cached
            if (entity instanceof Boat) ent = new SpongeBoat((Boat) entity);
            else if (entity instanceof ItemFrame) ent = new SpongeItemFrame((ItemFrame) entity);
            else if (entity instanceof Painting) ent = new SpongePainting((Painting) entity);
            else if (entity instanceof ShulkerBullet) ent = new SpongeShulkerBullet((ShulkerBullet) entity);
            else ent = new SpongeEntity<>(entity);
            entities.put(entity.getUniqueId(), ent);
        }
        return ent;
    }

    public static SpongeEntity getMinecart(Minecart minecart) {
        if (minecart == null) return null;
        SpongeEntity cart = minecarts.get(minecart.getUniqueId());
        if (cart == null) {
            // TODO
            if (minecart instanceof IChestMinecart) cart = null;
            else cart = null;
            minecarts.put(minecart.getUniqueId(), cart);
        }
        return cart;
    }

    public static SpongeLiving getLiving(Living living) {
        if (living == null) return null;
        if (living instanceof Player) return getPlayer((Player) living);
        if (living instanceof Monster) return getMonster((Monster) living);
        if (living instanceof Animal) return getAnimal((Animal) living);
        SpongeLiving liv = livings.get(living.getUniqueId());
        if (liv == null) {
            if (living instanceof Villager) liv = new SpongeVillager((Villager) living);
            else if (living instanceof SnowGolem) liv = new SpongeSnowGolem((SnowGolem) living);
            else if (living instanceof IronGolem) liv = new SpongeIronGolem((IronGolem) living);
            else if (living instanceof Shulker) liv = new SpongeShulker((Shulker) living);
            else if (living instanceof EnderDragon) liv = new SpongeEnderDragon((EnderDragon) living);
            else if (living instanceof Squid) return new SpongeSquid((Squid) living);//return without cache
            else if (living instanceof Bat) return new SpongeBat((Bat) living);//return without cache
            else liv = new SpongeLiving<>(living);
            livings.put(living.getUniqueId(), liv);
        }
        return liv;
    }

    public static SpongeLiving getAnimal(Animal animal) {
        if (animal == null) return null;
        SpongeLiving ani = animals.get(animal.getUniqueId());
        if (ani == null) {
            if (animal instanceof Sheep) ani = new SpongeSheep((Sheep) animal);
            else if (animal instanceof Pig) ani = new SpongePig((Pig) animal);
            else if (animal instanceof Chicken) ani = new SpongeChicken((Chicken) animal);
            else if (animal instanceof Mushroom) ani = new SpongeMooshroom((Mooshroom) animal);
            else if (animal instanceof Cow) ani = new SpongeCow<>((Cow) animal);
            else if (animal instanceof Rabbit) ani = new SpongeRabbit((Rabbit) animal);
            else if (animal instanceof Parrot) ani = new SpongeParrot((Parrot) animal);
            else if (animal instanceof Wolf) ani = new SpongeWolf((Wolf) animal);
            else if (animal instanceof Ocelot) ani = new SpongeOcelot((Ocelot) animal);
            else if (animal instanceof PolarBear) ani = new SpongePolarBear((PolarBear) animal);
            else ani = new SpongeLiving<>(animal);
            animals.put(animal.getUniqueId(), ani);
        }
        return ani;
    }

    public static SpongeLiving getMonster(Monster monster) {
        // TODO descending sequence by probability
        if (monster == null) return null;
        SpongeLiving mon = monsters.get(monster.getUniqueId());
        if (mon == null) {
            if (monster instanceof Blaze) mon = new SpongeBlaze((Blaze) monster);
            else if (monster instanceof Creeper) mon = new SpongeCreeper((Creeper) monster);
            else if (monster instanceof Enderman) mon = new SpongeEnderman((Enderman) monster);
            else if (monster instanceof Endermite) mon = new SpongeEndermite((Endermite) monster);
            else if (monster instanceof Evoker) mon = new SpongeEvoker((Evoker) monster);
            else if (monster instanceof Giant) mon = new SpongeGiant((Giant) monster);
            else if (monster instanceof Guardian) mon = new SpongeGuardian((Guardian) monster);
            else if (monster instanceof Illusioner) mon = new SpongeIllusioner((Illusioner) monster);
            else if (monster instanceof Ghast) mon = new SpongeGhast((Ghast) monster);
            else if (monster instanceof Silverfish) mon = new SpongeSilverfish((Silverfish) monster);
            else if (monster instanceof Stray) mon = new SpongeStray((Stray) monster);
            else if (monster instanceof WitherSkeleton) mon = new SpongeWitherSkeleton((WitherSkeleton) monster);
            else if (monster instanceof Skeleton) mon = new SpongeSkeleton<>((Skeleton) monster);
            else if (monster instanceof MagmaCube) mon = new SpongeMagmaCube((MagmaCube) monster);
            else if (monster instanceof Slime) mon = new SpongeSlime<>((Slime) monster);
            else if (monster instanceof CaveSpider) mon = new SpongeCaveSpider((CaveSpider) monster);
            else if (monster instanceof Spider) mon = new SpongeSpider<>((Spider) monster);
            else if (monster instanceof Vex) mon = new SpongeVex((Vex) monster);
            else if (monster instanceof Vindicator) mon = new SpongeVindicator((Vindicator) monster);
            else if (monster instanceof Wither) mon = new SpongeWither((Wither) monster);
            else if (monster instanceof Husk) mon = new SpongeHusk((Husk) monster);
            else if (monster instanceof ZombiePigman) mon = new SpongePigZombie((ZombiePigman) monster);
            else if (monster instanceof ZombieVillager) mon = new SpongeZombieVillager((ZombieVillager) monster);
            else if (monster instanceof Zombie) mon = new SpongeZombie<>((Zombie) monster);
            else mon = new SpongeLiving<>(monster);
            monsters.put(monster.getUniqueId(), mon);
        }
        return mon;
    }

    public static SpongeTileEntity getTileEntity(TileEntity entity) {
        if (entity == null) return null;
        return new SpongeTileEntity<>(entity);
    }

    public static SpongeProjectile getProjectile(Projectile projectile) {
        return null;
    }

}
