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
 * Represents a function that accepts two arguments and produces a result. This is the two-arity specialization of Function.
 * This is a functional interface whose functional method is {@link #apply(Object, Object, Object)}.
 * @param <T> The first argument type
 * @param <U> The second argument type
 * @param <V> The third argument type
 * @param <R> The result type
 * @see java.util.function.BiFunction
 * @see java.util.function.Function
 * @author Rahul Chhabra
 */
@FunctionalInterface
public interface TriFunction<T, U, V, R> {
    /**
     * Applies this function to the given arguments.
     *
     * @param t the first function argument
     * @param u the second function argument
     * @param v the third function argument
     * @return The result
     */
    R apply(T t, U u, V v);
}