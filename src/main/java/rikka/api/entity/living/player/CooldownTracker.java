package rikka.api.entity.living.player;

import rikka.api.item.ItemType;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public interface CooldownTracker {

    boolean hasCooldown(ItemType type);

    OptionalInt getCooldown(ItemType type);

    boolean setCooldown(ItemType type, int ticks);

    boolean resetCooldown(ItemType type);

    OptionalDouble getFractionRemaining(ItemType type);

}
