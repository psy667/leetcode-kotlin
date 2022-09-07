import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

internal class MaxSubArrayTest {
    @TestFactory
    fun maxSubArray() = listOf(
        intArrayOf(-1, -20, 100, -10, -20, 100, -20) to 170,
        intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4) to 6,
        intArrayOf(5, 4, -1, 7, 8) to 23,
        intArrayOf(-1) to -1,
        intArrayOf(1) to 1,
    ).map { (input, expected) ->
        DynamicTest.dynamicTest("maxSubArray($input) to be $expected") {
            Assertions.assertEquals(expected, maxSubArray(input))
        }
    }
}
