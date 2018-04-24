package rikka.api.entity.living.player;

import org.soraworld.rikka.data.DataHolder;
import org.soraworld.rikka.entity.ArmorEquipable;
import org.soraworld.rikka.entity.Tamer;
import org.soraworld.rikka.profile.GameProfile;
import org.soraworld.rikka.util.math.Vector3d;
import rikka.api.service.permission.Permissible;

import java.util.Optional;
import java.util.UUID;

public interface User extends DataHolder, ArmorEquipable, Tamer, Permissible {

    GameProfile getProfile();

    String getName();

    boolean isOnline();

    IPlayer getPlayer();

    Vector3d getPosition();

    Optional<UUID> getWorldUniqueId();

    boolean setLocation(Vector3d position, UUID world);

    void setRotation(Vector3d rotation);

    Vector3d getRotation();

}
