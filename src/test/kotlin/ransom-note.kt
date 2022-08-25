import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

internal class CanConstructTest {
    @TestFactory
    fun canConstruct() = listOf(
            Pair("anagram", "nagaram") to true,
            Pair("rat", "car") to false,
            Pair("aa", "aab") to true,
        ).map { (input, expected) -> DynamicTest.dynamicTest("canConstruct([${input}]) to be $expected") {
            Assertions.assertEquals(expected, canConstruct(input.first, input.second))
        } }
}
