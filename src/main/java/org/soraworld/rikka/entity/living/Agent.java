package org.soraworld.rikka.entity.living;

import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.manipulator.mutable.entity.AgentData;
import org.soraworld.rikka.data.value.mutable.Value;
import org.soraworld.rikka.entity.Entity;
import org.soraworld.rikka.entity.ai.Goal;
import org.soraworld.rikka.entity.ai.GoalType;

import javax.annotation.Nullable;
import java.util.Optional;

public interface Agent extends Living {

    Optional<Entity> getTarget();

    void setTarget(@Nullable Entity target);

    default AgentData getAgentData() {
        return get(AgentData.class).get();
    }

    default Value<Boolean> aiEnabled() {
        return getValue(Keys.AI_ENABLED).get();
    }

    <T extends Agent> Optional<Goal<T>> getGoal(GoalType type);
}
