package rikka.sponge.item.inventory;

import org.spongepowered.api.item.inventory.Container;
import rikka.api.entity.living.player.IPlayer;
import rikka.api.item.ItemType;
import rikka.api.item.inventory.IContainer;
import rikka.api.item.inventory.IInventory;
import rikka.api.item.inventory.IItemStack;

import java.util.Iterator;
import java.util.Optional;
import java.util.Set;

public class SpongeContainer extends SpongeInventory<Container> implements IContainer {

    public SpongeContainer(Container source) {
        super(source);
    }

    public Container getSource() {
        return source;
    }

    public Set<IPlayer> getViewers() {
        return null;
    }

    public boolean hasViewers() {
        return false;
    }

    public void open(IPlayer viewer) throws IllegalArgumentException {

    }

    public void close(IPlayer viewer) throws IllegalArgumentException {

    }

    public boolean canInteractWith(IPlayer player) {
        return false;
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
