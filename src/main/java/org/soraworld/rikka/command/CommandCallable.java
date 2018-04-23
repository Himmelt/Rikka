package org.soraworld.rikka.command;

import org.soraworld.rikka.text.Text;
import org.soraworld.rikka.world.Location;
import org.soraworld.rikka.world.World;

import javax.annotation.Nullable;
import java.util.List;

public interface CommandCallable {

    boolean process(CommandSource source, String arguments) throws CommandException;

    List<String> getSuggestions(CommandSource source, String arguments, @Nullable Location<World> location) throws CommandException;

    boolean testPermission(CommandSource source);

    Text getUsage(CommandSource source);

}
