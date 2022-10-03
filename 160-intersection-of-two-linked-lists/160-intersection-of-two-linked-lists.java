/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode aPtr = headA;
            ListNode bPtr = headB;
            int aCount = 1;
            int bCount = 1;
            while (aPtr != null) {
                aPtr = aPtr.next;
                aCount++;
            }
            aPtr = headA;
        
            while (bPtr != null) {
                bPtr = bPtr.next;
                bCount++;
            }
            bPtr = headB;
        
            if (aCount > bCount) {
                for (; aCount > bCount ; aCount--) {
                    aPtr = aPtr.next;
                }
            }
            if (bCount > aCount) {
                for (; bCount > aCount ; bCount--) {
                    bPtr = bPtr.next;
                }
            }
            while (aPtr != null && bPtr != null) {
                if (aPtr == bPtr) {
                    return aPtr;
                }
                aPtr = aPtr.next;
                bPtr = bPtr.next;
            }
            return null;
            
    }
}