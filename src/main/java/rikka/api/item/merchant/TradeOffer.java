package rikka.api.item.merchant;

import rikka.api.item.inventory.ItemStackSnapshot;

import java.util.Optional;

public interface TradeOffer {

    ItemStackSnapshot getFirstBuyingItem();

    boolean hasSecondItem();

    Optional<ItemStackSnapshot> getSecondBuyingItem();

    ItemStackSnapshot getSellingItem();

    int getUses();

    int getMaxUses();

    boolean hasExpired();

    boolean doesGrantExperience();

}
