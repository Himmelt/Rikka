package rikka.api.command.source;

import rikka.api.command.ICommandSender;
import rikka.api.tileentity.ISign;
import rikka.api.world.Locatable;

public interface ISignSender extends ICommandSender, Locatable {
    ISign getSign();
}
