package rikka.api.block;

import rikka.api.CatalogType;
import rikka.api.block.trait.BlockTrait;
import rikka.api.data.property.PropertyHolder;
import rikka.api.item.ItemType;
import rikka.api.text.translation.Translatable;
import rikka.api.util.annotation.CatalogedBy;

import java.util.Collection;
import java.util.Optional;

@CatalogedBy(BlockTypes.class)
public interface BlockType extends CatalogType, Translatable, PropertyHolder {

    @Override
    String getName();

    IBlockState getDefaultState();

    Collection<IBlockState> getAllBlockStates();

    Optional<ItemType> getItem();

    boolean getTickRandomly();

    void setTickRandomly(boolean tickRandomly);

    Collection<BlockTrait<?>> getTraits();

    Optional<BlockTrait<?>> getTrait(String blockTrait);

}
