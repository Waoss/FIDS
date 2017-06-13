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