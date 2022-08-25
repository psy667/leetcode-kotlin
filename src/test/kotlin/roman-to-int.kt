import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

internal class RomanToIntTest {
    @TestFactory
    fun romanToInt() = listOf(
        "III" to 3,
        "LVIII" to 58,
        "MCMXCIV" to 1994
    ).map { (input, expected) -> DynamicTest.dynamicTest("romanToInt($input) to be $expected") {
        Assertions.assertEquals(expected, romanToInt(input))
    } }
}

