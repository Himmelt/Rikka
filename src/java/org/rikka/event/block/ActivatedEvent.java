package org.rikka.event.block;

import net.minecraftforge.fml.common.eventhandler.Cancelable;
import org.rikka.block.Block;
import org.rikka.entity.Player;

@Cancelable
public class ActivatedEvent extends BlockEvent {

    private final Player player;
    private final float hitX, hitY, hitZ;
    private final int side;

    public ActivatedEvent(Block block, Player player, int side, float hitX, float hitY, float hitZ) {
        super(block);
        //this.player = (IPlayer) NpcAPI.Instance().getIEntity(player);
        this.player = player;
        this.hitX = hitX;
        this.hitY = hitY;
        this.hitZ = hitZ;
        this.side = side;
    }

    public Player getPlayer() {
        return player;
    }

    public float getHitX() {
        return hitX;
    }

    public float getHitY() {
        return hitY;
    }

    public float getHitZ() {
        return hitZ;
    }

    public int getSide() {
        return side;
    }
}
