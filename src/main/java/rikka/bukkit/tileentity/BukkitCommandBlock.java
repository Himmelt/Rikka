package rikka.bukkit.tileentity;

import org.bukkit.block.CommandBlock;
import rikka.api.tileentity.ICommandBlock;

public final class BukkitCommandBlock extends BukkitTileEntity<CommandBlock> implements ICommandBlock {
    public BukkitCommandBlock(CommandBlock source) {
        super(source);
    }

    public void execute() {
        // TODO
    }

    public String getName() {
        return source.getName();
    }

    public void sendMsg(String msg) {
        // TODO
    }

    public boolean hasPermission(String perm) {
        // TODO
        return perm == null;
    }
}
