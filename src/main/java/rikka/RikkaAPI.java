package rikka;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.block.BlockState;
import org.bukkit.block.Container;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.block.tileentity.TileEntity;
import org.spongepowered.api.block.tileentity.carrier.TileEntityCarrier;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.entity.living.Living;
import org.spongepowered.api.entity.living.animal.Animal;
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
        if (Bukkit.getServer() != null) {
            bukkit = true;
            unknown = false;
            sponge = false;
        } else {
            bukkit = false;
            try {
                Sponge.getServer();
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

    public static ICommandSender getCommandSender(CommandSender sender) {
        if (BUKKIT) return BukkitRikka.getCommandSender(sender);
        return null;
    }

    public static ICommandSender getCommandSender(CommandSource sender) {
        if (SPONGE) return SpongeRikka.getCommandSender(sender);
        return null;
    }

    public static IWorld getWorld(World world) {
        if (BUKKIT) return BukkitRikka.getWorld(world);
        return null;
    }

    public static IWorld getWorld(org.spongepowered.api.world.World world) {
        if (SPONGE) return SpongeRikka.getWorld(world);
        return null;
    }

    public static IEntity getEntity(Entity entity) {
        if (BUKKIT) return BukkitRikka.getEntity(entity);
        return null;
    }

    public static IEntity getEntity(org.spongepowered.api.entity.Entity entity) {
        if (SPONGE) return SpongeRikka.getEntity(entity);
        return null;
    }

    public static ILiving getLiving(LivingEntity living) {
        if (BUKKIT) return BukkitRikka.getLiving(living);
        return null;
    }

    public static ILiving getLiving(Living living) {
        if (SPONGE) return SpongeRikka.getLiving(living);
        return null;
    }

    public static ILiving getAnimal(Animals animal) {
        if (BUKKIT) return BukkitRikka.getAnimal(animal);
        return null;
    }

    public static ILiving getAnimal(Animal animal) {
        if (SPONGE) return SpongeRikka.getAnimal(animal);
        return null;
    }

    public static IPlayer getPlayer(Player player) {
        if (BUKKIT) return BukkitRikka.getPlayer(player);
        return null;
    }

    public static IPlayer getPlayer(org.spongepowered.api.entity.living.player.Player player) {
        if (SPONGE) return SpongeRikka.getPlayer(player);
        return null;
    }

    public static ITileEntity getTileEntity(TileEntity entity) {
        if (SPONGE) return SpongeRikka.getTileEntity(entity);
        return null;
    }

    public static ITileEntity getTileEntity(BlockState entity) {
        if (BUKKIT) return BukkitRikka.getTileEntity(entity);
        return null;
    }

    public static ITileCarrier getTileCarrier(TileEntityCarrier carrier) {
        if (SPONGE) return SpongeRikka.getTileCarrier(carrier);
        return null;
    }

    public static ITileCarrier getTileCarrier(Container carrier) {
        if (BUKKIT) return BukkitRikka.getTileCarrier(carrier);
        return null;
    }

    public static IProjectile getProjectile(Projectile projectile) {
        if (BUKKIT) return BukkitRikka.getProjectile(projectile);
        return null;
    }

    public static IProjectile getProjectile(org.spongepowered.api.entity.projectile.Projectile projectile) {
        if (SPONGE) return SpongeRikka.getProjectile(projectile);
        return null;
    }

}
