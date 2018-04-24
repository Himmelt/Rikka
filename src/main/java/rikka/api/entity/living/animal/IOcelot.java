package rikka.api.entity.living.animal;

import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.entity.OcelotData;
import rikka.api.data.type.OcelotType;
import rikka.api.data.value.mutable.Value;

public interface IOcelot extends IAnimal {

    default OcelotData getOcelotData() {
        return get(OcelotData.class).get();
    }

    default Value<OcelotType> variant() {
        return getValue(Keys.OCELOT_TYPE).get();
    }
}
