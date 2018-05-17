package rikka.api.entity.living.player;

import rikka.api.entity.api.ArmorEquipable;
import rikka.api.profile.GameProfile;
import rikka.api.service.permission.Permissible;
import rikka.api.util.math.Vector3d;

import java.util.UUID;

public interface RUser extends ArmorEquipable, Permissible {

    GameProfile getProfile();

    String getName();

    boolean isOnline();

    IPlayer getPlayer();

    Vector3d getPosition();

    boolean setLocation(Vector3d position, UUID world);

}
