package rikka.api.entity.living;

import org.soraworld.rikka.data.type.Career;
import org.soraworld.rikka.item.merchant.Merchant;
import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.entity.CareerData;
import rikka.api.data.value.mutable.Value;

public interface Villager extends Ageable, Merchant {

    boolean isTrading();

    default CareerData getCareerData() {
        return get(CareerData.class).get();
    }

    default Value<Career> career() {
        return getValue(Keys.CAREER).get();
    }

}
