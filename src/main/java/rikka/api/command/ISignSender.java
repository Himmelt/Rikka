package rikka.api.command;

import rikka.api.tileentity.ISign;
import rikka.api.world.Locatable;

public interface ISignSender extends ICommandSender, Locatable {
    ISign getSign();
}
