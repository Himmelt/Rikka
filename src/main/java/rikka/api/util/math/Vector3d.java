package rikka.api.util.math;

public class Vector3d {
    public double x, y, z;
    public static final Vector3d ZERO = new Vector3d(0, 0, 0);
    public static final Vector3d ONE = new Vector3d(1, 1, 1);

    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3d(com.flowpowered.math.vector.Vector3d rotation) {
        this.x = rotation.getX();
        this.y = rotation.getY();
        this.z = rotation.getZ();
    }

    public Vector3d(org.bukkit.util.Vector direction) {
        this.x = direction.getX();
        this.y = direction.getY();
        this.z = direction.getZ();
    }

    public Vector3d(Vector3i position) {
        this.x = position.x;
        this.y = position.y;
        this.z = position.z;
    }

    public Vector3d round() {
        return new Vector3d(Math.round(x), Math.round(y), Math.round(z));
    }

    public Vector3d normalize() {
        final double length = length();
        if (Math.abs(length) < Double.longBitsToDouble(0x3cb0000000000000L)) {
            throw new ArithmeticException("Cannot normalize the zero vector");
        }
        return new Vector3d(x / length, y / length, z / length);
    }

    public double lengthSquared() {
        return x * x + y * y + z * z;
    }

    public double length() {
        return Math.sqrt(lengthSquared());
    }
}

