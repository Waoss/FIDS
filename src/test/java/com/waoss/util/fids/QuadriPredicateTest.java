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

public class QuadriPredicateTest {

    QuadriPredicate<String, String, String, String> equalsPredicate = (t, u, v, s) -> t.equals(u) && u.equals(v) && v.equals(s);

    @Test
    public void test() throws Exception {
        assertEquals(true, equalsPredicate.test("", "", "", ""));
    }

    @Test
    public void and() throws Exception {
        assertEquals(true, equalsPredicate.and((t, u, v, s) -> t.equalsIgnoreCase(u) && u.equalsIgnoreCase(v) && v.equalsIgnoreCase(s)).test("", "", "", ""));
    }

    @Test
    public void negate() throws Exception {
        assertEquals(false, equalsPredicate.negate().test("", "", "", ""));
    }

    @Test
    public void or() throws Exception {
        assertEquals(true, equalsPredicate.or(equalsPredicate.negate()).test("", "", "", ""));
    }

}