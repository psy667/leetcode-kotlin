import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestFactory

internal class LongestCommonPrefixTest {
    @TestFactory
    fun longestCommonPrefix() = listOf(
            arrayOf("flower","flow","flight") to "fl",
            arrayOf("flower","flowd","flowdght") to "flow",
            arrayOf("flowdghtasdasdas","flowd","flowdght") to "flowd",
        ).map { (input, expected) -> DynamicTest.dynamicTest("longestCommonPrefix($input) to be $expected") {
            Assertions.assertEquals(expected, longestCommonPrefix(input))
        } }

    @Test
    fun intersect() {
        Assertions.assertEquals("flowd", "flowddasdas".intersect("flowdght"))
    }
}
