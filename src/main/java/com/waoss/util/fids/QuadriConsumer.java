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
import java.util.function.Consumer;

/**
 * Represents an operation that accepts three input arguments and returns no
 * result.  This is the three-arity specialization of {@link Consumer}.
 * Unlike most other functional interfaces, {@code QuadriConsumer} is expected
 * to operate via side-effects.
 * <p>This is a functional interface
 * whose functional method is {@link #accept(Object, Object, Object, Object)}.</p>
 *
 * @param <T> the type of the first argument to the operation
 * @param <U> the type of the second argument to the operation
 * @param <V> the type of the third argument to the operation
 * @param <S> the type of the fourth argument to the operation
 * @author Rahul Chhabra
 * @see Consumer
 * @see java.util.function.BiConsumer
 * @see TriConsumer
 */
@FunctionalInterface
public interface QuadriConsumer<T, U, V, S> {
    /**
     * Performs this operation on the given arguments.
     *
     * @param t the first input argument
     * @param u the second input argument
     * @param v the third input argument
     * @param s the fourth input argument
     */
    void accept(T t, U u, V v, S s);

    /**
     * Returns a composed {@code QuadriConsumer} that performs, in sequence, this
     * operation followed by the {@code after} operation. If performing either
     * operation throws an exception, it is relayed to the caller of the
     * composed operation.  If performing this operation throws an exception,
     * the {@code after} operation will not be performed.
     *
     * @param after the operation to perform after this operation
     * @return a composed {@code QuadriConsumer} that performs in sequence this
     * operation followed by the {@code after} operation
     * @throws NullPointerException if {@code after} is null
     */
    default QuadriConsumer<T, U, V, S> andThen(QuadriConsumer<? super T, ? super U, ? super V, ? super S> after) {
        Objects.requireNonNull(after);
        return (t, u, v, s) -> {
            accept(t, u, v, s);
            after.accept(t, u, v, s);
        };
    }
}
