package rikka.api.text.chat;

import rikka.api.util.generator.dummy.DummyObjectProvider;

public final class ChatTypes {

    private ChatTypes() {
    }
    // SORTFIELDS:ON

    /**
     * The position right above the inventory, experience, health, item name,
     * etc. bars.
     */
    public static final ChatType ACTION_BAR = DummyObjectProvider.createFor(ChatType.class, "ACTION_BAR");

    /**
     * The standard chat position in prompt at the bottom-left.
     */
    public static final ChatType CHAT = DummyObjectProvider.createFor(ChatType.class, "CHAT");

    /**
     * The same position as the {@link #CHAT} position, except messages sent to
     * this position are still seen when chat is turned off on the Minecraft
     * client.
     */
    public static final ChatType SYSTEM = DummyObjectProvider.createFor(ChatType.class, "SYSTEM");

    // SORTFIELDS:OFF

}
