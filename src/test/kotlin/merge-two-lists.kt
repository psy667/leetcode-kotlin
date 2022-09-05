import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory
import utils.ListNode
import utils.toLinkedList

internal class MergeTwoListsTest {
    @TestFactory
    fun mergeTwoLists() = listOf(
        Pair(listOf(1,2,4).toLinkedList(), listOf(1,3,4).toLinkedList()) to listOf(1,1,2,3,4,4).toLinkedList(),
        Pair(listOf<Int>().toLinkedList(), listOf<Int>().toLinkedList()) to null,
        Pair(listOf<Int>().toLinkedList(), listOf(0).toLinkedList()) to listOf(0).toLinkedList(),
        Pair(listOf(0).toLinkedList(), ListNode.fromList(listOf())) to listOf(0).toLinkedList(),
    ).map { (input, expected) -> DynamicTest.dynamicTest("mergeTwoLists($input) to be $expected") {
        Assertions.assertEquals(expected?.toList(), mergeTwoLists(input.first, input.second)?.toList())
    } }
}
