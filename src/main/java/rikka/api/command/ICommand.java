package rikka.api.command;

import rikka.api.entity.living.IPlayer;

public interface ICommand {

    CommandResult execute(ICommandSender sender, CommandArgs args);

    default CommandResult execute(IPlayer player, CommandArgs args) {
        return execute((ICommandSender) player, args);
    }

/*
    List<String> getSuggestions(ICommandSender sender, ArrayList<String> args);

    boolean testPermission(ICommandSender sender);

    String getUsage(ICommandSender sender);
*/

}
