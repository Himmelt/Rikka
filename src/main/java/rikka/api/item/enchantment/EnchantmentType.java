package rikka.api.item.enchantment;

import rikka.api.CatalogType;
import rikka.api.item.inventory.IItemStack;
import rikka.api.text.translation.Translatable;
import rikka.api.util.annotation.CatalogedBy;

@CatalogedBy(EnchantmentTypes.class)
public interface EnchantmentType extends CatalogType, Translatable {

    int getWeight();

    int getMinimumLevel();

    int getMaximumLevel();

    int getMinimumEnchantabilityForLevel(int level);

    int getMaximumEnchantabilityForLevel(int level);

    boolean canBeAppliedToStack(IItemStack stack);

    boolean canBeAppliedByTable(IItemStack stack);

    boolean isCompatibleWith(EnchantmentType enchantmentType);

    boolean isTreasure();

    boolean isCurse();

}
