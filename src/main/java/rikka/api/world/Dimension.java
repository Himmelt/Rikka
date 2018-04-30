package rikka.api.world;

import rikka.api.service.context.ContextSource;

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
