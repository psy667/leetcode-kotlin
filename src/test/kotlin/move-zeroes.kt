import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

internal class MoveZeroesTest {
    @TestFactory
    fun moveZeroes() = listOf(
        intArrayOf(0,1,0,3,12) to intArrayOf(1,3,12,0,0),
        intArrayOf(0) to intArrayOf(0),
    ).map { (input, expected) -> DynamicTest.dynamicTest("moveZeroes([${input.joinToString()}]) to be [${expected.joinToString()}]") {
        Assertions.assertEquals(expected.joinToString(","), moveZeroes(input).joinToString(","))
    } }
}
