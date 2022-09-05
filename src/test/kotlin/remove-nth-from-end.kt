import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory
import utils.toLinkedList

internal class RemoveNthFromEndTest {
    @TestFactory
    fun removeNthFromEnd() = listOf(
        Pair(listOf(1, 2, 3, 4, 5).toLinkedList(), 2) to listOf(1, 2, 3, 5).toLinkedList(),
        Pair(listOf(1).toLinkedList(), 1) to listOf<Int>().toLinkedList(),
        Pair(listOf(1, 2).toLinkedList(), 1) to listOf(1).toLinkedList(),
        Pair(listOf(1, 2).toLinkedList(), 2) to listOf(2).toLinkedList(),
        Pair(listOf(1, 2, 3).toLinkedList(), 3) to listOf(2, 3).toLinkedList(),
        Pair(listOf(1, 2, 3).toLinkedList(), 2) to listOf(1, 3).toLinkedList(),
    ).map { (input, expected) ->
        DynamicTest.dynamicTest("removeNthFromEnd($input) to be $expected") {
            Assertions.assertEquals(expected?.toList(), removeNthFromEnd(input.first, input.second)?.toList())
        }
    }
}
