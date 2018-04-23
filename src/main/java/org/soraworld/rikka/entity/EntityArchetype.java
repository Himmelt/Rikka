package org.soraworld.rikka.entity;

import org.soraworld.rikka.data.Archetype;
import org.soraworld.rikka.data.DataContainer;
import org.soraworld.rikka.data.DataView;
import org.soraworld.rikka.data.key.Key;
import org.soraworld.rikka.data.manipulator.DataManipulator;
import org.soraworld.rikka.data.persistence.DataBuilder;
import org.soraworld.rikka.data.persistence.InvalidDataException;
import org.soraworld.rikka.data.value.BaseValue;

public interface EntityArchetype extends Archetype<EntitySnapshot, Entity> {

    static Builder builder() {
        return null;//Sponge.getRegistry().createBuilder(Builder.class);
    }

    static EntityArchetype of(EntityType type) {
        return builder().type(type).build();
    }

    EntityType getType();

    DataContainer getEntityData();

    @Override
    void setRawData(DataView container) throws InvalidDataException;

    @Override
    EntityArchetype copy();

    interface Builder extends DataBuilder<EntityArchetype> {

        @Override
        Builder reset();

        @Override
        Builder from(EntityArchetype value);

        /**
         * Sets all possible bits of information from the provided {@link Entity}.
         *
         * @param entity The entity to get information from
         * @return This builder, for chaining
         */
        Builder from(Entity entity);

        /**
         * Sets the desired {@link EntityType} of the produced {@link EntityArchetype}.
         *
         * @param type The type of entity type
         * @return This builder, for chaining
         */
        Builder type(EntityType type);

        /**
         * Sets the desired {@link EntityType} of the produced {@link EntityArchetype}.
         *
         * @param view The data to set for the archetype
         * @return This builder, for chaining
         */
        Builder entityData(DataView view);

        /**
         * Sets the desired {@link EntityType} of the produced {@link EntityArchetype}.
         *
         * @param manipulator The manipulator to set for the archetype
         * @return This builder, for chaining
         */
        Builder setData(DataManipulator<?, ?> manipulator);

        /**
         * Sets the desired {@link EntityType} of the produced {@link EntityArchetype}.
         *
         * @param value The type of entity type
         * @return This builder, for chaining
         */
        <E, V extends BaseValue<E>> Builder set(V value);

        /**
         * Sets the desired {@link EntityType} of the produced {@link EntityArchetype}.
         *
         * @param key   The key
         * @param value The value to set
         * @return This builder, for chaining
         */
        <E, V extends BaseValue<E>> Builder set(Key<V> key, E value);

        /**
         * Constructs a new {@link EntityArchetype}.
         *
         * @return The new entity archetype
         */
        EntityArchetype build();
    }

}
