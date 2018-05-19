package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.Note;
import rikka.api.tileentity.INote;

public final class SpongeNote extends SpongeTileEntity<Note> implements INote {
    public SpongeNote(Note source) {
        super(source);
    }

    public void playNote() {
    }
}
