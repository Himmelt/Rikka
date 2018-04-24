package rikka.api.command.source;

import rikka.api.block.tileentity.Sign;
import rikka.api.command.ICommandSender;
import rikka.api.world.Locatable;

public interface SignSource extends ICommandSender, Locatable {

    Sign getSign();
}
