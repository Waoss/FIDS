/*
 * Licensed under the GNU General Public License 3.0.Copyright Waoss and its affliates.This library ,thus permits :
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
 * With the following limitations of no liability or warranty.
 */

package com.waoss.util.fids;

import org.junit.Test;

/**
 * Created by RAHUL on 12-06-2017.
 */
class TripletTest {

    Triplet<String, Integer, Boolean> triplet = new Triplet<>("Hello World", 50, true);

    @Test
    public void getFirst() throws Exception {
        System.out.println(triplet.getFirst());
    }

    @Test
    public void setFirst() throws Exception {
        triplet.setFirst("asdasd");
    }

    @Test
    public void getSecond() throws Exception {
        System.out.println(triplet.getSecond());
    }

    @Test
    public void setSecond() throws Exception {
        triplet.setSecond(5);
    }

    @Test
    public void getThird() throws Exception {
        System.out.println(triplet.getThird());
    }

    @Test
    public void setThird() throws Exception {
        triplet.setThird(true);
    }
}