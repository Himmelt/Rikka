package rikka.api.command;

import rikka.api.text.Text;
import rikka.api.world.Location;

import javax.annotation.Nullable;
import java.util.List;

public interface CommandCallable {

    boolean process(ICommandSender source, String arguments);

    List<String> getSuggestions(ICommandSender source, String arguments, @Nullable Location location);

    boolean testPermission(ICommandSender source);

    Text getUsage(ICommandSender source);

}
