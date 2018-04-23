package org.soraworld.rikka.entity;

import org.soraworld.rikka.util.math.Vector3d;
import org.soraworld.rikka.world.Location;
import org.soraworld.rikka.world.extent.Extent;

import javax.annotation.Nullable;

public final class Transform<E extends Extent> {

    private final E extent;
    private final Vector3d position;
    private final Vector3d rotation;
    private final Vector3d scale;
    @Nullable
    private Location<E> location = null;

    public Transform(Location<E> location) {
        this(location.getExtent(), location.getPosition());
    }

    public Transform(E extent) {
        this(extent, Vector3d.ZERO);
    }

    public Transform(E extent, Vector3d position) {
        this(extent, position, Vector3d.ZERO);
    }

    public Transform(E extent, Vector3d position, Vector3d rotation) {
        this(extent, position, rotation, Vector3d.ONE);
    }

    public Transform(Location<E> location, Vector3d rotation, Vector3d scale) {
        this(location.getExtent(), location.getPosition(), rotation, scale);
    }

    public Transform(E extent, Vector3d position, Vector3d rotation, Vector3d scale) {
        this.extent = extent;//checkNotNull(extent, "extent");
        this.position = position;//checkNotNull(position, "position");
        this.rotation = rotation;//checkNotNull(rotation, "rotation");
        this.scale = scale;//checkNotNull(scale, "scale");
    }

    public Location<E> getLocation() {
        if (this.location == null) {
            this.location = new Location<>(this.extent, this.position);
        }
        return this.location;
    }

    public Transform<E> setLocation(Location<E> location) {
        return new Transform<>(location, getRotation(), getScale());
    }

    public E getExtent() {
        return this.extent;
    }

    public Transform<E> setExtent(E extent) {
        return new Transform<>(extent, getPosition(), getRotation(), getScale());
    }

    public Vector3d getPosition() {
        return this.position;
    }

    public Transform<E> setPosition(Vector3d position) {
        return new Transform<>(getExtent(), position, getRotation(), getScale());
    }

    public Vector3d getRotation() {
        return this.rotation;
    }

    public Transform<E> setRotation(Vector3d rotation) {
        return new Transform<>(getExtent(), getPosition(), rotation, getScale());
    }

    public double getPitch() {
        return this.rotation.x;
    }

    public double getYaw() {
        return this.rotation.y;
    }

    public double getRoll() {
        return this.rotation.z;
    }

    public Vector3d getScale() {
        return this.scale;
    }

    public Transform<E> setScale(Vector3d scale) {
        return new Transform<>(getExtent(), getPosition(), getRotation(), scale);
    }

    public Transform<E> add(Transform<E> other) {
        return null;
    }

    public Transform<E> addTranslation(Vector3d translation) {
        return null;
    }

    public Transform<E> addRotation(Vector3d rotation) {
        return null;
    }

    public Transform<E> addScale(Vector3d scale) {
        return null;
    }

    public boolean isValid() {
        return this.extent.isLoaded();
    }

    @Override
    public int hashCode() {
        int result = this.extent.hashCode();
        result = 31 * result + this.position.hashCode();
        result = 31 * result + this.rotation.hashCode();
        result = 31 * result + this.scale.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Transform<?>)) {
            return false;
        }
        final Transform<?> otherTransform = (Transform<?>) other;
        return otherTransform.extent.equals(this.extent) && otherTransform.getPosition().equals(getPosition())
                && otherTransform.getRotation().equals(getRotation()) && otherTransform.getScale().equals(getScale());
    }

    @Override
    public String toString() {
        return "null";
    }

}
