import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

internal class TwoSumTest {
    @TestFactory
    fun twoSum() = listOf(
        Pair(intArrayOf(2,7,11,15), 9) to intArrayOf(0,1),
        Pair(intArrayOf(3,2,4), 6) to intArrayOf(1,2),
        Pair(intArrayOf(3, 3), 6) to intArrayOf(0, 1),
        ).map { (input, expected) -> DynamicTest.dynamicTest("twoSum([${input}]) to be [${expected.joinToString()}]") {
        Assertions.assertEquals(expected.joinToString(", "), twoSum(input.first, input.second).joinToString(", "))
    } }
}
