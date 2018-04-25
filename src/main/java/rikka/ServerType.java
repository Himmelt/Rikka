package rikka;

import org.bukkit.Bukkit;
import org.spongepowered.api.Sponge;

public enum ServerType {

    UNKNOWN, BUKKIT, SPONGE;

    private static final ServerType serverType;

    static {
        ServerType type;
        if (Bukkit.getServer() != null) {
            type = ServerType.BUKKIT;
            System.out.println("Running Bukkit Server.");
        } else {
            try {
                Sponge.getServer();
                type = ServerType.SPONGE;
                System.out.println("Running Sponge Server.");
            } catch (Throwable e) {
                type = ServerType.UNKNOWN;
                System.out.println("Running Unknown Server.");
            }
        }
        serverType = type;
    }

    public static ServerType getServerType() {
        return serverType;
    }

    public static boolean runningSponge() {
        return serverType == SPONGE;
    }

    public static boolean runningBukkit() {
        return serverType == BUKKIT;
    }

}
