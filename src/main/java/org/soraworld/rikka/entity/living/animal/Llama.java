package org.soraworld.rikka.entity.living.animal;

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.type.LlamaVariant;
import org.soraworld.rikka.data.value.mutable.MutableBoundedValue;
import org.soraworld.rikka.data.value.mutable.Value;
import org.soraworld.rikka.entity.projectile.ProjectileLauncher;

public interface Llama extends Horse, ProjectileLauncher {

    default MutableBoundedValue<Integer> strength() {
        return getValue(Keys.LLAMA_STRENGTH).get();
    }

    default Value<LlamaVariant> llamaVariant() {
        return getValue(Keys.LLAMA_VARIANT).get();
    }

}
