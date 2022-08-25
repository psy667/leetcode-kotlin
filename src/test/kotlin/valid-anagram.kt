import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

internal class IsAnagramTest {
    @TestFactory
    fun isAnagram() = listOf(
            Pair("anagram", "nagaram") to true,
            Pair("rat", "car") to false,
            Pair("aa", "a") to false,
        ).map { (input, expected) -> DynamicTest.dynamicTest("isAnagram([${input}]) to be $expected") {
            Assertions.assertEquals(expected, isAnagram(input.first, input.second))
        } }
}
