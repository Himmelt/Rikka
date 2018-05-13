package rikka.api.world.explosion;

import rikka.api.entity.explosive.IExplosive;
import rikka.api.world.Locatable;

public interface Explosion extends Locatable {

    IExplosive getSourceExplosive();

    float getRadius();

    boolean canCauseFire();

    boolean shouldPlaySmoke();

    boolean shouldBreakBlocks();

    boolean shouldDamageEntities();

}
