package org.soraworld.rikka.command;

import org.soraworld.rikka.service.permission.Permissible;
import org.soraworld.rikka.text.channel.MessageReceiver;
import org.soraworld.rikka.text.translation.locale.Locales;

import java.util.Locale;

public interface CommandSource extends MessageReceiver, Permissible {

    String getName();

    default Locale getLocale() {
        return Locales.DEFAULT;
    }

}
