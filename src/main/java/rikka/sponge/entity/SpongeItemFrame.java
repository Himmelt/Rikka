package rikka.sponge.entity;

import org.spongepowered.api.entity.hanging.ItemFrame;
import rikka.api.entity.IItemFrame;

public final class SpongeItemFrame extends SpongeEntity<ItemFrame> implements IItemFrame {
    public SpongeItemFrame(ItemFrame source) {
        super(source);
    }
}
