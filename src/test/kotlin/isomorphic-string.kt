import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

internal class IsIsomorphicTest {
    @TestFactory
    fun isIsomorphic() = listOf(
            Pair("paper", "title") to true,
            Pair("foo", "bar") to false,
            Pair("egg", "add") to true,
            Pair("egg", "ad") to false,
        ).map { (input, expected) -> DynamicTest.dynamicTest("isIsomorphic($input) to be $expected") {
            Assertions.assertEquals(expected, isIsomorphic(input.first, input.second))
        } }


    @TestFactory
    fun toCharNumbers() = listOf(
        "paper" to listOf(0, 1, 0, 2, 3),
        "title" to listOf(0, 1, 0, 2, 3),
        "egg" to listOf(0,1,1),
    ).map { (input, expected) -> DynamicTest.dynamicTest("toCharNumbers($input) to be $expected") {
        Assertions.assertEquals(expected, toCharNumbers(input))
    } }
}
