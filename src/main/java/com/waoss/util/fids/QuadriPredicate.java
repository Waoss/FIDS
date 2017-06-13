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

import java.util.Objects;

/**
 * Represents a predicate (boolean-valued function) of three arguments.  This is
 * the three-arity specialization of {@link java.util.function.Predicate}.
 * <p>This is a functional interface
 * whose functional method is {@link #test(Object, Object, Object, Object)}.</p>
 *
 * @param <T> the type of the first argument to the predicate
 * @param <U> the type of the second argument to the predicate
 * @param <V> the type of the third argument to the predicate
 * @see java.util.function.Predicate
 */
public interface QuadriPredicate<T, U, V, S> {

    /**
     * Evaluates this predicate on the given arguments.
     *
     * @param t The first input argument
     * @param u The second input argument
     * @param v The third input argument
     * @param s The fourth input argumnet
     * @return {@code true} if the arguments match the predicate, else no
     */
    boolean test(T t, U u, V v, S s);

    /**
     * <p> Returns a composed predicate that represents a short-circuiting logical
     * AND of this predicate and another.  When evaluating the composed
     * predicate, if this predicate is {@code false}, then the {@code other}
     * predicate is not evaluated.</p>
     * <p>Any exceptions thrown during evaluation of either predicate are relayed
     * to the caller; if evaluation of this predicate throws an exception, the
     * {@code other} predicate will not be evaluated.</p>
     *
     * @param other a predicate that will be logically-ANDed with this
     *              predicate
     * @return a composed predicate that represents the short-circuiting logical
     * and of this predicate and the {@code other} predicate
     * @throws NullPointerException if {@code other} is null
     */
    default QuadriPredicate<T, U, V, S> and(QuadriPredicate<? super T, ? super U, ? super V, ? super S> other) {
        Objects.requireNonNull(other);
        return (t, u, v, s) -> this.test(t, u, v, s) && other.test(t, u, v, s);
    }

    /**
     * Returns a predicate that represents the logical negation of this
     * predicate.
     *
     * @return a predicate that represents the logical negation of this
     * predicate
     */
    default QuadriPredicate<T, U, V, S> negate() {
        return (t, u, v, s) -> this.test(t, u, v, s);
    }

    /**
     * <p>Returns a composed predicate that represents a short-circuiting logical
     * OR of this predicate and another.  When evaluating the composed
     * predicate, if this predicate is {@code true}, then the {@code other}
     * predicate is not evaluated.</p>
     * <p>Any exceptions thrown during evaluation of either predicate are relayed
     * to the caller; if evaluation of this predicate throws an exception, the
     * {@code other} predicate will not be evaluated.</p>
     *
     * @param other The logically ORed predicate.
     * @return The composed predicate
     */
    default QuadriPredicate<T, U, V, S> or(QuadriPredicate<? super T, ? super U, ? super V, ? super S> other) {
        return (t, u, v, s) -> this.test(t, u, v, s) || other.test(t, u, v, s);
    }
}
