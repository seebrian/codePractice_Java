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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode ptr1 = list1;
        ListNode ptr2 = list2;
        ListNode newHead = new ListNode(0, null);
        ListNode cur = newHead;
        while (ptr1 != null && ptr2 != null) {
            if (ptr1.val <= ptr2.val) {
                cur.next = ptr1;
                ptr1 = ptr1.next;
            } else {
                cur.next = ptr2;
                ptr2 = ptr2.next;
            }
            cur = cur.next;
        }
        if( ptr1 == null) {
            cur.next = ptr2;
        }  
        if( ptr2 == null) {
            cur.next = ptr1;
        }
        return newHead.next;
    }
    
}