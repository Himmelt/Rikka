package org.soraworld.rikka.entity.living.animal;

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.manipulator.mutable.entity.ParrotData;
import org.soraworld.rikka.data.type.ParrotVariant;
import org.soraworld.rikka.data.value.mutable.Value;

public interface Parrot extends Animal {

    default ParrotData getParrotData() {
        return this.get(ParrotData.class).get();
    }

    default Value<ParrotVariant> variant() {
        return this.getValue(Keys.PARROT_VARIANT).get();
    }

}
