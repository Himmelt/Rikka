package rikka.api.command.source;

import org.soraworld.rikka.command.ICommandSender;
import org.soraworld.rikka.data.DataHolder;
import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.manipulator.mutable.CommandData;
import org.soraworld.rikka.data.value.mutable.OptionalValue;
import org.soraworld.rikka.data.value.mutable.Value;
import org.soraworld.rikka.text.Text;
import org.soraworld.rikka.world.Locatable;

public interface CommandBlockSource extends Locatable, ICommandSender, DataHolder {

    default CommandData getCommandData() {
        return get(CommandData.class).get();
    }

    default Value<String> storedCommand() {
        return getValue(Keys.COMMAND).get();
    }

    default Value<Integer> successCount() {
        return getValue(Keys.SUCCESS_COUNT).get();
    }

    default Value<Boolean> doesTrackOutput() {
        return getValue(Keys.TRACKS_OUTPUT).get();
    }

    default OptionalValue<Text> lastOutput() {
        return getValue(Keys.LAST_COMMAND_OUTPUT).get();
    }

}
