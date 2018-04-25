package rikka.api.command.source;

import rikka.api.command.ICommandSender;
import rikka.api.data.DataHolder;
import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.CommandData;
import rikka.api.data.value.mutable.OptionalValue;
import rikka.api.data.value.mutable.Value;
import rikka.api.text.Text;
import rikka.api.world.Locatable;

public interface IBlockSender extends Locatable, ICommandSender, DataHolder {

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
