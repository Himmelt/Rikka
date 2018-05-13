package rikka.api.item.merchant;

import java.util.List;
import java.util.Random;

public interface TradeOfferListMutator {
    void accept(IMerchant owner, List<TradeOffer> tradeOffers, Random random);
}
