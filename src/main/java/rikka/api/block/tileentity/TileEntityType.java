package rikka.api.block.tileentity;

import rikka.api.CatalogType;
import rikka.api.util.annotation.CatalogedBy;

@CatalogedBy(TileEntityTypes.class)
public interface TileEntityType extends CatalogType {
    Class<? extends TileEntity> getTileEntityType();
}
