package rikka.sponge.entity;

import org.spongepowered.api.entity.living.Living;
import rikka.api.entity.living.ILiving;
import rikka.api.entity.projectile.IProjectile;
import rikka.api.text.Text;
import rikka.api.text.translation.Translation;
import rikka.api.util.math.Vector3d;

import java.util.Optional;

public class SpongeLiving<T extends Living> extends SpongeEntity<T> implements ILiving {

    public SpongeLiving(T source) {
        super(source);
    }

    public double health() {
        return source.health().get();
    }

    public void setHealth(double health) {
        source.health().set(health);
    }

    public double maxHealth() {
        return source.maxHealth().get();
    }

    public void setMaxHealth(double maxHealth) {
        source.maxHealth().set(maxHealth);
    }

    public double lastDamage() {
        return source.lastDamage().or(0D).get();
    }

    public <P extends IProjectile> P launchProjectile(Class<P> projectileClass) {
        source.launchProjectile(projectileClass);
        return Optional.empty();
    }

    public <P extends IProjectile> Optional<P> launchProjectile(Class<P> projectileClass, Vector3d velocity) {
        return Optional.empty();
    }

    public Text getTeamRepresentation() {
        return null;
    }

    public Translation getTranslation() {
        return null;
    }
}
