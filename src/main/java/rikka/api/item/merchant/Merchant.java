package rikka.api.item.merchant;

import rikka.api.entity.living.IHumanoid;
import rikka.api.item.inventory.ICarrier;
import rikka.api.world.Locatable;

import javax.annotation.Nullable;

public interface Merchant extends ICarrier, Locatable {
    IHumanoid getCustomer();

    void setCustomer(@Nullable IHumanoid humanoid);
}
