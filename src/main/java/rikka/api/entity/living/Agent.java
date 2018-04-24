package rikka.api.entity.living;

import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.entity.AgentData;
import rikka.api.data.value.mutable.Value;
import rikka.api.entity.IEntity;
import rikka.api.entity.ai.Goal;
import rikka.api.entity.ai.GoalType;

import javax.annotation.Nullable;
import java.util.Optional;

public interface Agent extends ILiving {

    Optional<IEntity> getTarget();

    void setTarget(@Nullable IEntity target);

    default AgentData getAgentData() {
        return get(AgentData.class).get();
    }

    default Value<Boolean> aiEnabled() {
        return getValue(Keys.AI_ENABLED).get();
    }

    <T extends Agent> Optional<Goal<T>> getGoal(GoalType type);
}
