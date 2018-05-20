package rikka.bukkit.entity.projectile;

import org.bukkit.entity.FishHook;
import rikka.api.entity.IEntity;
import rikka.api.entity.projectile.IFishHook;

import static rikka.bukkit.server.NMSVersion.*;

public final class BukkitFishHook extends BukkitProjectile<FishHook> implements IFishHook {
    public BukkitFishHook(FishHook source) {
        super(source);
    }

    public IEntity getHookedEntity() {
        if (v1_12_R1) {
            return getEntity(((org.bukkit.craftbukkit.v1_12_R1.entity.CraftFish) source).getHandle().hooked.getBukkitEntity());
        } else if (v1_11_R1) {
            return getEntity(((org.bukkit.craftbukkit.v1_11_R1.entity.CraftFish) source).getHandle().hooked.getBukkitEntity());
        } else if (v1_10_R1) {
            return getEntity(((org.bukkit.craftbukkit.v1_10_R1.entity.CraftFish) source).getHandle().hooked.getBukkitEntity());
        } else if (v1_7_R4) {
            return getEntity(((org.bukkit.craftbukkit.v1_7_R4.entity.CraftFish) source).getHandle().hooked.getBukkitEntity());
        }
        return null;
    }

    /* not impl */
    public void setHookedEntity(IEntity entity) {
    }
}
