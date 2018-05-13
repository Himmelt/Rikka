package rikka.api.world;

import rikka.api.CatalogType;

public enum DimensionType implements CatalogType {

    NETHER,
    OVER_WORLD,
    THE_END;

    Class<? extends Dimension> getDimensionClass() {
        return null;
    }

    public String getId() {
        return null;
    }

    public String getName() {
        return null;
    }
}
