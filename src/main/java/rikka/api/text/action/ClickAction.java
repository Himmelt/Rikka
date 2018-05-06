package rikka.api.text.action;

import rikka.api.command.RCommandSender;
import rikka.api.text.Text;

import java.net.URL;
import java.util.function.Consumer;

public abstract class ClickAction<R> extends TextAction<R> {

    ClickAction(R result) {
        super(result);
    }

    @Override
    public void applyTo(Text.Builder builder) {
        builder.onClick(this);
    }

    public static final class OpenUrl extends ClickAction<URL> {

        /**
         * Constructs a new {@link OpenUrl} instance that will ask the player to
         * open an URL when it is clicked.
         *
         * @param url The url to open
         */
        OpenUrl(URL url) {
            super(url);
        }

    }

    public static final class RunCommand extends ClickAction<String> {

        /**
         * Constructs a new {@link RunCommand} instance that will run a command
         * on the client when it is clicked.
         *
         * @param command The command to execute
         */
        RunCommand(String command) {
            super(command);
        }

    }

    public static final class ChangePage extends ClickAction<Integer> {
        ChangePage(int page) {
            super(page);
        }
    }

    public static final class SuggestCommand extends ClickAction<String> {
        SuggestCommand(String command) {
            super(command);
        }
    }

    public static final class ExecuteCallback extends ClickAction<Consumer<RCommandSender>> {

        /**
         * Constructs a new {@link ExecuteCallback} that will execute the given
         * runnable on the server when clicked. The callback will expire after
         * some amount of time (not particularly instantly, but not like
         * overnight really either).
         *
         * @param result The callback
         */
        ExecuteCallback(Consumer<RCommandSender> result) {
            super(result);
        }
    }

}
