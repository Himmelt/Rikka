package rikka.api.world.explosion;

import rikka.api.entity.api.Explosive;
import rikka.api.world.Locatable;

public interface Explosion extends Locatable {

    Explosive getSourceExplosive();

    float getRadius();

    boolean canCauseFire();

    boolean shouldPlaySmoke();

    boolean shouldBreakBlocks();

    boolean shouldDamageEntities();

}
