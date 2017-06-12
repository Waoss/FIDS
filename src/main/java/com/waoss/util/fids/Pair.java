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
 *      Pair<String, Integer> pair = new Pair<>("Hello World", 15);
 *      System.out.println(pair.getFirst());
 *      System.out.println(pair.getSecond());
 * }
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
     * @return The first part of the Pair
     */
    public F getFirst() {
        return first;
    }

    /**
     * @param first The part to be set
     */
    public void setFirst(F first) {
        this.first = first;
    }

    /**
     * @return The second part of the Pair
     */
    public S getSecond() {
        return second;
    }

    /**
     * @param second The second part to be set
     */
    public void setSecond(S second) {
        this.second = second;
    }
}
