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
 * a second and third value for a first value
 * For example,
 * {@code
 * Triplet<String, Integer, Boolean> tri = new Triplet<>("Hello World", 15, true);
 * System.out.println(tri.getFirst());
 * System.out.println(tri.getSecond());
 * System.out.println(tri.getThird());
 * }
 *
 * @param <F> The first value's type
 * @param <S> The second value's type
 * @param <T> The third value's type
 * @author Rahul Chhabra
 */
public class Triplet<F, S, T> {

    private F first;
    private S second;
    private T third;

    public Triplet() {
    }

    public Triplet(F first, S second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public F getFirst() {
        return first;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public T getThird() {
        return third;
    }

    public void setThird(T third) {
        this.third = third;
    }
}