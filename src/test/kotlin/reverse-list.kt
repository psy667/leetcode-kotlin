import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory
import utils.toLinkedList

internal class ReverseListTest {
    @TestFactory
    fun reverseList() = listOf(
        listOf(1, 2, 3, 4, 5).toLinkedList() to listOf(5, 4, 3, 2, 1).toLinkedList(),
        listOf(1, 2).toLinkedList() to listOf(2, 1).toLinkedList(),
        listOf(1).toLinkedList() to listOf(1).toLinkedList(),
    ).map { (input, expected) ->
        DynamicTest.dynamicTest("reverseList($input) to be $expected") {
            Assertions.assertEquals(expected?.toList(), reverseList(input!!).toList())
        }
    }
}
