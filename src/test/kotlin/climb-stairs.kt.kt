import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ClimbStairsTest {
    @Test
    fun basic() {
        assertEquals(21, ClimbStairs().climbStairs(7))
    }

    @Test
    fun memoizationTest() {
        assertEquals(165580141, ClimbStairs().climbStairs(40))
    }
}
