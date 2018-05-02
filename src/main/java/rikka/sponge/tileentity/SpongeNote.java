package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.Note;
import rikka.api.tileentity.INote;

public abstract class SpongeNote<T extends Note> extends SpongeTileEntity<T> implements INote {
    public SpongeNote(T source) {
        super(source);
    }
}
