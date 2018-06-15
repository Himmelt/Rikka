package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.CommandBlock;
import org.spongepowered.api.text.Text;
import rikka.api.tileentity.ICommandBlock;

public final class SpongeCommandBlock extends SpongeTileEntity<CommandBlock> implements ICommandBlock {
    public SpongeCommandBlock(CommandBlock source) {
        super(source);
    }

    public void execute() {
        source.execute();
    }

    public String getName() {
        return source.getName();
    }

    public void sendMsg(String msg) {
        source.sendMessage(Text.of(msg));
    }

    public boolean hasPermission(String perm) {
        if (perm == null) return true;
        return source.hasPermission(perm);
    }
}
