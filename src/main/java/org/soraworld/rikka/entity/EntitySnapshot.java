package org.soraworld.rikka.entity;

import org.soraworld.rikka.data.ImmutableDataBuilder;
import org.soraworld.rikka.data.LocatableSnapshot;
import org.soraworld.rikka.util.math.Vector3d;
import org.soraworld.rikka.world.World;
import org.soraworld.rikka.world.storage.WorldProperties;

import java.util.Optional;
import java.util.UUID;

public interface EntitySnapshot extends LocatableSnapshot<EntitySnapshot> {

    static Builder builder() {
        return null;// Sponge.getRegistry().createBuilder(Builder.class);
    }

    Optional<UUID> getUniqueId();

    Optional<Transform<World>> getTransform();

    EntityType getType();

    Optional<Entity> restore();

    EntityArchetype createArchetype();

    interface Builder extends ImmutableDataBuilder<EntitySnapshot, Builder> {
        Builder world(WorldProperties worldProperties);

        Builder type(EntityType entityType);

        Builder position(Vector3d position);

        Builder from(Entity entity);
    }

}
