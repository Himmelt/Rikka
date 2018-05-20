package rikka.api.command;

import java.util.ArrayList;
import java.util.List;

public interface CommandCallable {

    boolean process(ICommandSender sender, ArrayList<String> args);

    List<String> getSuggestions(ICommandSender sender, ArrayList<String> args);

    boolean testPermission(ICommandSender sender);

    String getUsage(ICommandSender sender);

}
