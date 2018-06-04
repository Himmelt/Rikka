package rikka.bukkit.command;

import org.bukkit.entity.minecart.CommandMinecart;
import rikka.api.command.IMinecartSender;

public final class BukkitMinecartSender extends BukkitSender<CommandMinecart> implements IMinecartSender {
    public BukkitMinecartSender(CommandMinecart source) {
        super(source);
    }
}
