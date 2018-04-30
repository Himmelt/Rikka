package rikka.api.entity;

import rikka.api.data.ImmutableDataBuilder;
import rikka.api.data.LocatableSnapshot;
import rikka.api.util.math.Vector3d;
import rikka.api.world.IWorld;
import rikka.api.world.storage.WorldProperties;

import java.util.Optional;
import java.util.UUID;

public interface EntitySnapshot extends LocatableSnapshot<EntitySnapshot> {

    static Builder builder() {
        return null;// Sponge.getRegistry().createBuilder(Builder.class);
    }

    Optional<UUID> getUniqueId();

    Optional<Transform<IWorld>> getTransform();

    EntityType getType();

    Optional<IEntity> restore();

    EntityArchetype createArchetype();

    interface Builder extends ImmutableDataBuilder<EntitySnapshot, Builder> {
        Builder world(WorldProperties worldProperties);

        Builder type(EntityType entityType);

        Builder position(Vector3d position);

        Builder from(IEntity entity);
    }

}
