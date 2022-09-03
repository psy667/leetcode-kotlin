import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

internal class countPrimesTest {
    @TestFactory
    fun countPrimes() = listOf(
            10 to 4,
            0 to 0,
            1 to 0,
            499979 to 41537,
        ).map { (input, expected) -> DynamicTest.dynamicTest("countPrimes($input) to be $expected") {
            Assertions.assertEquals(expected, countPrimes(input))
        } }
}
