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
 * Represents a function that accepts two arguments and produces a result. This is the two-arity specialization of Function.
 * This is a functional interface whose functional method is {@link #apply(Object, Object, Object, Object)}.
 *
 * @param <T> The first argument type
 * @param <U> The second argument type
 * @param <V> The third argument type
 * @param <S> The fourth argument type
 * @param <R> The result type
 * @author Rahul Chhabra
 * @see com.waoss.util.fids.TriFunction
 * @see java.util.function.BiFunction
 * @see java.util.function.Function
 */
public interface QuadriFunction<T, U, V, S, R> {

    /**
     * Applies this function to the given arguments.
     *
     * @param t the first function argument
     * @param u the second function argument
     * @param v the third function argument
     * @param s the fourth function argument
     * @return The result
     */
    R apply(T t, U u, V v, S s);
}
