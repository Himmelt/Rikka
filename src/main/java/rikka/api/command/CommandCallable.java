package rikka.api.command;

import rikka.api.text.Text;
import rikka.api.world.IWorld;
import rikka.api.world.Location;

import javax.annotation.Nullable;
import java.util.List;

public interface CommandCallable {

    boolean process(ICommandSender source, String arguments) throws CommandException;

    List<String> getSuggestions(ICommandSender source, String arguments, @Nullable Location<IWorld> location) throws CommandException;

    boolean testPermission(ICommandSender source);

    Text getUsage(ICommandSender source);

}
