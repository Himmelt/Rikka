package rikka.api.entity.living.player;

import rikka.api.entity.IArmorEquipable;
import rikka.api.profile.GameProfile;
import rikka.api.service.permission.Permissible;
import rikka.api.util.math.Vector3d;

import java.util.Optional;
import java.util.UUID;

public interface IUser extends IArmorEquipable, Permissible {

    GameProfile getProfile();

    String getName();

    boolean isOnline();

    IPlayer getPlayer();

    Vector3d getPosition();

    Optional<UUID> getWorldUniqueId();

    boolean setLocation(Vector3d position, UUID world);

}
