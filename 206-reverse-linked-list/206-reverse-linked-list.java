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
    //1. Two Pointers
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
       
        while(curr != null) {
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev;
    }
}

// class Solution {
//     //2. Recursive
//     public ListNode reverseList(ListNode head) {
            
//         return reverse(null, head);
//     }
//     public ListNode reverse (ListNode prev, ListNode curr) {
//         if (curr == null) return prev;

//         ListNode tmp = curr.next;
//         curr.next = prev;
//         return reverse (curr, tmp);
        
//     }
// }