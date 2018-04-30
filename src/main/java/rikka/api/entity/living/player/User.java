package rikka.api.entity.living.player;

import rikka.api.data.DataHolder;
import rikka.api.entity.IArmorEquipable;
import rikka.api.entity.ITamer;
import rikka.api.profile.GameProfile;
import rikka.api.service.permission.Permissible;
import rikka.api.util.math.Vector3d;

import java.util.Optional;
import java.util.UUID;

public interface User extends DataHolder, IArmorEquipable, ITamer, Permissible {

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
