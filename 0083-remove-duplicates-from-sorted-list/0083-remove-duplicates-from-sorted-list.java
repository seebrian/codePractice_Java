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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode left = head;
        ListNode right = head;
        int tmp = 0;
        if (head != null) {
            tmp = head.val;
            right = right.next;
        }
        while (right != null) {
            if (left.val == right.val) {
                left.next = right.next;
            } else {
                left = left.next;
            }
            right = right.next;
        }
        return head;
    }
}