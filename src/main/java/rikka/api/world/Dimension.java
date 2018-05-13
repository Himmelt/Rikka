package rikka.api.world;

import org.spongepowered.api.service.context.ContextSource;
import org.spongepowered.api.world.GeneratorType;

public interface Dimension extends ContextSource {

    DimensionType getType();

    GeneratorType getGeneratorType();

    boolean allowsPlayerRespawns();

    int getMinimumSpawnHeight();

    boolean doesWaterEvaporate();

    boolean hasSky();

    int getHeight();

    int getBuildHeight();
}
