package com.waoss.util.fids;

/**
 * Represents a Pair of two arguments. A data structure capable of storing
 * a second value for a first value\
 *
 * @param <F> The first value's type
 * @param <S> The second value's type
 *
 * For example,
 * {@code
 *      Pair<
 * }
 */
public class Pair<F,S> {

    protected F first;
    protected S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
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
}
