package rikka.api.entity.living.player.gamemode;

public enum GameMode {
    CREATIVE(1),
    SURVIVAL(0),
    ADVENTURE(2),
    SPECTATOR(3);

    private final int id;

    GameMode(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}
