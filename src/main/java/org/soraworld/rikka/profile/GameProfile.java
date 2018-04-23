package org.soraworld.rikka.profile;

import javax.annotation.Nullable;
import java.util.UUID;

public interface GameProfile {

    static GameProfile of(UUID uuid) {
        return of(uuid, null);
    }

    static GameProfile of(UUID uniqueId, @Nullable String name) {
        // Sponge.getServer().getGameProfileManager().createProfile(uniqueId, name);
        return null;
    }

    UUID getUUID();

}
