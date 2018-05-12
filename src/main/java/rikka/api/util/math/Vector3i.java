package rikka.api.util.math;

public class Vector3i {
    public int x, y, z;

    public Vector3i(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3i(Vector3d vector3d) {
        this.x = (int) vector3d.x;
        this.y = (int) vector3d.y;
        this.z = (int) vector3d.z;
    }
}
