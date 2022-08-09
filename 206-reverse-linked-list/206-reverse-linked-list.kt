/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
     fun reverseList(head: ListNode?): ListNode? {
         var head=head
         var output:ListNode?=null
        while (head!=null)
        {
            var temp=head.next
            head.next=output
            output=head
            head=temp
        }
        return output
    }
}