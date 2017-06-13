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