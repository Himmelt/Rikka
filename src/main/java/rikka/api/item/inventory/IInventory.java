package rikka.api.item.inventory;

import rikka.api.item.ItemType;

import java.util.Optional;

public interface IInventory extends Iterable<IInventory> {

    IInventory parent();

    IInventory root();

    <I extends IInventory> Iterable<I> slots();

    <I extends IInventory> I first();

    <I extends IInventory> I next();

    Optional<IItemStack> poll();

    Optional<IItemStack> poll(int limit);

    Optional<IItemStack> peek();

    Optional<IItemStack> peek(int limit);

    void clear();

    int size();

    int totalItems();

    int capacity();

    boolean hasChildren();

    boolean contains(IItemStack stack);

    boolean contains(ItemType type);

    boolean containsAny(IItemStack stack);

    int getMaxStackSize();

    void setMaxStackSize(int size);
}
