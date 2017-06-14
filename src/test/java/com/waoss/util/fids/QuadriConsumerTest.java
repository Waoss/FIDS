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

public class QuadriConsumerTest {

    QuadriConsumer<Integer, Integer, Integer, Integer> integerIntegerIntegerIntegerQuadriConsumer = (t, u, v, s) -> {
        System.out.println(t);
        System.out.println(u);
        System.out.println(v);
        System.out.println(s);
    };

    @Test
    public void andThen() throws Exception {
        integerIntegerIntegerIntegerQuadriConsumer.andThen((t, u, v, s) -> {
            System.out.println(t);
            System.out.println(u);
            System.out.println(v);
            System.out.println(s);
        }).accept(10, 9, 8, 7);
    }

    @Test
    public void accept() throws Exception {
        integerIntegerIntegerIntegerQuadriConsumer.accept(5, 5, 5, 5);
    }

}