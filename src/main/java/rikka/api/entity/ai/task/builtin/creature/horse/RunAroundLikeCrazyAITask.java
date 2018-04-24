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
package rikka.api.entity.ai.task.builtin.creature.horse;

import rikka.api.Sponge;
import rikka.api.entity.IEntity;
import rikka.api.entity.ai.task.AITask;
import rikka.api.entity.ai.task.AITaskBuilder;
import rikka.api.entity.living.animal.IRideableHorse;

public interface RunAroundLikeCrazyAITask extends AITask<IRideableHorse> {

    /**
     * Creates a new {@link Builder} to build a new
     * {@link RunAroundLikeCrazyAITask}.
     *
     * @return A new builder
     */
    static Builder builder() {
        return Sponge.getRegistry().createBuilder(Builder.class);
    }

    /**
     * Gets the speed modifier at which when an {@link IEntity} is running
     * around, the movement speed is amplified by this modifier.
     *
     * @return The speed modifier
     */
    double getSpeed();

    /**
     * Sets the speed modifier at which when an {@link IEntity} is running
     * around, the movement speed is amplified by this modifier.
     *
     * @param speed The speed modifier at which an entity is "running around"
     * @return This task, for chaining
     */
    RunAroundLikeCrazyAITask setSpeed(double speed);

    interface Builder extends AITaskBuilder<IRideableHorse, RunAroundLikeCrazyAITask, Builder> {

        Builder speed(double speed);

    }
}
