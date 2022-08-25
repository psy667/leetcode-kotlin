import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

internal class PlusOneTest {
    @TestFactory
    fun plusOne() = listOf(
            intArrayOf(1,2,3) to intArrayOf(1,2,4),
            intArrayOf(4,3,2,1) to intArrayOf(4,3,2,2),
            intArrayOf(1,9,9) to intArrayOf(2,0,0),
            intArrayOf(9,9) to intArrayOf(1,0,0),
        ).map { (input, expected) -> DynamicTest.dynamicTest("plusOne([${input.joinToString()}]) to be [${expected.joinToString()}]") {
            Assertions.assertEquals(expected.joinToString(""), plusOne(input).joinToString(""))
        } }
}
