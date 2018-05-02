package rikka.bukkit.tileentity;

import org.bukkit.block.NoteBlock;
import rikka.api.tileentity.INote;

public abstract class BukkitNote<T extends NoteBlock> extends BukkitTileEntity<T> implements INote {
    public BukkitNote(T source) {
        super(source);
    }
}
