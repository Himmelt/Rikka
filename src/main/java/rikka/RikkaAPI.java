package rikka;

import org.bukkit.command.CommandSender;
import org.spongepowered.api.command.CommandSource;
import rikka.api.command.RCommandSender;
import rikka.api.text.Text;
import rikka.api.text.channel.MessageChannel;
import rikka.bukkit.BukkitRikka;
import rikka.sponge.SpongeRikka;

import javax.annotation.Nonnull;

import static rikka.ServerType.BUKKIT;
import static rikka.ServerType.SPONGE;

public final class RikkaAPI {

    private static final RCommandSender invalid = new RCommandSender() {
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

    public static RCommandSender getCommandSender(CommandSender sender) {
        if (BUKKIT) return BukkitRikka.getCommandSender(sender);
        return invalid;
    }

    public static RCommandSender getCommandSender(CommandSource sender) {
        if (SPONGE) return SpongeRikka.getCommandSender(sender);
        return invalid;
    }

}
