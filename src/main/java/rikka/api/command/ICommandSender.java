package rikka.api.command;

import rikka.api.service.permission.Permissible;
import rikka.api.text.channel.MessageReceiver;

public interface ICommandSender extends MessageReceiver, Permissible {
    String getName();
}
