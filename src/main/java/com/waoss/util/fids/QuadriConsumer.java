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
