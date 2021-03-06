/*
 * The MIT License (MIT)
 *
 * FXGL - JavaFX Game Library
 *
 * Copyright (c) 2015-2016 AlmasB (almaslvl@gmail.com)
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
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.almasb.fxgl.entity.component;

import com.almasb.easyio.serialization.Bundle;
import com.almasb.ents.CopyableComponent;
import com.almasb.ents.component.ObjectComponent;
import com.almasb.ents.serialization.SerializableComponent;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

/**
 * Represents an entity type.
 *
 * @author Almas Baimagambetov (AlmasB) (almaslvl@gmail.com)
 */
public class TypeComponent extends ObjectComponent<Serializable>
        implements SerializableComponent, CopyableComponent<TypeComponent> {

    /**
     * Constructs a component with no type.
     */
    public TypeComponent() {
        this(new SObject());
    }

    /**
     * Constructs a component with given type.
     * Note: although the type could be any object, it is recommended
     * that an enum is used to represent types.
     *
     * @param type entity type
     */
    public TypeComponent(Serializable type) {
        super(type);
    }

    /**
     * <pre>
     *     Example:
     *     entity.getTypeComponent().isType(Type.PLAYER);
     * </pre>
     *
     * @param type entity type
     * @return true iff this type component is of given type
     */
    public boolean isType(Object type) {
        return getValue().equals(type);
    }

    @Override
    public String toString() {
        return "Type(" + getValue() + ")";
    }

    @Override
    public void write(@NotNull Bundle bundle) {
        bundle.put("value", getValue());
    }

    @Override
    public void read(@NotNull Bundle bundle) {
        setValue(bundle.get("value"));
    }

    @Override
    public TypeComponent copy() {
        return new TypeComponent(getValue());
    }

    private static class SObject implements Serializable {
        private static final long serialVersionUID = -1L;
    }
}
