package org.soraworld.rikka.command.source;

import org.soraworld.rikka.block.tileentity.Sign;
import org.soraworld.rikka.command.CommandSource;
import org.soraworld.rikka.world.Locatable;

public interface SignSource extends CommandSource, Locatable {

    Sign getSign();
}
