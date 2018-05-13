package rikka.api.item.merchant;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multimap;
import org.spongepowered.api.data.type.Career;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import static com.google.common.base.Preconditions.checkNotNull;

public interface VillagerRegistry {

    Multimap<Integer, TradeOfferListMutator> getTradeOfferLevelMap(Career career);

    default Collection<TradeOfferListMutator> getMutatorsForCareer(Career career, int level) {
        final Multimap<Integer, TradeOfferListMutator> map = getTradeOfferLevelMap(checkNotNull(career, "Career cannot be null!"));
        final Collection<TradeOfferListMutator> mutators = map.get(level);
        return ImmutableList.copyOf(mutators);
    }

    VillagerRegistry addMutator(Career career, int level, TradeOfferListMutator mutator);

    VillagerRegistry addMutators(Career career, int level, TradeOfferListMutator mutator, TradeOfferListMutator... mutators);

    VillagerRegistry setMutators(Career career, int level, List<TradeOfferListMutator> mutators);

    VillagerRegistry setMutators(Career career, Multimap<Integer, TradeOfferListMutator> mutatorMap);

    default Collection<TradeOffer> generateTradeOffers(IMerchant merchant, Career career, int level, Random random) {
        checkNotNull(random, "Random cannot be null!");
        List<TradeOffer> generatedList = new ArrayList<>();
        this.getMutatorsForCareer(career, level)
                .forEach(mutator -> mutator.accept(merchant, generatedList, random));
        return generatedList;
    }

    default List<TradeOffer> populateOffers(IMerchant merchant, List<TradeOffer> currentOffers, Career career, int level, Random random) {
        this.getMutatorsForCareer(career, level)
                .forEach(mutator -> mutator.accept(merchant, currentOffers, random));
        return currentOffers;
    }

}
