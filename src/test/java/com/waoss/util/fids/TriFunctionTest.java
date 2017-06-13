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

public class TriFunctionTest {
    @Test
    public void apply() throws Exception {
        TriFunction<Integer, Integer, Integer, Integer> triFunction = (t, u, v) -> t + u + v;
        System.out.println(triFunction.apply(5, 6, 7));
    }

}