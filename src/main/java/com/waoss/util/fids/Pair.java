/*
 * Copyright (c) Waoss
 *
 * Mail me at rahul29112002@gmail.com for any queries :)
 *
 * This is free software licensed under the GNU General Public License.This license allows one to modify it on their will and also embed it or distribute it along with their own software.
 *
 * It is distributed in the hope that it shall be useful to whomsoever receives it,but does not provide ANY warranty or liability,not even the gurantee that the software will work in your certain usage.
 * You receive a copy of the GNU General Public License version 3.0 when you download this software.See LICENSE.MD for more details.
 */

package com.waoss.util.fids;

/**
 * Represents a Pair of two arguments. A data structure capable of storing
 * a second value for a first value.
 * For example,
 * {@code
 *      <br/>Pair<String, Integer> pair = new Pair<>("Hello World", 15);
 *      <br/>System.out.println(pair.getFirst());
 *      <br/>System.out.println(pair.getSecond());
 * }
 *
 * @param <F> The first value's type
 * @param <S> The second value's type
 * @author Rahul Chhabra
 */
public class Pair<F,S> {

    private F first;
    private S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public Pair() {
    }

    /**
     * Returns the first part of the Pair
     * @return The first part of the Pair
     */
    public F getFirst() {
        return first;
    }

    /**
     * Sets the first part of the pair
     * @param first The part to be set
     */
    public void setFirst(F first) {
        this.first = first;
    }

    /**
     * Returns the second part of the Pair
     * @return The second part of the Pair
     */
    public S getSecond() {
        return second;
    }

    /**
     * Sets the second part of the Pair
     * @param second The second part to be set
     */
    public void setSecond(S second) {
        this.second = second;
    }
}
