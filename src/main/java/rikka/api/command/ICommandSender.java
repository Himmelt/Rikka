package rikka.api.command;

import org.spongepowered.api.text.channel.MessageReceiver;
import rikka.api.service.permission.Permissible;

public interface ICommandSender extends MessageReceiver, Permissible {

    String getName();

    void sendMsg(String msg);

    void sendKey(String key, Object... args);

    void sendVKey(String key, Object... args);

}
