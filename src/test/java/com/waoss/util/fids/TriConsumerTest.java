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

public class TriConsumerTest {
    @Test
    public void accept() throws Exception {
        TriConsumer<Integer, Integer, Integer> integerIntegerIntegerTriConsumer = (integer, integer2, integer3) -> {
            //doesn't really do anything
            System.out.println(integer);
            System.out.println(integer2);
            System.out.println(integer3);
        };
        integerIntegerIntegerTriConsumer.accept(4, 5, 3);
    }
}