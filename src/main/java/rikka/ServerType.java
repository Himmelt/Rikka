package rikka;

import org.bukkit.Bukkit;
import org.spongepowered.api.Sponge;

public final class ServerType {

    public static final boolean UNKNOWN, BUKKIT, SPONGE;

    static {
        boolean unknown, bukkit, sponge;
        if (Bukkit.getServer() != null) {
            bukkit = true;
            unknown = false;
            sponge = false;
        } else {
            bukkit = false;
            try {
                Sponge.getServer();
                sponge = true;
                unknown = false;
            } catch (Throwable e) {
                sponge = false;
                unknown = true;
            }
        }
        UNKNOWN = unknown;
        BUKKIT = bukkit;
        SPONGE = sponge;
    }

}
