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
package rikka.api.item.inventory;

import rikka.api.entity.living.player.IPlayer;
import rikka.api.item.inventory.type.Interactable;
import rikka.api.plugin.PluginContainer;

import java.util.Set;

/**
 * A Container is effectively a <em>ViewModel</em> for a particular set of
 * {@link Inventory} objects used to allow players to interact
 * with the Inventories, usually via a GUI (the View).
 */
public interface Container extends Interactable {

    /**
     * Gets the current viewers looking at this Inventory.
     *
     * @return The current viewers of this inventory
     */
    Set<IPlayer> getViewers();

    /**
     * Checks for whether this Inventory currently has viewers.
     *
     * @return True if viewers are currently looking at this inventory
     */
    boolean hasViewers();

    /**
     * Shows this Inventory to the given viewer.
     *
     * @param viewer The viewer to show this inventory to
     * @throws IllegalArgumentException if a {@link PluginContainer} is not the root of the cause
     */
    void open(IPlayer viewer) throws IllegalArgumentException;

    /**
     * Stops showing this Inventory to the given viewer.
     *
     * @param viewer The viewer to stop showing this inventory to
     * @throws IllegalArgumentException if a {@link PluginContainer} is not the root of the cause
     */
    void close(IPlayer viewer) throws IllegalArgumentException;

}