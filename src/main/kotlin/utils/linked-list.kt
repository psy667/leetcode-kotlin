package utils

open class ListNode(var `val`: Int) {
    var next: ListNode? = null

    companion object {
        fun fromList(arr: List<Int>): ListNode {
            var cur = ListNode(arr[0])
            val head: ListNode = cur


            for ((idx, it) in arr.withIndex()) {
                if (idx == 0) {
                    continue
                }
                cur.next = ListNode(it)
                cur = cur.next!!
            }

            return head
        }
    }


    fun toList(): List<Int> {
        val arr = mutableListOf<Int>(this.`val`)
        var node = this.next

        while (node != null) {
            arr.add(node.`val`)
            node = node.next
        }

        return arr.toList()
    }
}
