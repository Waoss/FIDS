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

import org.junit.Test;

public class TriFunctionTest {

    @Test
    public void apply() throws Exception {
        TriFunction<Integer, Integer, Integer, Integer> triFunction = (t, u, v) -> t + u + v;
        System.out.println(triFunction.apply(5, 6, 7));
        TriFunction<Double, Double, Double, Double> doubleTriFunction = (t, u, v) -> (t + u) * v;
        System.out.println(doubleTriFunction.apply(5.0D, 6.0D, 7.0D));
    }
}