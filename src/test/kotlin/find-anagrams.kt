import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

internal class FindAnagramsTest {
    @TestFactory
    fun findAnagrams() = listOf(
            Pair("cbaebabacd", "abc") to listOf(0, 6),
            Pair("abab", "ab") to listOf(0,1,2),
            Pair("aa", "ab") to listOf(),
        ).map { (input, expected) -> DynamicTest.dynamicTest("findAnagrams($input) to be $expected") {
            Assertions.assertEquals(expected, FindAnagrams().findAnagrams(input.first, input.second))
        } }
}
