package rikka.bukkit;

import org.bukkit.World;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.RemoteConsoleCommandSender;
import org.bukkit.entity.*;
import org.bukkit.entity.minecart.CommandMinecart;
import rikka.api.command.ICommandSender;
import rikka.api.world.IWorld;
import rikka.bukkit.command.BukkitBlockSender;
import rikka.bukkit.command.BukkitConsoleSender;
import rikka.bukkit.command.BukkitMinecartSender;
import rikka.bukkit.command.BukkitRconSender;
import rikka.bukkit.entity.*;
import rikka.bukkit.entity.living.BukkitArmorStand;
import rikka.bukkit.entity.living.BukkitLiving;
import rikka.bukkit.entity.living.BukkitPlayer;
import rikka.bukkit.entity.projectile.BukkitProjectile;
import rikka.bukkit.world.BukkitWorld;

import java.util.HashMap;
import java.util.UUID;

public abstract class BukkitRikka<T> {

    protected final T source;

    protected BukkitRikka(T source) {
        this.source = source;
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

    private static BukkitLiving getMonster(Monster monster) {
        // TODO descending sequence by probability
        BukkitLiving mon = monsters.get(monster.getUniqueId());
        if (mon == null) {
            if (monster instanceof org.spongepowered.api.entity.living.monster.Blaze)
                mon = new SpongeBlaze((org.spongepowered.api.entity.living.monster.Blaze) monster);
            else if (monster instanceof org.spongepowered.api.entity.living.monster.Creeper)
                mon = new SpongeCreeper((org.spongepowered.api.entity.living.monster.Creeper) monster);
            else if (monster instanceof org.spongepowered.api.entity.living.monster.Enderman)
                mon = new SpongeEnderman((org.spongepowered.api.entity.living.monster.Enderman) monster);
            else if (monster instanceof org.spongepowered.api.entity.living.monster.Endermite)
                mon = new SpongeEndermite((org.spongepowered.api.entity.living.monster.Endermite) monster);
            else if (monster instanceof org.spongepowered.api.entity.living.monster.Evoker)
                mon = new SpongeEvoker((org.spongepowered.api.entity.living.monster.Evoker) monster);
            else if (monster instanceof org.spongepowered.api.entity.living.monster.Giant)
                mon = new SpongeGiant((org.spongepowered.api.entity.living.monster.Giant) monster);
            else if (monster instanceof org.spongepowered.api.entity.living.monster.Guardian)
                mon = new SpongeGuardian((org.spongepowered.api.entity.living.monster.Guardian) monster);
            else if (monster instanceof org.spongepowered.api.entity.living.monster.Illusioner)
                mon = new SpongeIllusioner((org.spongepowered.api.entity.living.monster.Illusioner) monster);
            else if (monster instanceof org.spongepowered.api.entity.living.monster.Silverfish)
                mon = new SpongeSilverfish((org.spongepowered.api.entity.living.monster.Silverfish) monster);
            else if (monster instanceof org.spongepowered.api.entity.living.monster.Stray)
                mon = new SpongeStray((org.spongepowered.api.entity.living.monster.Stray) monster);
            else if (monster instanceof org.spongepowered.api.entity.living.monster.WitherSkeleton)
                mon = new SpongeWitherSkeleton((org.spongepowered.api.entity.living.monster.WitherSkeleton) monster);
            else if (monster instanceof org.spongepowered.api.entity.living.monster.Skeleton)
                mon = new SpongeSkeleton<>((org.spongepowered.api.entity.living.monster.Skeleton) monster);
            else if (monster instanceof org.spongepowered.api.entity.living.monster.MagmaCube)
                mon = new SpongeMagmaCube((org.spongepowered.api.entity.living.monster.MagmaCube) monster);
            else if (monster instanceof org.spongepowered.api.entity.living.monster.Slime)
                mon = new SpongeSlime<>((org.spongepowered.api.entity.living.monster.Slime) monster);
            else if (monster instanceof org.spongepowered.api.entity.living.monster.CaveSpider)
                mon = new SpongeCaveSpider((org.spongepowered.api.entity.living.monster.CaveSpider) monster);
            else if (monster instanceof org.spongepowered.api.entity.living.monster.Spider)
                mon = new SpongeSpider<>((org.spongepowered.api.entity.living.monster.Spider) monster);
            else if (monster instanceof org.spongepowered.api.entity.living.monster.Vex)
                mon = new SpongeVex((org.spongepowered.api.entity.living.monster.Vex) monster);
            else if (monster instanceof org.spongepowered.api.entity.living.monster.Vindicator)
                mon = new SpongeVindicator((org.spongepowered.api.entity.living.monster.Vindicator) monster);
            else if (monster instanceof org.spongepowered.api.entity.living.monster.Wither)
                mon = new SpongeWither((org.spongepowered.api.entity.living.monster.Wither) monster);
            else if (monster instanceof org.spongepowered.api.entity.living.monster.Husk)
                mon = new SpongeHusk((org.spongepowered.api.entity.living.monster.Husk) monster);
            else if (monster instanceof ZombiePigman) mon = new SpongePigZombie((ZombiePigman) monster);
            else if (monster instanceof org.spongepowered.api.entity.living.monster.ZombieVillager)
                mon = new SpongeZombieVillager((org.spongepowered.api.entity.living.monster.ZombieVillager) monster);
            else if (monster instanceof org.spongepowered.api.entity.living.monster.Zombie)
                mon = new SpongeZombie<>((Zombie) monster);
            else return null;
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
