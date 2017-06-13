/*
 * Licensed under the GNU General Public License 3.0.
 * Copyright Waoss and its affliates.
 * This library ,hereby permits :
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
 * With the limitations of no liability or warranty.
 * For more information, see LICENSE.MD
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
