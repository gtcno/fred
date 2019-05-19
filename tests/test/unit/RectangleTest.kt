/*
 * Copyright (c) 2019 by Fred George
 * May be used freely except for training; license required for training.
 * @author Fred George  fredgeorge@acm.org
 */

package unit

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

// Ensures Rectangle works correctly
internal class RectangleTest {

    @Test internal fun area() {
        assertEquals(24.0, Rectangle(4.0, 6.0).area())
    }
}