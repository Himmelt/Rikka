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
package rikka.api.command.dispatcher;

import rikka.api.command.CommandMapping;
import rikka.api.command.ICommandSender;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Optional;

@FunctionalInterface
public interface Disambiguator {

    /**
     * Disambiguate an alias in cases where there are multiple command mappings
     * registered for a given alias.
     *
     * @param source           The CommandSource executing the command, if any
     * @param aliasUsed        The alias input by the user
     * @param availableOptions The commands registered to this alias
     * @return The specific command to use
     */
    Optional<CommandMapping> disambiguate(@Nullable ICommandSender source, String aliasUsed, List<CommandMapping> availableOptions);

}
