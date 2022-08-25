import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

internal class isPalindromeTest {
    @TestFactory
    fun isPalindrome() = listOf(
            "A man, a plan, a canal: Panama" to true,
            "race a car" to false,
            "0P" to false,
            "ab2a" to false
        ).map { (input, expected) -> DynamicTest.dynamicTest("isPalindrome($input) to be $expected") {
            Assertions.assertEquals(expected, isPalindrome(input))
        } }
}
