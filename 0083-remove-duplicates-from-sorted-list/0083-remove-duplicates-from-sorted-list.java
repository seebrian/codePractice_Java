/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
     // Recursive
     public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;
    }
//     public ListNode deleteDuplicates(ListNode head) {
//         ListNode ptr = head;
//         while (ptr != null && ptr.next != null) {
//             if (ptr.val == ptr.next.val) {
//                 ptr.next = ptr.next.next;
//             } else {
//                 ptr = ptr.next;
//             }
//         }
//         return head;

//     }
}