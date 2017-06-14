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

public class TripletTest {

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