package rikka.api.command;

import rikka.api.text.Text;
import rikka.api.world.Location;
import rikka.api.world.World;

import javax.annotation.Nullable;
import java.util.List;

public interface CommandCallable {

    boolean process(ICommandSender source, String arguments) throws CommandException;

    List<String> getSuggestions(ICommandSender source, String arguments, @Nullable Location<World> location) throws CommandException;

    boolean testPermission(ICommandSender source);

    Text getUsage(ICommandSender source);

}
