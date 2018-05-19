package rikka;

import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.entity.living.Living;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.channel.MessageChannel;
import rikka.api.command.ICommandSender;
import rikka.api.entity.IEntity;
import rikka.api.entity.living.ILiving;
import rikka.api.entity.living.IPlayer;
import rikka.api.entity.projectile.IProjectile;
import rikka.api.world.IWorld;
import rikka.bukkit.BukkitRikka;
import rikka.sponge.SpongeRikka;

import javax.annotation.Nonnull;

import static rikka.ServerType.BUKKIT;
import static rikka.ServerType.SPONGE;

public final class RikkaAPI {

    private static final ICommandSender invalid = new ICommandSender() {
        public void sendMessage(Text message) {

        }

        public MessageChannel getMessageChannel() {
            return null;
        }

        public void setMessageChannel(MessageChannel channel) {

        }

        public String getName() {
            return "invalid";
        }

        public boolean hasPermission(@Nonnull String perm) {
            return false;
        }

        public void sendMessage(@Nonnull String msg) {
        }

    };

    public static ICommandSender getCommandSender(CommandSender sender) {
        if (BUKKIT) return BukkitRikka.getCommandSender(sender);
        return invalid;
    }

    public static ICommandSender getCommandSender(CommandSource sender) {
        if (SPONGE) return SpongeRikka.getCommandSender(sender);
        return invalid;
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

    public static IPlayer getPlayer(Player player) {
        if (BUKKIT) return BukkitRikka.getPlayer(player);
        return null;
    }

    public static IPlayer getPlayer(org.spongepowered.api.entity.living.player.Player player) {
        if (BUKKIT) return SpongeRikka.getPlayer(player);
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
