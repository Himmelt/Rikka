package rikka.api.entity.projectile;

import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.TargetedLocationData;
import rikka.api.data.value.mutable.Value;
import rikka.api.util.math.Vector3d;

public interface IEyeOfEnder extends IProjectile {

    default TargetedLocationData getTargetLocationData() {
        return get(TargetedLocationData.class).get();
    }

    default Value<Vector3d> target() {
        return getValue(Keys.TARGETED_LOCATION).get();
    }

}
