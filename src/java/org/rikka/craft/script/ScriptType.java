package org.rikka.craft.script;

public enum ScriptType {
    INIT("INIT", 0, "init"),
    TICK("TICK", 1, "tick"),
    INTERACT("INTERACT", 2, "interact"),
    DIALOG("DIALOG", 3, "dialog"),
    DAMAGED("DAMAGED", 4, "damaged"),
    DIED("DIED", 5, "died"),
    ATTACK_MELEE("ATTACK_MELEE", 6, "meleeAttack"),
    TARGET("TARGET", 7, "target"),
    COLLIDE("COLLIDE", 8, "collide"),
    KILL("KILL", 9, "kill"),
    DIALOG_OPTION("DIALOG_OPTION", 10, "dialog_option"),
    TARGET_LOST("TARGET_LOST", 11, "targetLost"),
    ROLE("ROLE", 12, "role"),
    RANGED_LAUNCHED("RANGED_LAUNCHED", 13, "rangedLaunched"),
    CLICKED("CLICKED", 14, "clicked"),
    FALLEN_UPON("FALLEN_UPON", 15, "fallenUpon"),
    RAIN_FILLED("RAIN_FILLED", 16, "rainFilled"),
    BROKEN("BROKEN", 17, "broken"),
    HARVESTED("HARVESTED", 18, "harvested"),
    EXPLODED("EXPLODED", 19, "exploded"),
    NEIGHBOR_CHANGED("NEIGHBOR_CHANGED", 20, "neighborChanged"),
    REDSTONE("REDSTONE", 21, "redstone"),
    DOOR_TOGGLE("DOOR_TOGGLE", 22, "doorToggle"),
    TIMER("TIMER", 23, "timer"),
    TOSS("TOSS", 24, "toss"),
    CONTAINER_OPEN("CONTAINER_OPEN", 25, "containerOpen"),
    CONTAINER_CLOSED("CONTAINER_CLOSED", 26, "containerClosed");

    public String function;

    ScriptType(String type, int value, String function) {
        this.function = function;
    }
}
