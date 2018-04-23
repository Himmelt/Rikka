package org.soraworld.rikka.entity.living.animal;

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.manipulator.mutable.entity.OcelotData;
import org.soraworld.rikka.data.type.OcelotType;
import org.soraworld.rikka.data.value.mutable.Value;

public interface Ocelot extends Animal {

    default OcelotData getOcelotData() {
        return get(OcelotData.class).get();
    }

    default Value<OcelotType> variant() {
        return getValue(Keys.OCELOT_TYPE).get();
    }
}
