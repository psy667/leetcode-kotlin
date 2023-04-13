import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

internal class subarraySumTest {
    @TestFactory
    fun subarraySum() = listOf(
        Pair(intArrayOf(1,1,1), 2) to 2,
        Pair(intArrayOf(1,2,3), 3) to 2,
        ).map { (input, expected) -> DynamicTest.dynamicTest("subarraySum($input) to be $expected") {
            val (nums, k) = input
            Assertions.assertEquals(expected, subarraySum(nums, k))
        } }
}
