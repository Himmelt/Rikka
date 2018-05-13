package rikka.sponge.item.inventory;

import org.spongepowered.api.item.inventory.Inventory;
import rikka.api.item.ItemType;
import rikka.api.item.inventory.IInventory;
import rikka.api.item.inventory.IItemStack;
import rikka.sponge.SpongeRikka;

import java.util.Iterator;
import java.util.Optional;

public class SpongeInventory<T extends Inventory> extends SpongeRikka<T> implements IInventory {
    public SpongeInventory(T source) {
        super(source);
    }

    public T getSource() {
        return source;
    }

    public IInventory parent() {
        return null;
    }

    public IInventory root() {
        return null;
    }

    public <I extends IInventory> Iterable<I> slots() {
        return null;
    }

    public <I extends IInventory> I first() {
        return null;
    }

    public <I extends IInventory> I next() {
        return null;
    }

    public Optional<IItemStack> poll() {
        return Optional.empty();
    }

    public Optional<IItemStack> poll(int limit) {
        return Optional.empty();
    }

    public Optional<IItemStack> peek() {
        return Optional.empty();
    }

    public Optional<IItemStack> peek(int limit) {
        return Optional.empty();
    }

    public void clear() {

    }

    public int size() {
        return 0;
    }

    public int totalItems() {
        return 0;
    }

    public int capacity() {
        return 0;
    }

    public boolean hasChildren() {
        return false;
    }

    public boolean contains(IItemStack stack) {
        return false;
    }

    public boolean contains(ItemType type) {
        return false;
    }

    public boolean containsAny(IItemStack stack) {
        return false;
    }

    public int getMaxStackSize() {
        return 0;
    }

    public void setMaxStackSize(int size) {

    }

    public Iterator<IInventory> iterator() {
        return null;
    }
}
