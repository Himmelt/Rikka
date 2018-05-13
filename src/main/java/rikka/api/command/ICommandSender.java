package rikka.api.command;

import org.spongepowered.api.text.channel.MessageReceiver;
import rikka.api.service.permission.Permissible;

public interface ICommandSender extends MessageReceiver, Permissible {
    String getName();
}
