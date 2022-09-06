import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory
import utils.toLinkedList

internal class IsPalindromeListTest {
    @TestFactory
    fun isPalindrome() = listOf(
        listOf(1, 2, 3, 3, 2, 1).toLinkedList() to true,
        listOf(1, 2, 3, 2, 1).toLinkedList() to true,
        listOf(1, 2, 3, 4, 2, 1).toLinkedList() to false,
    ).map { (input, expected) ->
        DynamicTest.dynamicTest("isPalindrome($input) to be $expected") {
            Assertions.assertEquals(expected, isPalindrome(input))
        }
    }
}
