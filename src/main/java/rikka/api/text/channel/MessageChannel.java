/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package rikka.api.text.channel;

import com.google.common.collect.ImmutableSet;
import rikka.api.text.Text;
import rikka.api.text.channel.impl.DelegateMutableMessageChannel;
import rikka.api.text.channel.type.CombinedMessageChannel;
import rikka.api.text.channel.type.FixedMessageChannel;
import rikka.api.text.channel.type.PermissionMessageChannel;
import rikka.api.text.channel.type.WorldMessageChannel;
import rikka.api.text.chat.ChatType;
import rikka.api.text.chat.ChatTypes;
import rikka.api.world.IWorld;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.Optional;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Represents a channel that takes a message and transforms it for distribution
 * to the members.
 */
@FunctionalInterface
public interface MessageChannel {

    MessageChannel TO_NONE = ImmutableSet::of;

    MessageChannel TO_PLAYERS = () -> ImmutableSet.copyOf(Sponge.getGame().getServer().getOnlinePlayers());

    MessageChannel TO_CONSOLE = () -> ImmutableSet.of(Sponge.getGame().getServer().getConsole());

    MessageChannel TO_ALL = () -> ImmutableSet.<MessageReceiver>builder()
            .addAll(Sponge.getGame().getServer().getOnlinePlayers())
            .add(Sponge.getGame().getServer().getConsole())
            .build();

    static MessageChannel permission(String permission) {
        return new PermissionMessageChannel(permission);
    }

    static MessageChannel combined(MessageChannel... channels) {
        return new CombinedMessageChannel(channels);
    }

    static MessageChannel combined(Collection<MessageChannel> channels) {
        return new CombinedMessageChannel(channels);
    }

    static MessageChannel fixed(MessageReceiver... recipients) {
        return new FixedMessageChannel(recipients);
    }

    static MessageChannel fixed(Collection<? extends MessageReceiver> recipients) {
        return new FixedMessageChannel(recipients);
    }

    static MessageChannel world(IWorld world) {
        return new WorldMessageChannel(world);
    }

    default void send(Text original) {
        this.send(null, original);
    }

    default void send(Text original, ChatType type) {
        this.send(null, original, type);
    }
    default void send(@Nullable Object sender, Text original) {
        this.send(sender, original, ChatTypes.SYSTEM);
    }
    default void send(@Nullable Object sender, Text original, ChatType type) {
        checkNotNull(original, "original text");
        checkNotNull(type, "type");
        for (MessageReceiver member : this.getMembers()) {
            if (member instanceof RChatTypeMessageReceiver) {
                this.transformMessage(sender, member, original, type).ifPresent(text -> ((RChatTypeMessageReceiver) member).sendMessage(type, text));
            } else {
                this.transformMessage(sender, member, original, type).ifPresent(member::sendMessage);
            }
        }
    }

    default Optional<Text> transformMessage(@Nullable Object sender, MessageReceiver recipient, Text original, ChatType type) {
        return Optional.of(original);
    }

    Collection<MessageReceiver> getMembers();

    default MutableMessageChannel asMutable() {
        return new DelegateMutableMessageChannel(this);
    }

}
