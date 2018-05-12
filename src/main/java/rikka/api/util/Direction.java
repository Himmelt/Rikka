package rikka.api.util;

import com.flowpowered.math.GenericMath;
import com.flowpowered.math.TrigMath;
import rikka.api.util.math.Vector3d;
import rikka.api.util.math.Vector3i;

public enum Direction {
    NORTH(new Vector3d(0, 0, -1), Division.CARDINAL),
    NORTH_NORTHEAST(new Vector3d(C.S8, 0, -C.C8), Division.SECONDARY_ORDINAL),
    NORTHEAST(new Vector3d(1, 0, -1), Division.ORDINAL),
    EAST_NORTHEAST(new Vector3d(C.C8, 0, -C.S8), Division.SECONDARY_ORDINAL),

    EAST(new Vector3d(1, 0, 0), Division.CARDINAL),
    EAST_SOUTHEAST(new Vector3d(C.C8, 0, C.S8), Division.SECONDARY_ORDINAL),
    SOUTHEAST(new Vector3d(1, 0, 1), Division.ORDINAL),
    SOUTH_SOUTHEAST(new Vector3d(C.S8, 0, C.C8), Division.SECONDARY_ORDINAL),

    SOUTH(new Vector3d(0, 0, 1), Division.CARDINAL),
    SOUTH_SOUTHWEST(new Vector3d(-C.S8, 0, C.C8), Division.SECONDARY_ORDINAL),
    SOUTHWEST(new Vector3d(-1, 0, 1), Division.ORDINAL),
    WEST_SOUTHWEST(new Vector3d(-C.C8, 0, C.S8), Division.SECONDARY_ORDINAL),

    WEST(new Vector3d(-1, 0, 0), Division.CARDINAL),
    WEST_NORTHWEST(new Vector3d(-C.C8, 0, -C.S8), Division.SECONDARY_ORDINAL),
    NORTHWEST(new Vector3d(-1, 0, -1), Division.ORDINAL),
    NORTH_NORTHWEST(new Vector3d(-C.S8, 0, -C.C8), Division.SECONDARY_ORDINAL),

    UP(new Vector3d(0, 1, 0), Division.CARDINAL),
    DOWN(new Vector3d(0, -1, 0), Division.CARDINAL),

    NONE(new Vector3d(0, 0, 0), Division.NONE);

    private static final Direction[] SECONDARY_ORDINAL_SET = {
            NORTH, NORTH_NORTHEAST, NORTHEAST, EAST_NORTHEAST,
            EAST, EAST_SOUTHEAST, SOUTHEAST, SOUTH_SOUTHEAST,
            SOUTH, SOUTH_SOUTHWEST, SOUTHWEST, WEST_SOUTHWEST,
            WEST, WEST_NORTHWEST, NORTHWEST, NORTH_NORTHWEST,
    };
    private static final Direction[] ORDINAL_SET = {
            NORTH, NORTHEAST, EAST, SOUTHEAST,
            SOUTH, SOUTHWEST, WEST, NORTHWEST,
    };
    private static final Direction[] CARDINAL_SET = {
            NORTH, EAST, SOUTH, WEST
    };
    private final Vector3d offset;
    private final Vector3i blockOffset;
    private final Division division;
    private Direction opposite;

    static {
        NORTH.opposite = SOUTH;
        EAST.opposite = WEST;
        SOUTH.opposite = NORTH;
        WEST.opposite = EAST;

        UP.opposite = DOWN;
        DOWN.opposite = UP;

        NONE.opposite = NONE;

        NORTHEAST.opposite = SOUTHWEST;
        NORTHWEST.opposite = SOUTHEAST;
        SOUTHEAST.opposite = NORTHWEST;
        SOUTHWEST.opposite = NORTHEAST;

        WEST_NORTHWEST.opposite = EAST_SOUTHEAST;
        WEST_SOUTHWEST.opposite = EAST_NORTHEAST;
        NORTH_NORTHWEST.opposite = SOUTH_SOUTHEAST;
        NORTH_NORTHEAST.opposite = SOUTH_SOUTHWEST;
        EAST_SOUTHEAST.opposite = WEST_NORTHWEST;
        EAST_NORTHEAST.opposite = WEST_SOUTHWEST;
        SOUTH_SOUTHEAST.opposite = NORTH_NORTHWEST;
        SOUTH_SOUTHWEST.opposite = NORTH_NORTHEAST;
    }

    Direction(Vector3d direction, Division division) {
        if (direction.lengthSquared() == 0) {
            // Prevent normalization of the zero direction
            this.offset = direction;
        } else {
            this.offset = direction.normalize();
        }
        this.blockOffset = new Vector3i(direction.round());
        this.division = division;
    }

    public static Direction getClosest(Vector3d vector) {
        return getClosest(vector, Division.SECONDARY_ORDINAL);
    }

    public static Direction getClosest(Vector3d vector, Division smallestDivision) {
        if (vector.y * vector.y <= vector.x * vector.x + vector.z * vector.z) {
            return getClosestHorizontal(vector, smallestDivision);
        } else if (vector.y > 0) {
            return UP;
        } else {
            return DOWN;
        }
    }

    public static Direction getClosestHorizontal(Vector3d vector) {
        return getClosestHorizontal(vector, Division.SECONDARY_ORDINAL);
    }

    public static Direction getClosestHorizontal(Vector3d vector, Division smallestDivision) {
        // Ignore vectors not in the xz plane
        if (Math.abs(vector.x) <= GenericMath.DBL_EPSILON && Math.abs(vector.z) <= GenericMath.DBL_EPSILON) {
            return NONE;
        }
        // Normalize so it lies on the unit circle in xz
        vector = vector.normalize();
        // Get the angle from the x component and correct for complement with z
        double angle = TrigMath.acos(vector.x);
        if (vector.z < 0) {
            angle = TrigMath.TWO_PI - angle;
        }
        // Make the angle positive, offset for MC's system, then wrap in [0, 2pi)
        angle = (angle + TrigMath.TWO_PI + TrigMath.HALF_PI) % TrigMath.TWO_PI;
        // Use a direction set; it needs to be sorted and the directions evenly spaced
        final Direction[] set;
        switch (smallestDivision) {
            case CARDINAL:
                set = CARDINAL_SET;
                break;
            case ORDINAL:
                set = ORDINAL_SET;
                break;
            case SECONDARY_ORDINAL:
                set = SECONDARY_ORDINAL_SET;
                break;
            default:
                throw new IllegalArgumentException(smallestDivision.name());
        }
        // Round to the closest index in the direction set
        return set[(int) Math.round(angle * set.length / TrigMath.TWO_PI) % set.length];
    }

    public static Direction getFromAxis(final Axis axis) {
        switch (axis) {
            case X:
                return EAST;
            case Y:
                return UP;
            case Z:
                return SOUTH;
            default:
                throw new IllegalArgumentException(axis.name());
        }
    }

    public static Direction getFromAxis(final Axis axis, final AxisDirection direction) {
        switch (direction) {
            case PLUS:
                return getFromAxis(axis);
            case ZERO:
                return NONE;
            case MINUS:
                return getFromAxis(axis).getOpposite();
            default:
                throw new IllegalArgumentException(axis.name());
        }
    }

    public Direction getOpposite() {
        return this.opposite;
    }

    public boolean isOpposite(Direction d) {
        return this.opposite == d;
    }

    public boolean isCardinal() {
        return this.division == Division.CARDINAL;
    }

    public boolean isOrdinal() {
        return this.division == Division.ORDINAL;
    }

    public boolean isSecondaryOrdinal() {
        return this.division == Division.SECONDARY_ORDINAL;
    }

    public boolean isUpright() {
        return this == UP || this == DOWN;
    }

    public Vector3d asOffset() {
        return this.offset;
    }

    public Vector3i asBlockOffset() {
        return this.blockOffset;
    }

    private interface C {

        double C8 = Math.cos(Math.PI / 8);
        double S8 = Math.sin(Math.PI / 8);

    }

    public enum Division {

        CARDINAL,
        ORDINAL,
        SECONDARY_ORDINAL,
        NONE

    }

}
