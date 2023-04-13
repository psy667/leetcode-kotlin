import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

internal class simplifyPathTest {
    @TestFactory
    fun simplifyPath() = listOf(
        "/home/" to "/home",
        "/../" to "/",
        "/home//foo/" to "/home/foo",
        "home/./dir/.././abc" to "/home/abc"
        ).map { (input, expected) -> DynamicTest.dynamicTest("simplifyPath($input) to be $expected") {
            Assertions.assertEquals(expected, simplifyPath(input))
        } }
}
