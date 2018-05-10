package rikka.api.world.extent;

import rikka.api.entity.EntityType;
import rikka.api.entity.IEntity;
import rikka.api.util.AABB;
import rikka.api.util.math.Vector3d;
import rikka.api.util.math.Vector3i;

import java.util.Collection;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;

import static com.google.common.base.Preconditions.checkNotNull;

public interface IEntityUniverse {

    IEntity getEntity(UUID uuid);

    Collection<IEntity> getEntities();

    Collection<IEntity> getEntities(Predicate<IEntity> filter);

    Collection<IEntity> getNearbyEntities(Vector3d location, double distance);

    IEntity createEntity(EntityType type, Vector3d position) throws IllegalArgumentException, IllegalStateException;

    default IEntity createEntity(EntityType type, Vector3i position) throws IllegalArgumentException, IllegalStateException {
        return createEntity(type, position);
    }

    IEntity createEntityNaturally(EntityType type, Vector3d position) throws IllegalArgumentException, IllegalStateException;

    default IEntity createEntityNaturally(EntityType type, Vector3i position) throws IllegalArgumentException, IllegalStateException {
        checkNotNull(position, "position");
        return createEntityNaturally(type, new Vector3d(position));
    }

    boolean spawnEntity(IEntity entity);

    Collection<IEntity> spawnEntities(Iterable<? extends IEntity> entities);

    default Set<IEntity> getIntersectingEntities(AABB box) {
        return getIntersectingEntities(box, entity -> true);
    }

    Set<IEntity> getIntersectingEntities(AABB box, Predicate<IEntity> filter);

    default Set<EntityHit> getIntersectingEntities(Vector3d start, Vector3d end) {
        return getIntersectingEntities(start, end, hit -> true);
    }

    Set<EntityHit> getIntersectingEntities(Vector3d start, Vector3d end, Predicate<EntityHit> filter);

    default Set<EntityHit> getIntersectingEntities(IEntity looker, double distance) {
        return getIntersectingEntities(looker, distance, hit -> true);
    }

    Set<EntityHit> getIntersectingEntities(IEntity looker, double distance, Predicate<EntityHit> filter);

    default Set<EntityHit> getIntersectingEntities(Vector3d start, Vector3d direction, double distance) {
        return getIntersectingEntities(start, direction, distance, hit -> true);
    }

    Set<EntityHit> getIntersectingEntities(Vector3d start, Vector3d direction, double distance, Predicate<EntityHit> filter);

    class EntityHit {

        private final IEntity entity;
        private final Vector3d intersection;
        private final Vector3d normal;
        private final double distance;

        /**
         * Creates a new entity hit from the entity, the intersection point and
         * the normal.
         *
         * @param entity       The intersected entity
         * @param intersection The intersection point
         * @param normal       The intersection normal
         * @param distance     The distance from the start to the intersection
         */
        public EntityHit(IEntity entity, Vector3d intersection, Vector3d normal, double distance) {
            this.entity = checkNotNull(entity, "entity");
            this.intersection = checkNotNull(intersection, "intersection");
            this.normal = checkNotNull(normal, "normal");
            this.distance = distance;
        }

        /**
         * Gets the intersected entity.
         *
         * @return The intersected entity
         */
        public IEntity getEntity() {
            return this.entity;
        }

        /**
         * Gets the intersection point.
         *
         * @return The point of intersection
         */
        public Vector3d getIntersection() {
            return this.intersection;
        }

        /**
         * Gets the intersection normal.
         *
         * @return The normal of intersection
         */
        public Vector3d getNormal() {
            return this.normal;
        }

        /**
         * Gets the distance from the start to the intersection.
         *
         * @return The distance from the start to the intersection
         */
        public double getDistance() {
            return this.distance;
        }

        @Override
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EntityHit)) {
                return false;
            }
            final EntityHit entityHit = (EntityHit) other;
            return this.entity.equals(entityHit.entity) && this.intersection.equals(entityHit.intersection) && this.normal.equals(entityHit.normal)
                    && this.distance == entityHit.distance;

        }

        @Override
        public int hashCode() {
            int result = this.entity.hashCode();
            result = 31 * result + this.intersection.hashCode();
            result = 31 * result + this.normal.hashCode();
            result = 31 * result + Double.hashCode(this.distance);
            return result;
        }

        @Override
        public String toString() {
            return "EntityHit(" + this.entity + " at " + this.intersection + " on " + this.normal + ")";
        }

    }

}
