package rikka.api;

import java.nio.file.Path;

public interface IGame {

    Path getGameDirectory();

    Path getSavesDirectory();

    boolean isServerAvailable();

    IServer getServer();

}
