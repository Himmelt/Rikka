package rikka.api.command.source;

import org.soraworld.rikka.block.tileentity.Sign;
import org.soraworld.rikka.command.ICommandSender;
import org.soraworld.rikka.world.Locatable;

public interface SignSource extends ICommandSender, Locatable {

    Sign getSign();
}
