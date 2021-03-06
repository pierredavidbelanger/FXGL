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

/**
 * Copyright (c) 2013, Daniel Murphy
 * All rights reserved.
 * <p>
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 * * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 * <p>
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package org.jbox2d.dynamics;

import org.jbox2d.collision.shapes.Shape;

/**
 * A fixture definition is used to create a fixture. This class defines an abstract fixture
 * definition. You can reuse fixture definitions safely.
 *
 * @author daniel
 */
public class FixtureDef {
    /**
     * The shape, this must be set. The shape will be cloned, so you can create the shape on the
     * stack.
     */
    private Shape shape = null;

    /**
     * Use this to store application specific fixture data.
     */
    private Object userData = null;

    /**
     * The friction coefficient, usually in the range [0,1].
     */
    private float friction = 0.2f;

    /**
     * The restitution (elasticity) usually in the range [0,1].
     */
    private float restitution = 0;

    /**
     * The density, usually in kg/m^2
     */
    private float density = 0;

    /**
     * A sensor shape collects contact information but never generates a collision response.
     */
    private boolean isSensor = false;

    /**
     * Contact filtering data;
     */
    private Filter filter = new Filter();

    /**
     * The shape, this must be set. The shape will be cloned, so you can create the shape on the
     * stack.
     */
    public Shape getShape() {
        return shape;
    }

    /**
     * The shape, this must be set. The shape will be cloned, so you can create the shape on the
     * stack.
     */
    public void setShape(Shape shape) {
        this.shape = shape;
    }

    /**
     * Use this to store application specific fixture data.
     */
    public Object getUserData() {
        return userData;
    }

    /**
     * Use this to store application specific fixture data.
     */
    public void setUserData(Object userData) {
        this.userData = userData;
    }

    /**
     * The friction coefficient, usually in the range [0,1].
     */
    public float getFriction() {
        return friction;
    }

    /**
     * The friction coefficient, usually in the range [0,1].
     */
    public void setFriction(float friction) {
        this.friction = friction;
    }

    /**
     * The restitution (elasticity) usually in the range [0,1].
     */
    public float getRestitution() {
        return restitution;
    }

    /**
     * The restitution (elasticity) usually in the range [0,1].
     */
    public void setRestitution(float restitution) {
        this.restitution = restitution;
    }

    /**
     * The density, usually in kg/m^2
     */
    public float getDensity() {
        return density;
    }

    /**
     * The density, usually in kg/m^2
     */
    public void setDensity(float density) {
        this.density = density;
    }

    /**
     * A sensor shape collects contact information but never generates a collision response.
     */
    public boolean isSensor() {
        return isSensor;
    }

    /**
     * A sensor shape collects contact information but never generates a collision response.
     */
    public void setSensor(boolean isSensor) {
        this.isSensor = isSensor;
    }

    /**
     * @return contact filtering data
     */
    public Filter getFilter() {
        return filter;
    }

    /**
     * Set contact filtering data.
     *
     * @param filter filter
     */
    public void setFilter(Filter filter) {
        this.filter = filter;
    }
}
