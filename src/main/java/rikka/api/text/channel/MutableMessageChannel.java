package rikka.api.text.channel;

public interface MutableMessageChannel extends MessageChannel {

    boolean addMember(MessageReceiver member);

    boolean removeMember(MessageReceiver member);

    void clearMembers();

    @Override
    default MutableMessageChannel asMutable() {
        // We're already mutable.
        return this;
    }

}
