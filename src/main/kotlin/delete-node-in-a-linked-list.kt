/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun deleteNode(node: ListNode?) {
    val next = node!!.next!!

    node.next = next.next
    node.`val` = next.`val`

}
