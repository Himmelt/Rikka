package rikka.bukkit.tileentity;

import org.bukkit.block.NoteBlock;
import rikka.api.tileentity.INote;

public final class BukkitNote extends BukkitTileEntity<NoteBlock> implements INote {
    public BukkitNote(NoteBlock source) {
        super(source);
    }

    public void playNote() {

    }
}
