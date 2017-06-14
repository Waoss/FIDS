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

/**
 * The Main class.
 * It is a library, so all it does is print the readme
 */
public class FIDS {

    public static void main(String[] args) {
        System.out.println(
                "FIDS\n" +
                        "\t\tFunctional Interfaces Don't Stop\n" +
                        "This library is intended to provide utility functional interfaces similar to the ones in <code>java.util.function</code>.\n" +
                        "It also contains a few classes that are just utility but not really *functional interfaces*\n" +
                        "At present it contains the following :\n" +
                        "* TriFunction\n" +
                        "* TriConsumer\n" +
                        "* Triplet\n" +
                        "* Pair\n" +
                        "\t\tBuilding\n" +
                        "Build it like any other gradle project, if you have gradle:\n" +
                        "$ gradle build\n" +
                        "Or, if you do not have Gradle\n" +
                        "$ ./gradlew build\n" +
                        "\t\tDocumentation\n" +
                        "The Javadoc can be found https://waoss.github.io/FIDS/javadoc/");
    }
}
