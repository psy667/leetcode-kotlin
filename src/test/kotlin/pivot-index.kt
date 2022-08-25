import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

internal class PivotIndexTest {
    @TestFactory
    fun pivotIndex() = listOf(
            intArrayOf(1,7,3,6,5,6) to 3,
            intArrayOf(1,2,3) to -1,
            intArrayOf(2,1,-1) to 0,
        ).map { (input, expected) -> DynamicTest.dynamicTest("pivotIndex($input) to be $expected") {
            Assertions.assertEquals(expected, pivotIndex(input))
        } }
}
