package rikka.api.block;

import rikka.api.world.Locatable;

public interface ScheduledBlockUpdate extends Locatable {
    int getTicks();

    void setTicks(int ticks);

    int getPriority();

    void setPriority(int priority);
}
