package org.soraworld.rikka.entity.living;

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.manipulator.mutable.entity.CareerData;
import org.soraworld.rikka.data.type.Career;
import org.soraworld.rikka.data.value.mutable.Value;
import org.soraworld.rikka.item.merchant.Merchant;

public interface Villager extends Ageable, Merchant {

    boolean isTrading();

    default CareerData getCareerData() {
        return get(CareerData.class).get();
    }

    default Value<Career> career() {
        return getValue(Keys.CAREER).get();
    }

}
