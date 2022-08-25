import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

internal class FirstUniqueCharacterTest {
    @TestFactory
    fun firstUniqChar() = listOf(
        "leetcode" to 0,
        "loveleetcode" to 2,
        "aabb" to -1
    ).map{ (input, expected) ->
        DynamicTest.dynamicTest("firstUniqChar(${input}) to be $expected") {
            Assertions.assertEquals(expected, firstUniqChar(input))
        }
    }
}
