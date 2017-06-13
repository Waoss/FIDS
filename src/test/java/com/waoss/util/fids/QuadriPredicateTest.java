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