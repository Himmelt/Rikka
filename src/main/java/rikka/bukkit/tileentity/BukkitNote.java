package rikka.bukkit.tileentity;

import org.bukkit.block.NoteBlock;
import rikka.api.tileentity.INote;

public class BukkitNote<T extends NoteBlock> extends BukkitTileEntity<T> implements INote {
    public BukkitNote(T source) {
        super(source);
    }

    public void playNote() {

    }
}
