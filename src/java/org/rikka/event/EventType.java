package org.rikka.event;

public enum EventType {

    BLOCK_ACTIVE("active", true),
    BLOCK_BREAK("break", false),
    BLOCK_CLICK("click", false),
    BLOCK_COLLIDE("collide", false),
    BLOCK_EXPLODE("explode", true),
    BLOCK_FALLEN("fallen", true),
    BLOCK_HARVEST("harvest", false),
    BLOCK_INIT("init", false),
    BLOCK_NEIGHBOR("neighbor", false),
    BLOCK_RAIN("rain", false),
    BLOCK_REDSTONE("redstone", false),
    BLOCK_UPDATE("update", false),

    CNPC_COLLIDE("collide", false),
    CNPC_DAMAGE("damage", true),
    CNPC_DIE("died", false),
    CNPC_INIT("init", false),
    CNPC_INTERACT("interact", true),
    CNPC_KILL("kill", false),
    CNPC_UPDATE("update", false),

    PLAYER_TOSS("toss", true);

    public String hook;
    public boolean cancel;

    EventType(String hook, boolean cancel) {
        this.hook = hook;
        this.cancel = cancel;
    }
}
