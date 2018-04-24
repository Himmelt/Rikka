package rikka.api.block.tileentity;

import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.tileentity.NoteData;
import rikka.api.data.type.NotePitch;
import rikka.api.data.value.mutable.Value;

public interface Note extends TileEntity {
    void playNote();

    default NoteData getNoteData() {
        return get(NoteData.class).get();
    }

    default Value<NotePitch> note() {
        return getValue(Keys.NOTE_PITCH).get();
    }
}
