package rikka.bukkit;

import org.bukkit.World;
import org.bukkit.block.*;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.RemoteConsoleCommandSender;
import org.bukkit.entity.*;
import org.bukkit.entity.minecart.CommandMinecart;
import rikka.api.command.ICommandSender;
import rikka.api.entity.living.ILiving;
import rikka.api.tileentity.ITileEntity;
import rikka.api.tileentity.carrier.ITileCarrier;
import rikka.api.world.IWorld;
import rikka.bukkit.command.BukkitBlockSender;
import rikka.bukkit.command.BukkitConsoleSender;
import rikka.bukkit.command.BukkitMinecartSender;
import rikka.bukkit.command.BukkitRconSender;
import rikka.bukkit.entity.*;
import rikka.bukkit.entity.living.BukkitArmorStand;
import rikka.bukkit.entity.living.BukkitLiving;
import rikka.bukkit.entity.living.BukkitPlayer;
import rikka.bukkit.entity.living.monster.*;
import rikka.bukkit.entity.projectile.BukkitProjectile;
import rikka.bukkit.tileentity.*;
import rikka.bukkit.world.BukkitWorld;

import java.util.HashMap;
import java.util.UUID;

public abstract class BukkitRikka<T> {

    protected final T source;

    protected BukkitRikka(T source) {
        this.source = source;
    }

    public static ITileEntity getTileEntity(BlockState entity) {
        if (entity instanceof Container) return getTileCarrier((Container) entity);
        if (entity instanceof Banner) return new BukkitBanner((Banner) entity);
        if (entity instanceof Bed) return new BukkitBed((Bed) entity);
        if (entity instanceof CommandBlock) return new BukkitCommandBlock((CommandBlock) entity);
        if (entity instanceof Comparator) return new BukkitComparator((Comparator) entity);
        if (entity instanceof DaylightDetector) return new BukkitLightDetector((DaylightDetector) entity);
        if (entity instanceof EnchantingTable) return new BukkitEnchantTable((EnchantingTable) entity);
        if (entity instanceof EnderChest) return new BukkitEnderChest((EnderChest) entity);
        if (entity instanceof EndGateway) return new BukkitEndGateway((EndGateway) entity);
        // TODO EndPortal
        //if (entity instanceof EndPortal) return new BukkitEndPortal((EndPortal) entity);
        if (entity instanceof FlowerPot) return new BukkitFlowerPot((FlowerPot) entity);
        if (entity instanceof Jukebox) return new BukkitJukebox((Jukebox) entity);
        if (entity instanceof CreatureSpawner) return new BukkitMobSpawner((CreatureSpawner) entity);
        if (entity instanceof NoteBlock) return new BukkitNote((NoteBlock) entity);
        // TODO Piston
        //if (entity instanceof Piston) return new BukkitPiston((Piston) entity);
        if (entity instanceof Sign) return new BukkitSign((Sign) entity);
        if (entity instanceof Skull) return new BukkitSkull((Skull) entity);
        if (entity instanceof Structure) return new BukkitStructure((Structure) entity);
        if (entity != null) return new BukkitTileEntity<>(entity);
        else return null;
    }

    public static ITileCarrier getTileCarrier(Container carrier) {
        if (carrier instanceof Beacon) return new BukkitBeacon((Beacon) carrier);
        if (carrier instanceof BrewingStand) return new BukkitBrewingStand((BrewingStand) carrier);
        if (carrier instanceof Chest) return new BukkitChest((Chest) carrier);
        if (carrier instanceof Dispenser) return new BukkitDispenser((Dispenser) carrier);
        if (carrier instanceof Dropper) return new BukkitDropper((Dropper) carrier);
        if (carrier instanceof Furnace) return new BukkitFurnace((Furnace) carrier);
        if (carrier instanceof Hopper) return new BukkitHopper((Hopper) carrier);
        if (carrier instanceof ShulkerBox) return new BukkitShulkerBox((ShulkerBox) carrier);
        if (carrier != null) return new BukkitTileCarrier<>(carrier);
        else return null;
    }

    public static ILiving getAnimal(Animals animal) {
        return null;
    }

    public abstract T getSource();

    private static final HashMap<String, ICommandSender> senders = new HashMap<>();
    private static final HashMap<UUID, BukkitPlayer> players = new HashMap<>();
    private static final HashMap<UUID, BukkitWorld> worlds = new HashMap<>();
    private static final HashMap<UUID, BukkitLiving> monsters = new HashMap<>();

    public static IWorld getWorld(World world) {
        if (world == null) return null;
        BukkitWorld iWorld = worlds.get(world.getUID());
        if (iWorld == null) {
            iWorld = new BukkitWorld(world);
            worlds.put(world.getUID(), iWorld);
        }
        return iWorld;
    }

    public static ICommandSender getCommandSender(CommandSender source) {
        if (source == null) return null;
        if (source instanceof Player) {
            return getPlayer((Player) source);
        }
        ICommandSender sender = senders.get(source.getName());
        if (sender == null) {
            if (source instanceof ConsoleCommandSender) {
                sender = new BukkitConsoleSender<>((ConsoleCommandSender) source);
            } else if (source instanceof BlockCommandSender) {
                sender = new BukkitBlockSender<>((BlockCommandSender) source);
            } else if (source instanceof CommandMinecart) {
                sender = new BukkitMinecartSender<>((CommandMinecart) source);
            } else if (source instanceof RemoteConsoleCommandSender) {
                sender = new BukkitRconSender<>((RemoteConsoleCommandSender) source);
            }
            if (sender != null) senders.put(source.getName(), sender);
        }
        return sender;
    }

    public static BukkitEntity getEntity(Entity entity) {
        if (entity instanceof LivingEntity) {
            return getLiving((LivingEntity) entity);
        } else if (entity instanceof AreaEffectCloud) {
            return new BukkitEffectCloud((AreaEffectCloud) entity);
        } else if (entity instanceof ComplexEntityPart) {
            // TODO
        } else if (entity instanceof EnderCrystal) {
            return new BukkitEnderCrystal((EnderCrystal) entity);
        } else if (entity instanceof EnderSignal) {
            // TODO
        } else if (entity instanceof EvokerFangs) {
            // TODO
        } else if (entity instanceof ExperienceOrb) {
            return new BukkitExpOrb((ExperienceOrb) entity);
        } else if (entity instanceof FallingBlock) {
            // TODO
        } else if (entity instanceof Firework) {
            // TODO
        } else if (entity instanceof Hanging) {
            // TODO
        } else if (entity instanceof Item) {
            return new BukkitEntityItem((Item) entity);
        } else if (entity instanceof Projectile) {
            return getProjectile((Projectile) entity);
        } else if (entity instanceof Weather) {
            // TODO
        }
        return null;
    }

    public static BukkitLiving getLiving(LivingEntity entity) {
        if (entity instanceof Player) {
            return getPlayer((Player) entity);
        } else if (entity instanceof Ambient) {
            // TODO
        } else if (entity instanceof ArmorStand) {
            return new BukkitArmorStand((ArmorStand) entity);
        } else if (entity instanceof ComplexLivingEntity) {
            // TODO
        } else if (entity instanceof Creature) {
            // TODO
        }
        return null;
    }

    public static BukkitPlayer getPlayer(Player player) {
        if (player == null) return null;
        BukkitPlayer iPlayer = players.get(player.getUniqueId());
        if (iPlayer == null) {
            iPlayer = new BukkitPlayer(player);
            players.put(player.getUniqueId(), iPlayer);
        }
        return iPlayer;
    }

    public static BukkitLiving getMonster(Monster monster) {
        // TODO descending sequence by probability
        BukkitLiving mon = monsters.get(monster.getUniqueId());
        if (mon == null) {
            if (monster instanceof Blaze) mon = new BukkitBlaze((Blaze) monster);
            else if (monster instanceof Creeper) mon = new BukkitCreeper((Creeper) monster);
            else if (monster instanceof Enderman) mon = new BukkitEnderman((Enderman) monster);
            else if (monster instanceof Endermite) mon = new BukkitEndermite((Endermite) monster);
            else if (monster instanceof Evoker) mon = new BukkitEvoker((Evoker) monster);
            else if (monster instanceof Giant) mon = new BukkitGiant((Giant) monster);
            else if (monster instanceof Guardian) mon = new BukkitGuardian((Guardian) monster);
            else if (monster instanceof Illusioner) mon = new BukkitIllusioner((Illusioner) monster);
            else if (monster instanceof Ghast) mon = new BukkitGhast((Ghast) monster);
            else if (monster instanceof Silverfish) mon = new BukkitSilverfish((Silverfish) monster);
            else if (monster instanceof Stray) mon = new BukkitStray((Stray) monster);
            else if (monster instanceof WitherSkeleton) mon = new BukkitWitherSkeleton((WitherSkeleton) monster);
            else if (monster instanceof Skeleton) mon = new BukkitSkeleton<>((Skeleton) monster);
            else if (monster instanceof MagmaCube) mon = new BukkitMagmaCube((MagmaCube) monster);
            else if (monster instanceof Slime) mon = new BukkitSlime<>((Slime) monster);
            else if (monster instanceof CaveSpider) mon = new BukkitCaveSpider((CaveSpider) monster);
            else if (monster instanceof Spider) mon = new BukkitSpider<>((Spider) monster);
            else if (monster instanceof Vex) mon = new BukkitVex((Vex) monster);
            else if (monster instanceof Vindicator) mon = new BukkitVindicator((Vindicator) monster);
            else if (monster instanceof Wither) mon = new BukkitWither((Wither) monster);
            else if (monster instanceof Husk) mon = new BukkitHusk((Husk) monster);
            else if (monster instanceof PigZombie) mon = new BukkitPigZombie((PigZombie) monster);
            else if (monster instanceof ZombieVillager) mon = new BukkitZombieVillager((ZombieVillager) monster);
            else if (monster instanceof Zombie) mon = new BukkitZombie<>((Zombie) monster);
            else mon = new BukkitLiving<>(monster);
            monsters.put(monster.getUniqueId(), mon);
        }
        return mon;
    }

    public static BukkitProjectile getProjectile(Projectile entity) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BukkitRikka) {
            BukkitRikka rikka = (BukkitRikka) obj;
            return source == rikka.source;
        }
        return false;
    }

}
