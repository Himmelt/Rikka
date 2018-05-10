package rikka.api.world;

import rikka.api.util.generator.dummy.DummyObjectProvider;

public final class BlockChangeFlags {

    public static final BlockChangeFlag ALL = DummyObjectProvider.createFor(BlockChangeFlag.class, "ALL");

    public static final BlockChangeFlag NEIGHBOR = DummyObjectProvider.createFor(BlockChangeFlag.class, "NEIGHBOR");

    public static final BlockChangeFlag NEIGHBOR_OBSERVER = DummyObjectProvider.createFor(BlockChangeFlag.class, "NEIGHBOR_OBSERVER");

    public static final BlockChangeFlag NEIGHBOR_PHYSICS = DummyObjectProvider.createFor(BlockChangeFlag.class, "NEIGHBOR_PHYSICS");

    public static final BlockChangeFlag NEIGHBOR_PHYSICS_OBSERVER = DummyObjectProvider.createFor(BlockChangeFlag.class, "NEIGHBOR_PHYSICS_OBSERVER");

    public static final BlockChangeFlag NONE = DummyObjectProvider.createFor(BlockChangeFlag.class, "NONE");

    public static final BlockChangeFlag OBSERVER = DummyObjectProvider.createFor(BlockChangeFlag.class, "OBSERVER");

    public static final BlockChangeFlag PHYSICS = DummyObjectProvider.createFor(BlockChangeFlag.class, "PHYSICS");

    public static final BlockChangeFlag PHYSICS_OBSERVER = DummyObjectProvider.createFor(BlockChangeFlag.class, "PHYSICS_OBSERVER");

    private BlockChangeFlags() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }
}
