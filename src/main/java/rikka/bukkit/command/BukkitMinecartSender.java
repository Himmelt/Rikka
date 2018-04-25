package rikka.bukkit.command;

import org.bukkit.entity.minecart.CommandMinecart;
import rikka.api.command.source.IMinecartSender;

public class BukkitMinecartSender<T extends CommandMinecart> extends BukkitSender<T> implements IMinecartSender {
    public BukkitMinecartSender(T source) {
        super(source);
    }
}
