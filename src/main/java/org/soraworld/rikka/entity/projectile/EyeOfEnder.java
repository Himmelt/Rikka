package org.soraworld.rikka.entity.projectile;

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.manipulator.mutable.TargetedLocationData;
import org.soraworld.rikka.data.value.mutable.Value;
import org.soraworld.rikka.util.math.Vector3d;

public interface EyeOfEnder extends Projectile {

    default TargetedLocationData getTargetLocationData() {
        return get(TargetedLocationData.class).get();
    }

    default Value<Vector3d> target() {
        return getValue(Keys.TARGETED_LOCATION).get();
    }

}
