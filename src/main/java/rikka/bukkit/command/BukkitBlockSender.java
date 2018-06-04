package rikka.bukkit.command;

import org.bukkit.command.BlockCommandSender;
import rikka.api.command.IBlockSender;
import rikka.api.world.IWorld;
import rikka.api.world.Location;

public final class BukkitBlockSender extends BukkitSender<BlockCommandSender> implements IBlockSender {
    public BukkitBlockSender(BlockCommandSender source) {
        super(source);
    }

    public Location getLocation() {
        return null;
    }

    public IWorld getWorld() {
        return null;
    }
}
