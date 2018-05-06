package rikka.api.item;

import rikka.api.CatalogType;
import rikka.api.block.BlockType;
import rikka.api.text.translation.RTranslatable;
import rikka.api.util.annotation.CatalogedBy;

import java.util.Optional;

@CatalogedBy(ItemTypes.class)
public interface ItemType extends CatalogType, RTranslatable {

    Optional<BlockType> getBlock();

    @Override
    String getName();

    int getMaxStackQuantity();

}
