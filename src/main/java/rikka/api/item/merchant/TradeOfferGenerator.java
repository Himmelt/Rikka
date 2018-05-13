package rikka.api.item.merchant;

import java.util.List;
import java.util.Random;
import java.util.function.Function;

@FunctionalInterface
public interface TradeOfferGenerator extends Function<Random, TradeOffer>, TradeOfferListMutator {
    default void accept(IMerchant owner, List<TradeOffer> tradeOffers, Random random) {
        tradeOffers.add(apply(random));
    }
}
