package rikka.api.util;

import com.flowpowered.math.vector.Vector3d;
import com.flowpowered.math.vector.Vector3f;
import com.flowpowered.math.vector.Vector3i;
import org.apache.commons.lang3.Validate;
import rikka.api.util.type.DyeColor;

import java.util.Objects;

import static com.google.common.base.Preconditions.checkArgument;

public final class Color {

    private static final int MASK = 0xFF;

    public static final Color BLACK = ofRgb(0x000000);

    public static final Color GRAY = ofRgb(0x808080);

    public static final Color WHITE = ofRgb(0xFFFFFF);

    public static final Color BLUE = ofRgb(0x0000FF);

    public static final Color GREEN = ofRgb(0x008000);

    public static final Color LIME = ofRgb(0x00FF00);

    public static final Color RED = ofRgb(0xFF0000);

    public static final Color YELLOW = ofRgb(0xFFFF00);

    public static final Color MAGENTA = ofRgb(0xFF00FF);

    public static final Color PURPLE = ofRgb(0xAA00FF);

    public static final Color DARK_CYAN = ofRgb(0x008B8B);

    public static final Color DARK_GREEN = ofRgb(0x006400);

    public static final Color DARK_MAGENTA = ofRgb(0x8B008B);

    public static final Color CYAN = ofRgb(0x00FFFF);

    public static final Color NAVY = ofRgb(0x000080);

    public static final Color PINK = ofRgb(0xFF00AA);

    public static Color ofRgb(int hex) {
        return ofRgb((hex >> 0x10) & MASK, (hex >> 0x8) & MASK, hex & MASK);
    }

    public static Color ofRgb(int red, int green, int blue) {
        return new Color(red, green, blue);
    }

    public static Color of(java.awt.Color color) {
        return new Color(color.getRed(), color.getGreen(), color.getBlue());
    }

    public static Color of(Vector3i vector3i) {
        return new Color(vector3i.getX(), vector3i.getY(), vector3i.getZ());
    }

    public static Color of(Vector3f vector3f) {
        return new Color(Math.round(vector3f.getX()), Math.round(vector3f.getY()), Math.round(vector3f.getZ()));
    }

    public static Color of(Vector3d vector3d) {
        return new Color((int) Math.round(vector3d.getX()), (int) Math.round(vector3d.getY()), (int) Math.round(vector3d.getZ()));
    }

    public static Color mixDyeColors(DyeColor... colors) {
        Validate.noNullElements(colors, "No nulls allowed!");
        final Color[] actualColors = new Color[colors.length];
        for (int i = 0; i < colors.length; i++) {
            actualColors[i] = colors[i].getColor();
        }

        return mixColors(actualColors);
    }

    public static Color mixColors(Color... colors) {
        Validate.noNullElements(colors, "No null colors allowed!");
        checkArgument(colors.length > 0, "Cannot have an empty color array!");
        if (colors.length == 1) {
            return colors[0];
        }
        int red = colors[0].getRed();
        int green = colors[0].getGreen();
        int blue = colors[0].getBlue();
        for (int i = 1; i < colors.length; i++) {
            red += colors[i].getRed();
            green += colors[i].getGreen();
            blue += colors[i].getBlue();
        }
        int averageRed = Math.round((float) red / colors.length);
        int averageGreen = Math.round((float) green / colors.length);
        int averageBlue = Math.round((float) blue / colors.length);
        return ofRgb(averageRed, averageGreen, averageBlue);
    }

    private final byte red;
    private final byte green;
    private final byte blue;
    private final int rgb;

    private Color(int red, int green, int blue) {
        this.red = (byte) (red & MASK);
        this.green = (byte) (green & MASK);
        this.blue = (byte) (blue & MASK);
        this.rgb = ((this.red & MASK) << 0x10)
                | ((this.green & MASK) << 0x8)
                | ((this.blue & MASK) << 0);
    }

    public int getRed() {
        return MASK & this.red;
    }

    public Color withRed(int red) {
        return ofRgb(red, getGreen(), getBlue());
    }

    public int getGreen() {
        return MASK & this.green;
    }

    public Color withGreen(int green) {
        return ofRgb(getRed(), green, getBlue());
    }

    public int getBlue() {
        return MASK & this.blue;
    }

    public Color withBlue(int blue) {
        return ofRgb(getRed(), getGreen(), blue);
    }

    public java.awt.Color asJavaColor() {
        return new java.awt.Color(getRed(), getGreen(), getBlue());
    }

    public int getRgb() {
        return this.rgb;
    }

    public Color mixWithColors(Color... colors) {
        Color[] newColorArray = new Color[colors.length + 1];
        newColorArray[0] = this;
        System.arraycopy(colors, 0, newColorArray, 1, colors.length);
        return mixColors(newColorArray);
    }

    public Color mixWithDyes(DyeColor... dyeColors) {
        Color[] newColorArray = new Color[dyeColors.length + 1];
        newColorArray[0] = this;
        for (int i = 0; i < dyeColors.length; i++) {
            newColorArray[i + 1] = dyeColors[i].getColor();
        }
        return mixColors(newColorArray);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Color.class, this.red, this.green, this.blue);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Color other = (Color) obj;
        return this.red == other.red && this.green == other.green && this.blue == other.blue;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this)
                .add("red", this.getRed())
                .add("green", this.getGreen())
                .add("blue", this.getBlue())
                .toString();
    }
}
