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

}

