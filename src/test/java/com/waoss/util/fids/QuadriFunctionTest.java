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

import static java.lang.Math.max;

/**
 * Created by RAHUL on 13-06-2017.
 */
public class QuadriFunctionTest {

    @Test
    public void apply() throws Exception {
        QuadriFunction<String, String, String, String, String> stringConcatFunction = (t, u, v, s) -> t.concat(u.concat(v.concat(s)));
        QuadriFunction<Integer, Integer, Integer, Integer, Integer> intMaxFunction = (t, u, v, s) -> max(t, max(u, max(v, s)));
        System.out.println(stringConcatFunction.apply("Hello ", "World ", "Is ", "Shit!"));
        System.out.println(intMaxFunction.apply(5, 6, 7, 8));
    }

}