package rikka;

import org.bukkit.command.CommandSender;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.channel.MessageChannel;
import rikka.api.command.ICommandSender;
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

}
