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

import org.soraworld.rikka.CatalogType;
import org.soraworld.rikka.Sponge;
import org.soraworld.rikka.data.DataContainer;
import org.soraworld.rikka.data.key.Key;
import rikka.api.data.manipulator.immutable.ImmutableVariantData;
import rikka.api.data.manipulator.mutable.VariantData;
import rikka.api.data.value.BaseValue;
import rikka.api.data.value.immutable.ImmutableValue;
import rikka.api.data.value.mutable.Value;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * An abstract implementation of an {@link ImmutableVariantData} extending
 * {@link AbstractImmutableSingleData} such that the values are immutable.
 *
 * @param <E> The type of catalog type
 * @param <I> The type of immutable manipulator
 * @param <M> The type of mutable manipulator
 */
public abstract class AbstractImmutableSingleCatalogData<E extends CatalogType, I extends ImmutableVariantData<E, I, M>,
        M extends VariantData<E, M, I>> extends AbstractImmutableSingleData<E, I, M> implements ImmutableVariantData<E, I, M> {

    private final E defaultValue;
    private final ImmutableValue<E> immutableValue;

    @SuppressWarnings({"unchecked", "rawtypes"})
    protected AbstractImmutableSingleCatalogData(E value, E defaultValue, Key<? extends BaseValue<E>> usedKey) {
        super(value, usedKey);
        this.defaultValue = checkNotNull(defaultValue, "The default value was null! This is unacceptable! Maybe the value was not registered?");
        this.immutableValue = Sponge.getRegistry().getValueFactory()
                .createValue((Key<Value<E>>) this.usedKey, this.defaultValue, this.value)
                .asImmutable();

    }

    @Override
    protected ImmutableValue<E> getValueGetter() {
        return this.immutableValue;
    }

    @Override
    public DataContainer toContainer() {
        return super.toContainer()
                .set(this.usedKey.getQuery(), this.value.getId());
    }

    @Override
    public ImmutableValue<E> type() {
        return this.immutableValue;
    }
}
