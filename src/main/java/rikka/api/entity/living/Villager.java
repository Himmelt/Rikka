package rikka.api.entity.living;

import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.entity.CareerData;
import rikka.api.data.type.Career;
import rikka.api.data.value.mutable.Value;
import rikka.api.item.merchant.Merchant;

public interface Villager extends Ageable, Merchant {

    boolean isTrading();

    default CareerData getCareerData() {
        return get(CareerData.class).get();
    }

    default Value<Career> career() {
        return getValue(Keys.CAREER).get();
    }

}
