package rikka.api.command;

import org.soraworld.rikka.text.Text;
import org.soraworld.rikka.world.Location;
import org.soraworld.rikka.world.World;

import javax.annotation.Nullable;
import java.util.List;

public interface CommandCallable {

    boolean process(ICommandSender source, String arguments) throws CommandException;

    List<String> getSuggestions(ICommandSender source, String arguments, @Nullable Location<World> location) throws CommandException;

    boolean testPermission(ICommandSender source);

    Text getUsage(ICommandSender source);

}
