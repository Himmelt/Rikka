package rikka.api.text.chat;

import rikka.api.util.generator.dummy.DummyObjectProvider;

public final class ChatVisibilities {

    private ChatVisibilities() {
    }

    // SORTFIELDS:ON

    /**
     * All chat is visible.
     */
    public static final ChatVisibility FULL = DummyObjectProvider.createFor(ChatVisibility.class, "FULL");

    /**
     * No chat is visible.
     */
    public static final ChatVisibility HIDDEN = DummyObjectProvider.createFor(ChatVisibility.class, "HIDDEN");

    /**
     * Only {@link ChatTypes#SYSTEM} is visible.
     */
    public static final ChatVisibility SYSTEM = DummyObjectProvider.createFor(ChatVisibility.class, "SYSTEM");

    // SORTFIELDS:OFF
}
