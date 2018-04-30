package rikka.api.text.channel;

import rikka.api.text.Text;
import rikka.api.text.TextElement;
import rikka.api.text.TextTemplate;
import rikka.api.text.chat.ChatType;

import java.util.Map;

import static com.google.common.base.Preconditions.checkNotNull;

@FunctionalInterface
public interface ChatTypeMessageReceiver {

    void sendMessage(ChatType type, Text message);

    default void sendMessage(ChatType type, TextTemplate template) {
        this.sendMessage(type, checkNotNull(template, "template").apply().build());
    }

    default void sendMessage(ChatType type, TextTemplate template, Map<String, TextElement> parameters) {
        this.sendMessage(type, checkNotNull(template, "template").apply(parameters).build());
    }

    default void sendMessages(ChatType type, Text... messages) {
        checkNotNull(type, "type");

        for (Text message : checkNotNull(messages, "messages")) {
            this.sendMessage(type, message);
        }
    }

    default void sendMessages(ChatType type, Iterable<Text> messages) {
        checkNotNull(type, "type");

        for (Text message : checkNotNull(messages, "messages")) {
            this.sendMessage(type, message);
        }
    }

}
