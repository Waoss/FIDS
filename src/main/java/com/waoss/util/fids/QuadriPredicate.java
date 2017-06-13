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

import java.util.Objects;

public interface QuadriPredicate<T, U, V, S> {

    boolean test(T t, U u, V v, S s);

    default QuadriPredicate<T, U, V, S> and(QuadriPredicate<? super T, ? super U, ? super V, ? super S> other) {
        Objects.requireNonNull(other);
        return (t, u, v, s) -> this.test(t, u, v, s) && other.test(t, u, v, s);
    }

    default QuadriPredicate<T, U, V, S> negate() {
        return (t, u, v, s) -> this.test(t, u, v, s);
    }

    default QuadriPredicate<T, U, V, S> or(QuadriPredicate<? super T, ? super U, ? super V, ? super S> other) {
        return (t, u, v, s) -> this.test(t, u, v, s) || other.test(t, u, v, s);
    }
}
