package rikka.api.world;

import com.flowpowered.math.vector.Vector3d;
import com.flowpowered.math.vector.Vector3i;
import rikka.api.world.extent.Extent;

public interface IChunk extends Extent {

    @Override
    default Location getLocation(Vector3i position) {
        return new Location(this, position);
    }

    @Override
    default Location getLocation(int x, int y, int z) {
        return getLocation(new Vector3i(x, y, z));
    }

    @Override
    default Location getLocation(Vector3d position) {
        return new Location(this, position);
    }

    @Override
    default Location getLocation(double x, double y, double z) {
        return getLocation(new Vector3d(x, y, z));
    }

    Vector3i getPosition();

    IWorld getWorld();

    boolean isPopulated();

    boolean loadChunk(boolean generate);

    boolean unloadChunk();

}