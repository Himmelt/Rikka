package org.soraworld.rikka.effect.particle;

import org.spongepowered.api.CatalogType;

import java.util.Map;
import java.util.Optional;

public interface ParticleType extends CatalogType {

    <V> Optional<V> getDefaultOption(ParticleOption<V> option);

    Map<ParticleOption<?>, Object> getDefaultOptions();

}
