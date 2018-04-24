package rikka.api.entity.projectile;

import org.soraworld.rikka.util.math.Vector3d;
import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.TargetedLocationData;
import rikka.api.data.value.mutable.Value;

public interface EyeOfEnder extends Projectile {

    default TargetedLocationData getTargetLocationData() {
        return get(TargetedLocationData.class).get();
    }

    default Value<Vector3d> target() {
        return getValue(Keys.TARGETED_LOCATION).get();
    }

}
