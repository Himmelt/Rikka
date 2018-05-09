package rikka.api.item.inventory.crafting;

import rikka.api.item.inventory.type.GridInventory;
import rikka.api.item.recipe.crafting.CraftingRecipe;
import rikka.api.world.IWorld;

import java.util.Optional;

public interface CraftingGridInventory extends GridInventory {
    Optional<CraftingRecipe> getRecipe(IWorld world);
}
