import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

internal class ContainsDuplicateTest {
    @TestFactory
    fun test() = listOf(
        intArrayOf(1,2,3,1) to true,
        intArrayOf(1,2,3,4) to false,
        intArrayOf(1,1,1,3,3,4,3,2,4,2) to true,
    ).map { (input, expected) ->
        DynamicTest.dynamicTest("containsDuplicate([${input.joinToString()}]) to be $expected") {
            Assertions.assertEquals(expected, containsDuplicate(input))
        }
    }
}
