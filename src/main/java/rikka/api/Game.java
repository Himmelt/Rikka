package rikka.api;

import java.nio.file.Path;

public interface Game {

    Path getGameDirectory();

    Path getSavesDirectory();

    boolean isServerAvailable();

    Server getServer();

}
