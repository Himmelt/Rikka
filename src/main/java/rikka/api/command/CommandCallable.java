package rikka.api.command;

import rikka.api.world.Location;

import javax.annotation.Nullable;
import java.util.List;

public interface CommandCallable {

    boolean process(ICommandSender sender, String args);

    List<String> getSuggestions(ICommandSender sender, String args, @Nullable Location location);

    boolean testPermission(ICommandSender source);

    String getUsage(ICommandSender source);

}
