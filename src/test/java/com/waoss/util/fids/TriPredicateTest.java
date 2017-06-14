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

import static org.junit.Assert.assertEquals;

public class TriPredicateTest {

    TriPredicate<Integer, Integer, Integer> triPredicate = (a, b, c) -> a == b && b == c;

    @Test
    public void test() throws Exception {
        assertEquals(true, triPredicate.test(5, 5, 5));
    }

    @Test
    public void and() throws Exception {
        assertEquals(false, triPredicate.and((a, b, c) -> a == b && b > c).test(45, 41, 2));
    }

    @Test
    public void negate() throws Exception {
        assertEquals(false, triPredicate.negate().test(5, 5, 5));
    }

    @Test
    public void or() throws Exception {
        assertEquals(true, triPredicate.or((a, b, c) -> a == b && b == c).test(6, 6, 6));
    }

}