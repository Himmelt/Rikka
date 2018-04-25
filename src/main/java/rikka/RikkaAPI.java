package rikka;

import org.bukkit.command.CommandSender;
import org.spongepowered.api.command.CommandSource;
import rikka.api.command.ICommandSender;
import rikka.api.text.Text;
import rikka.api.text.channel.MessageChannel;
import rikka.bukkit.BukkitRikka;
import rikka.sponge.SpongeRikka;

import javax.annotation.Nonnull;

public final class RikkaAPI {

    private static final ICommandSender invalid = new ICommandSender() {
        public String getName() {
            return "invalid";
        }

        public boolean hasPermission(@Nonnull String perm) {
            return false;
        }

        public void sendMessage(@Nonnull Text msg) {
        }

        public MessageChannel getMessageChannel() {
            return null;
        }

        public void setMessageChannel(MessageChannel channel) {
        }
    };

    public static ICommandSender getCommandSender(CommandSender sender) {
        if (ServerType.runningBukkit()) return BukkitRikka.getCommandSender(sender);
        return invalid;
    }

    public static ICommandSender getCommandSender(CommandSource sender) {
        if (ServerType.runningSponge()) return SpongeRikka.getCommandSender(sender);
        return invalid;
    }

}
