package rikka.bukkit.command;

import org.bukkit.command.BlockCommandSender;
import rikka.api.command.source.IBlockSender;

public class BukkitBlockSender<T extends BlockCommandSender> extends BukkitSender<T> implements IBlockSender {
    public BukkitBlockSender(T source) {
        super(source);
    }
}
