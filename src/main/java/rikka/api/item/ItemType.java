package rikka.api.item;

import rikka.api.CatalogType;
import rikka.api.block.BlockType;
import rikka.api.data.Property;
import rikka.api.text.translation.Translatable;
import rikka.api.util.annotation.CatalogedBy;

import java.util.Optional;

@CatalogedBy(ItemTypes.class)
public interface ItemType extends CatalogType, Translatable {

    Optional<BlockType> getBlock();

    @Override
    String getName();

    int getMaxStackQuantity();

    <T extends Property<?, ?>> Optional<T> getDefaultProperty(Class<T> propertyClass);

}
