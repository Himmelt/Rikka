package rikka.api.item.merchant;

import rikka.api.entity.living.IHumanoid;
import rikka.api.item.inventory.ICarrier;
import rikka.api.world.RLocatable;

import javax.annotation.Nullable;

public interface IMerchant extends ICarrier, RLocatable {
    IHumanoid getCustomer();

    void setCustomer(@Nullable IHumanoid humanoid);
}
