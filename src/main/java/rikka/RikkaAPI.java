package rikka;

import rikka.api.command.ICommandSender;
import rikka.api.entity.IEntity;
import rikka.api.entity.living.ILiving;
import rikka.api.entity.living.IPlayer;
import rikka.api.entity.projectile.IProjectile;
import rikka.api.tileentity.ITileEntity;
import rikka.api.tileentity.carrier.ITileCarrier;
import rikka.api.world.IWorld;
import rikka.bukkit.BukkitRikka;
import rikka.sponge.SpongeRikka;

public final class RikkaAPI {

    public static final boolean UNKNOWN, BUKKIT, SPONGE;

    static {
        boolean unknown, bukkit, sponge;
        if (org.bukkit.Bukkit.getServer() != null) {
            bukkit = true;
            unknown = false;
            sponge = false;
        } else {
            bukkit = false;
            try {
                org.spongepowered.api.Sponge.getServer();
                sponge = true;
                unknown = false;
            } catch (Throwable e) {
                sponge = false;
                unknown = true;
            }
        }
        UNKNOWN = unknown;
        BUKKIT = bukkit;
        SPONGE = sponge;
    }

    public static ICommandSender getCommandSender(org.bukkit.command.CommandSender sender) {
        if (BUKKIT) return BukkitRikka.getCommandSender(sender);
        return null;
    }

    public static ICommandSender getCommandSender(org.spongepowered.api.command.CommandSource sender) {
        if (SPONGE) return SpongeRikka.getCommandSender(sender);
        return null;
    }

    public static IWorld getWorld(org.bukkit.World world) {
        if (BUKKIT) return BukkitRikka.getWorld(world);
        return null;
    }

    public static IWorld getWorld(org.spongepowered.api.world.World world) {
        if (SPONGE) return SpongeRikka.getWorld(world);
        return null;
    }

    public static IEntity getEntity(org.bukkit.entity.Entity entity) {
        if (BUKKIT) return BukkitRikka.getEntity(entity);
        return null;
    }

    public static IEntity getEntity(org.spongepowered.api.entity.Entity entity) {
        if (SPONGE) return SpongeRikka.getEntity(entity);
        return null;
    }

    public static ILiving getLiving(org.bukkit.entity.LivingEntity living) {
        if (BUKKIT) return BukkitRikka.getLiving(living);
        return null;
    }

    public static ILiving getLiving(org.spongepowered.api.entity.living.Living living) {
        if (SPONGE) return SpongeRikka.getLiving(living);
        return null;
    }

    public static ILiving getAnimal(org.bukkit.entity.Animals animal) {
        if (BUKKIT) return BukkitRikka.getAnimal(animal);
        return null;
    }

    public static ILiving getAnimal(org.spongepowered.api.entity.living.animal.Animal animal) {
        if (SPONGE) return SpongeRikka.getAnimal(animal);
        return null;
    }

    public static IPlayer getPlayer(org.bukkit.entity.Player player) {
        if (BUKKIT) return BukkitRikka.getPlayer(player);
        return null;
    }

    public static IPlayer getPlayer(org.spongepowered.api.entity.living.player.Player player) {
        if (SPONGE) return SpongeRikka.getPlayer(player);
        return null;
    }

    public static ITileEntity getTileEntity(org.spongepowered.api.block.tileentity.TileEntity entity) {
        if (SPONGE) return SpongeRikka.getTileEntity(entity);
        return null;
    }

    public static ITileEntity getTileEntity(org.bukkit.block.BlockState entity) {
        if (BUKKIT) return BukkitRikka.getTileEntity(entity);
        return null;
    }

    public static ITileCarrier getTileCarrier(org.spongepowered.api.block.tileentity.carrier.TileEntityCarrier carrier) {
        if (SPONGE) return SpongeRikka.getTileCarrier(carrier);
        return null;
    }

    public static ITileCarrier getTileCarrier(org.bukkit.block.Container carrier) {
        if (BUKKIT) return BukkitRikka.getTileCarrier(carrier);
        return null;
    }

    public static IProjectile getProjectile(org.bukkit.entity.Projectile projectile) {
        if (BUKKIT) return BukkitRikka.getProjectile(projectile);
        return null;
    }

    public static IProjectile getProjectile(org.spongepowered.api.entity.projectile.Projectile projectile) {
        if (SPONGE) return SpongeRikka.getProjectile(projectile);
        return null;
    }

}
