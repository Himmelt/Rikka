package rikka.api.item;

import rikka.api.util.Color;

import java.util.List;

public interface FireworkEffect {

    boolean flickers();

    boolean hasTrail();

    List<Color> getColors();

    List<Color> getFadeColors();

    FireworkShape getShape();

}
