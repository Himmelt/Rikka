package rikka.api.entity.living;

import rikka.api.entity.IArmorEquipable;
import rikka.api.entity.ITamer;
import rikka.api.entity.projectile.IProjectileLauncher;

public interface IHumanoid extends ILiving, IProjectileLauncher, IArmorEquipable, ITamer {
}
