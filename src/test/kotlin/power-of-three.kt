import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

internal class isPowerOfThreeTest {
    @TestFactory
    fun isPowerOfThree() = listOf(
            27 to true,
            243 to true,
            244 to false,
        ).map { (input, expected) -> DynamicTest.dynamicTest("isPowerOfThree($input) to be $expected") {
            Assertions.assertEquals(expected, isPowerOfThree(input))
        } }
}
