package rikka.api.block.tileentity;

import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.tileentity.SignData;
import rikka.api.data.value.mutable.ListValue;
import rikka.api.text.Text;

public interface Sign extends TileEntity {
    default SignData getSignData() {
        return get(SignData.class).get();
    }

    default ListValue<Text> lines() {
        return getValue(Keys.SIGN_LINES).get();
    }
}
