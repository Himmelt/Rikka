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
package rikka.api.data.manipulator.immutable.common;

import com.google.common.collect.ImmutableList;
import rikka.api.Sponge;
import rikka.api.data.key.Key;
import rikka.api.data.manipulator.immutable.ImmutableListData;
import rikka.api.data.manipulator.mutable.ListData;
import rikka.api.data.value.BaseValue;
import rikka.api.data.value.immutable.ImmutableListValue;
import rikka.api.data.value.mutable.ListValue;

import java.util.List;

public abstract class AbstractImmutableListData<E, I extends ImmutableListData<E, I, M>, M extends ListData<E, M, I>>
        extends AbstractImmutableSingleData<List<E>, I, M> implements ImmutableListData<E, I, M> {

    private final ImmutableListValue<E> listValue;

    @SuppressWarnings("unchecked")
    protected AbstractImmutableListData(List<E> value, Key<? extends BaseValue<List<E>>> usedKey) {
        super(ImmutableList.copyOf(value), usedKey);
        this.listValue = Sponge.getRegistry().getValueFactory().createListValue((Key<ListValue<E>>) this.usedKey, this.value).asImmutable();
    }

    @Override
    protected final ImmutableListValue<E> getValueGetter() {
        return this.listValue;
    }

    @Override
    public ImmutableListValue<E> getListValue() {
        return getValueGetter();
    }

    @Override
    public List<E> asList() {
        return getValue();
    }
}
