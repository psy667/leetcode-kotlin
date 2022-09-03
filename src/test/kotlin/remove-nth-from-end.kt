import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory
import utils.ListNode

internal class RemoveNthFromEndTest {
    @TestFactory
    fun removeNthFromEnd() = listOf(
        Pair(ListNode.fromList(listOf(1,2,3,4,5)), 2) to listOf(1,2,3,5),
        Pair(ListNode.fromList(listOf(1)), 1) to listOf(),
        Pair(ListNode.fromList(listOf(1,2)), 1) to listOf(1),
        Pair(ListNode.fromList(listOf(1,2)), 2) to listOf(2),
        Pair(ListNode.fromList(listOf(1,2,3)), 3) to listOf(2, 3),
        Pair(ListNode.fromList(listOf(1,2,3)), 2) to listOf(1, 3),
    ).map { (input, expected) -> DynamicTest.dynamicTest("removeNthFromEnd($input) to be ${expected.joinToString()}") {
        Assertions.assertEquals(expected, removeNthFromEnd(input.first, input.second)?.toList() ?: listOf<Int>())
    } }


}
