package rikka.api.block.tileentity.carrier;

import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.tileentity.BeaconData;
import rikka.api.data.value.mutable.OptionalValue;
import rikka.api.effect.potion.PotionEffectType;

public interface Beacon extends TileEntityCarrier {
    int getCompletedLevels();

    default BeaconData getBeaconData() {
        return get(BeaconData.class).get();
    }

    default OptionalValue<PotionEffectType> primaryEffect() {
        return getValue(Keys.BEACON_PRIMARY_EFFECT).get();
    }

    default OptionalValue<PotionEffectType> secondaryEffect() {
        return getValue(Keys.BEACON_SECONDARY_EFFECT).get();
    }
}
