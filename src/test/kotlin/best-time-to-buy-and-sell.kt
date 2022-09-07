import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

internal class MaxProfit2Test {
    @TestFactory
    fun maxProfit2() = listOf(
            intArrayOf(7,1,5,3,6,4) to 5,
            intArrayOf(7,6,4,3,1) to 0,
        ).map { (input, expected) -> DynamicTest.dynamicTest("maxProfit2($input) to be $expected") {
            Assertions.assertEquals(expected, maxProfit2(input))
        } }
}
