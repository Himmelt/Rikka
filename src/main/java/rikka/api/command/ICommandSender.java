package rikka.api.command;

import rikka.api.service.permission.Permissible;

public interface ICommandSender extends Permissible {
    String getName();

    void sendMsg(String msg);

}
