package rikka.api.entity.living.animal;

import rikka.api.data.key.Keys;
import rikka.api.data.type.LlamaVariant;
import rikka.api.data.value.mutable.MutableBoundedValue;
import rikka.api.data.value.mutable.Value;
import rikka.api.entity.projectile.IProjectileLauncher;

public interface ILlama extends IHorse, IProjectileLauncher {

    default MutableBoundedValue<Integer> strength() {
        return getValue(Keys.LLAMA_STRENGTH).get();
    }

    default Value<LlamaVariant> llamaVariant() {
        return getValue(Keys.LLAMA_VARIANT).get();
    }

}
