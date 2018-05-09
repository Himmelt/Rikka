package rikka.api.item.inventory.crafting;

import rikka.api.item.inventory.type.OrderedInventory;
import rikka.api.item.recipe.crafting.CraftingRecipe;
import rikka.api.world.IWorld;

import java.util.Optional;

public interface CraftingInventory extends OrderedInventory {
    CraftingGridInventory getCraftingGrid();

    CraftingOutput getResult();

    default Optional<CraftingRecipe> getRecipe(IWorld world) {
        return getCraftingGrid().getRecipe(world);
    }
}
