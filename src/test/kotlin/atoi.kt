import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

internal class myAtoiTest {
    @TestFactory
    fun myAtoi() = listOf(
            "42" to 42,
            "-42" to -42,
            "   4193 with words" to 4193,
            "0032" to 32,
            "2147483648" to 2147483647,
            "2147483648+" to 2147483647,
            "words and 987" to 0,
            "3.1415" to 3,
            "+1" to 1,
            "+-12" to 0,
            "9223372036854775808" to 2147483647,
            "91283472332" to 2147483647,
            "-91283472332" to -2147483648,
            "-6147483648" to -2147483648,
            "  -0012a42" to -12,
            "2147483646" to 2147483646
        ).map { (input, expected) -> DynamicTest.dynamicTest("myAtoi($input) to be $expected") {
            Assertions.assertEquals(expected, myAtoi(input))
        } }
}
