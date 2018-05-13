package rikka.api.world;

public interface BlockChangeFlag {

    boolean updateNeighbors();

    boolean performBlockPhysics();

    boolean notifyObservers();

    BlockChangeFlag withUpdateNeighbors(boolean updateNeighbors);

    BlockChangeFlag withPhysics(boolean performBlockPhysics);

    BlockChangeFlag withNotifyObservers(boolean notifyObservers);

    BlockChangeFlag inverse();

    BlockChangeFlag andFlag(BlockChangeFlag flag);

    BlockChangeFlag andNotFlag(BlockChangeFlag flag);

}
