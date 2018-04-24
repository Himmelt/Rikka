package rikka.api.entity.living;

import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.entity.ArmorStandData;
import rikka.api.data.manipulator.mutable.entity.BodyPartRotationalData;
import rikka.api.data.value.mutable.Value;
import rikka.api.entity.ArmorEquipable;

public interface ArmorStand extends ILiving, ArmorEquipable {

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
