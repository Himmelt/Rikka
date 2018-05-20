package rikka.sponge.entity;

import org.spongepowered.api.entity.FallingBlock;
import rikka.api.entity.IFallingBlock;

public final class SpongeFallingBlock extends SpongeEntity<FallingBlock> implements IFallingBlock {
    public SpongeFallingBlock(FallingBlock source) {
        super(source);
    }
}
