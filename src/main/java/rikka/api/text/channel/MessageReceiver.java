package rikka.api.text.channel;

import rikka.api.text.Text;
import rikka.api.text.TextElement;
import rikka.api.text.TextTemplate;

import java.util.Map;

import static com.google.common.base.Preconditions.checkNotNull;

public interface MessageReceiver {

    default void sendMessage(String msg) {
        sendMessage(Text.of(msg));
    }

    void sendMessage(Text message);

    default void sendMessage(TextTemplate template) {
        this.sendMessage(checkNotNull(template, "template").apply().build());
    }

    default void sendMessage(TextTemplate template, Map<String, TextElement> parameters) {
        this.sendMessage(checkNotNull(template, "template").apply(parameters).build());
    }

    default void sendMessages(Text... messages) {
        checkNotNull(messages, "messages");

        for (Text message : messages) {
            this.sendMessage(message);
        }
    }

    default void sendMessages(Iterable<Text> messages) {
        for (Text message : checkNotNull(messages, "messages")) {
            this.sendMessage(message);
        }
    }

    MessageChannel getMessageChannel();

    void setMessageChannel(MessageChannel channel);

}
