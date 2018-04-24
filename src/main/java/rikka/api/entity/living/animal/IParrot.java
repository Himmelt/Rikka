package rikka.api.entity.living.animal;

import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.entity.ParrotData;
import rikka.api.data.type.ParrotVariant;
import rikka.api.data.value.mutable.Value;

public interface IParrot extends IAnimal {

    default ParrotData getParrotData() {
        return this.get(ParrotData.class).get();
    }

    default Value<ParrotVariant> variant() {
        return this.getValue(Keys.PARROT_VARIANT).get();
    }

}
