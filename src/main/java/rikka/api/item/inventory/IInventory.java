package rikka.api.item.inventory;

import rikka.api.Nameable;
import rikka.api.item.ItemType;
import rikka.api.item.inventory.query.QueryOperation;
import rikka.api.item.inventory.query.QueryOperationTypes;
import rikka.api.item.inventory.transaction.InventoryTransactionResult;
import rikka.api.text.translation.Translation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface IInventory extends Iterable<IInventory>, Nameable {

    IInventory parent();

    IInventory root();

    <T extends IInventory> Iterable<T> slots();

    <T extends IInventory> T first();

    <T extends IInventory> T next();

    Optional<IItemStack> poll();

    Optional<IItemStack> poll(int limit);

    Optional<IItemStack> peek();

    Optional<IItemStack> peek(int limit);

    InventoryTransactionResult offer(IItemStack stack);

    InventoryTransactionResult set(IItemStack stack);

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

    <T extends InventoryProperty<?, ?>> Collection<T> getProperties(IInventory child, Class<T> property);

    <T extends InventoryProperty<?, ?>> Collection<T> getProperties(Class<T> property);

    <T extends InventoryProperty<?, ?>> Optional<T> getProperty(IInventory child, Class<T> property, Object key);

    <T extends InventoryProperty<?, ?>> Optional<T> getProperty(Class<T> property, Object key);

    <T extends InventoryProperty<?, ?>> Optional<T> getInventoryProperty(IInventory child, Class<T> property);

    <T extends InventoryProperty<?, ?>> Optional<T> getInventoryProperty(Class<T> property);

    @Deprecated
    default <T extends IInventory> T query(Class<?>... types) {
        QueryOperation<?>[] operations = new QueryOperation<?>[types.length];
        for (int i = 0; i < types.length; i++) {
            if (IInventory.class.isAssignableFrom(types[i])) {
                operations[i] = QueryOperationTypes.INVENTORY_TYPE.of(types[i].asSubclass(IInventory.class));
            } else {
                operations[i] = QueryOperationTypes.TYPE.of(types[i]);
            }
        }
        return query(operations);
    }

    @Deprecated
    default <T extends IInventory> T query(ItemType... types) {
        QueryOperation<?>[] operations = new QueryOperation<?>[types.length];
        for (int i = 0; i < types.length; i++) {
            operations[i] = QueryOperationTypes.ITEM_TYPE.of(types[i]);
        }
        return query(operations);
    }

    @Deprecated
    default <T extends IInventory> T query(IItemStack... types) {
        QueryOperation<?>[] operations = new QueryOperation<?>[types.length];
        for (int i = 0; i < types.length; i++) {
            operations[i] = QueryOperationTypes.ITEM_STACK_EXACT.of(types[i]);
        }
        return query(operations);
    }

    @Deprecated
    default <T extends IInventory> T query(InventoryProperty<?, ?>... props) {
        QueryOperation<?>[] operations = new QueryOperation<?>[props.length];
        for (int i = 0; i < props.length; i++) {
            operations[i] = QueryOperationTypes.INVENTORY_PROPERTY.of(props[i]);
        }
        return query(operations);
    }

    @Deprecated
    default <T extends IInventory> T query(Translation... names) {
        QueryOperation<?>[] operations = new QueryOperation<?>[names.length];
        for (int i = 0; i < names.length; i++) {
            operations[i] = QueryOperationTypes.INVENTORY_TRANSLATION.of(names[i]);
        }
        return query(operations);
    }

    @Deprecated
    default <T extends IInventory> T query(Object... args) {
        List<QueryOperation<?>> operations = new ArrayList<>(args.length);
        for (Object arg : args) {
            if (arg instanceof InventoryProperty) {
                operations.add(QueryOperationTypes.INVENTORY_PROPERTY.of((InventoryProperty<?, ?>) arg));
            } else if (arg instanceof Translation) {
                operations.add(QueryOperationTypes.INVENTORY_TRANSLATION.of((Translation) arg));
            } else if (arg instanceof Class && IInventory.class.isAssignableFrom((Class<?>) arg)) {
                operations.add(QueryOperationTypes.INVENTORY_TYPE.of(((Class<?>) arg).asSubclass(IInventory.class)));
            } else if (arg instanceof IItemStack) {
                operations.add(QueryOperationTypes.ITEM_STACK_IGNORE_QUANTITY.of((IItemStack) arg));
            } else if (arg instanceof ItemType) {
                operations.add(QueryOperationTypes.ITEM_TYPE.of((ItemType) arg));
            }
            // Other objects never really worked anyways. Strings failed all
            // tests, and because the lens should never be exposed, I don't
            // think the generic test "arg.equals(lens)" was ever made use of.
        }
        return query(operations.toArray(new QueryOperation<?>[operations.size()]));
    }

    @Deprecated
    default <T extends IInventory> T queryAny(IItemStack... types) {
        QueryOperation<?>[] operations = new QueryOperation<?>[types.length];
        for (int i = 0; i < types.length; i++) {
            operations[i] = QueryOperationTypes.ITEM_STACK_IGNORE_QUANTITY.of(types[i]);
        }
        return query(operations);
    }

    <T extends IInventory> T query(QueryOperation<?>... operations);

    InventoryArchetype getArchetype();

    IInventory intersect(IInventory inventory);

    IInventory union(IInventory inventory);

    boolean containsInventory(IInventory inventory);
}
