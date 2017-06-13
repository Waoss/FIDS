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

/**
 * The Main class.
 * It is a library, so all it does is print the readme
 */
public class FIDS {

    public static void main(String[] args) {
        System.out.println(
                "FIDS\n" +
                        "Functional Interfaces Don't Stop\n" +
                        "This library is intended to provide utility functional interfaces similar to the ones in <code>java.util.function</code>.\n" +
                        "It also contains a few classes that are just utility but not really *functional interfaces*\n" +
                        "At present it contains the following :\n" +
                        "* TriFunction\n" +
                        "* TriConsumer\n" +
                        "* Triplet\n" +
                        "* Pair\n" +
                        "Building\n" +
                        "Build it like any other gradle project, if you have gradle:\n" +
                        "$ gradle build\n" +
                        "Or, if you do not have Gradle\n" +
                        "$ ./gradlew build\n" +
                        "Have fun!:)");
    }
}
