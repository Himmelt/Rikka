package rikka.api.command;

import rikka.api.service.permission.Permissible;
import rikka.api.text.channel.MessageReceiver;
import rikka.api.text.translation.locale.Locales;

import java.util.Locale;

public interface ICommandSender extends MessageReceiver, Permissible {

    String getName();

    default Locale getLocale() {
        return Locales.DEFAULT;
    }

}
