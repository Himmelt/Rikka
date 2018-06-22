package rikka.api.command;

import rikka.api.entity.living.IPlayer;

import java.util.List;

public interface ICommand {

    ExecuteResult execute(ICommandSender sender, CommandArgs args);

    default ExecuteResult execute(IPlayer player, CommandArgs args) {
        return execute((ICommandSender) player, args);
    }

    List<String> tabCompletions(CommandArgs args);

/*
    List<String> getSuggestions(ICommandSender sender, ArrayList<String> args);

    boolean testPermission(ICommandSender sender);

    String getUsage(ICommandSender sender);
*/

}
