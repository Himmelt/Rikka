package rikka.api.command.source;

import rikka.api.command.RCommandSender;
import rikka.api.tileentity.ISign;
import rikka.api.world.RLocatable;

public interface ISignSender extends RCommandSender, RLocatable {
    ISign getSign();
}
