package org.soraworld.rikka.entity.living;

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.manipulator.mutable.entity.ArmorStandData;
import org.soraworld.rikka.data.manipulator.mutable.entity.BodyPartRotationalData;
import org.soraworld.rikka.data.value.mutable.Value;
import org.soraworld.rikka.entity.ArmorEquipable;

public interface ArmorStand extends Living, ArmorEquipable {

    default BodyPartRotationalData getBodyPartRotationalData() {
        return get(BodyPartRotationalData.class).get();
    }

    default Value<Boolean> marker() {
        return getValue(Keys.ARMOR_STAND_MARKER).get();
    }

    default Value<Boolean> small() {
        return getValue(Keys.ARMOR_STAND_IS_SMALL).get();
    }

    default Value<Boolean> basePlate() {
        return getValue(Keys.ARMOR_STAND_HAS_BASE_PLATE).get();
    }

    default Value<Boolean> arms() {
        return getValue(Keys.ARMOR_STAND_HAS_ARMS).get();
    }

    default ArmorStandData getArmorStandData() {
        return get(ArmorStandData.class).get();
    }
}
