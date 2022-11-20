# Linked List
## 203. Remove Linked List Elements
[Leetcode](https://leetcode.com/problems/remove-linked-list-elements/)
```
// create a dummy node
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;

        while (cur.next != null) {
            if (cur.next.val == val)
                cur.next = cur.next.next;
            else
                cur = cur.next;
        }
        return dummy.next;
    }
}

```

## 707. Design Linked List
[Leetcode](https://leetcode.com/problems/design-linked-list/)
- create dummy node more easy

## 206. Reverse Linked List (Easy)
[Leetcode](https://leetcode.com/problems/reverse-linked-list/)
1. Two Pointers 2. Recursive
```
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) 
            return head;
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null ) {
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev;
            
    }
}
```

## 24. Swap Nodes in Pairs (Medium, Both)
[Leetcode](https://leetcode.com/problems/swap-nodes-in-pairs/description/)
```
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode nextPtr = head.next;
        
        while (curr != null && nextPtr != null) {
            ListNode tmp = nextPtr.next;
            if (prev != null)
                prev.next = nextPtr;   
            else
                head =nextPtr;
            nextPtr.next = curr;
            curr.next = tmp;
            
            prev =curr;
            curr = tmp;
            if(tmp!=null)
            nextPtr = tmp.next;
        }
        return head;
    }
}
```

## 19. Remove Nth Node From End of List (Medium, both)
[Leetcode](https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/)
```
// Create dummyNode
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(-1,head);
        ListNode right = dummyNode;
        ListNode left = dummyNode;
        for (int i=0; i<n; i++) {
            right = right.next;
        }
        while (right.next != null) {
            right = right.next;
            left = left.next;
        }
        left.next = left.next.next;
        return dummyNode.next;
    }
}
```

## 160. Intersection of Two Linked Lists (Easy)
[Leetcode](https://leetcode.com/problems/intersection-of-two-linked-lists/)


## 142. Linked List Cycle II
[Leetcode](https://leetcode.com/problems/linked-list-cycle-ii/description/)
Floyd's Cycle Detection


## 83. Remove Duplicates from Sorted List (Easy CS) 
[Leetcode](https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/)
