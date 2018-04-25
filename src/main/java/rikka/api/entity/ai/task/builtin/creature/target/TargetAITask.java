/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package rikka.api.entity.ai.task.builtin.creature.target;

import rikka.api.block.BlockType;
import rikka.api.entity.IEntity;
import rikka.api.entity.ai.task.AITask;
import rikka.api.entity.ai.task.AITaskBuilder;
import rikka.api.entity.living.IAgent;
import rikka.api.entity.living.ICreature;

public interface TargetAITask<A extends TargetAITask<A>> extends AITask<ICreature> {

    /**
     * Gets whether the owning {@link IAgent} can visibly "see" the
     * {@link IEntity} being targeted such that any {@link BlockType}s that
     * are visibly opaque will prevent the owning {@link IAgent} from
     * targeting that {@link IEntity}.
     *
     * @return Whether line of sight is required to target an entity
     */
    boolean shouldCheckSight();

    /**
     * Sets whether the owning {@link IAgent} can visibly "see" the
     * {@link IEntity} being targeted such that any {@link BlockType}s that
     * are visibly opaque will prevent the owning {@link IAgent} from
     * targeting that {@link IEntity}.
     *
     * @param checkSight Whether line of sight is required to target
     * @return This task, for chaining
     */
    A setCheckSight(boolean checkSight);

    /**
     * Gets whether an {@link IEntity} can only be targeted within a "short"
     * radius from the owning {@link IAgent}.
     *
     * @return Whether only nearby entities can be targeted
     */
    boolean onlyNearby();

    /**
     * Sets whether an {@link IEntity} can only be targeted within a "short"
     * radius from the owning {@link IAgent}.
     *
     * @param nearby Whether only nearby entities can be targeted
     * @return This task, for chaining
     */
    A setOnlyNearby(boolean nearby);

    interface Builder<A extends TargetAITask<A>, B extends Builder<A, B>> extends AITaskBuilder<ICreature, A, B> {

        B checkSight();

        B onlyNearby();

        @Override
        B reset();
    }
}
