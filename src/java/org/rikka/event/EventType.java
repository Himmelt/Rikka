package org.rikka.event;

public enum EventType {
    PLAYER_TOSS(true),
    BLOCK_ACTIVE(true),//cancelable
    BLOCK_CLICK(false),
    BLOCK_COLLIDE(false),
    BLOCK_FALLEN(true),//cancelable
    BLOCK_EXPLODE(true),//cancelable
    BLOCK_HARVEST(false),
    BLOCK_INIT(false),
    BLOCK_NEIGHBOR(false),
    BLOCK_RAIN(false),
    BLOCK_REDSTONE(false),
    BLOCK_UPDATE(false),
    BLOCK_BREAK(false),
    CNPC_COLLIDE(false),
    CNPC_INIT(false),
    CNPC_INTERACT(true),
    CNPC_KILL(false),
    CNPC_UPDATE(false),
    CNPC_DAMAGE(true),
    CNPC_DIE(false);


    public boolean cancel;

    EventType(boolean cancel) {
        this.cancel = cancel;
    }
}
