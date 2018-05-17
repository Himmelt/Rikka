package rikka.api.entity.living;

import rikka.api.entity.api.Ageable;
import rikka.api.item.merchant.Merchant;

public interface IVillager extends ICreature, Ageable, Merchant {
    boolean isTrading();
}
