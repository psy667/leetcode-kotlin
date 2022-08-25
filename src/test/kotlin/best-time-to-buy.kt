import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

class BestTimeToByTest {
    @TestFactory
    fun test() = listOf(
        intArrayOf(7, 1, 5, 3, 6, 4) to 7,
        intArrayOf(1, 2, 3, 4, 5) to 4,
        intArrayOf(7, 6, 4, 3, 1) to 0,
        intArrayOf(1, 11, 1, 4, 9, 3, 2, 1) to 18,
    ).map { (input, expected) ->
        DynamicTest.dynamicTest("maxProfit([${input.joinToString()}]) to be $expected") {
            Assertions.assertEquals(expected, maxProfit(input))
        }
    }
}
