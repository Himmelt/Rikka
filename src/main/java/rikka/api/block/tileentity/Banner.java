package rikka.api.block.tileentity;

import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.tileentity.BannerData;
import rikka.api.data.type.DyeColor;
import rikka.api.data.value.mutable.PatternListValue;
import rikka.api.data.value.mutable.Value;

public interface Banner extends TileEntity {
    default BannerData getBannerData() {
        return get(BannerData.class).get();
    }

    default Value<DyeColor> baseColor() {
        return getValue(Keys.BANNER_BASE_COLOR).get();
    }

    default PatternListValue patternsList() {
        return getValue(Keys.BANNER_PATTERNS).get();
    }
}
