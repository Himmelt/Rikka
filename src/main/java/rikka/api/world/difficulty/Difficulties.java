package rikka.api.world.difficulty;

import rikka.api.util.generator.dummy.DummyObjectProvider;

public final class Difficulties {

    // SORTFIELDS:ON

    public static final Difficulty EASY = DummyObjectProvider.createFor(Difficulty.class, "EASY");

    public static final Difficulty HARD = DummyObjectProvider.createFor(Difficulty.class, "HARD");

    public static final Difficulty NORMAL = DummyObjectProvider.createFor(Difficulty.class, "NORMAL");

    public static final Difficulty PEACEFUL = DummyObjectProvider.createFor(Difficulty.class, "PEACEFUL");

    // SORTFIELDS:OFF

    // Suppress default constructor to ensure non-instantiability.
    private Difficulties() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }

}
