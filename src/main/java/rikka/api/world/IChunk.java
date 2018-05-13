package rikka.api.world;

import rikka.api.util.math.Vector3d;
import rikka.api.util.math.Vector3i;

public interface IChunk extends Extent {

    Location getLocation(Vector3i position);

    default Location getLocation(int x, int y, int z) {
        return getLocation(new Vector3i(x, y, z));
    }

    Location getLocation(Vector3d position);

    default Location getLocation(double x, double y, double z) {
        return getLocation(new Vector3d(x, y, z));
    }

    Vector3i getPosition();

    IWorld getWorld();

    boolean isPopulated();

    boolean loadChunk(boolean generate);

    boolean unloadChunk();

}
