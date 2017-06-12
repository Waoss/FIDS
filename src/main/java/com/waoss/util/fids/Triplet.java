/*
 * Licensed under the GNU General Public License 3.0.Copyright Waoss and its affliates.This library ,thus permits :
 * 1. Commercial Use
 * 2. Modification
 * 3. Distribution
 * 4. Patent Use
 * 5. Private Use
 * Under the following conditions :
 * 1. License and copyright notice
 * 2. State changes
 * 3. Disclose source
 * 4. Same license
 * With the following limitations of no liability or warranty.
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