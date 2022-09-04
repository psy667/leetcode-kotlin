import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory
import utils.ListNode

internal class ReverseListTest {
    @TestFactory
    fun reverseList() = listOf(
        ListNode.fromList(listOf(1,2,3,4,5)) to listOf(5,4,3,2,1),
        ListNode.fromList(listOf(1,2)) to listOf(2,1),
        ListNode.fromList(listOf(1)) to listOf(1),
    ).map { (input, expected) -> DynamicTest.dynamicTest("reverseList($input) to be ${expected.joinToString()}") {
        Assertions.assertEquals(expected, reverseList(input).toList())
    } }
}
