class MyLinkedList {
    class Node {
        int val;
        Node next;
        
        Node (int val) {
            this.val = val;
            // this.next = next; 
        }
    }
    private Node dummyHead;
    private int length;
    public MyLinkedList() {
        dummyHead = new Node(0);
        length = 0;
    }
    
    public int get(int index) {
        if (index >= length) {
            return -1;
        }
        Node cur = dummyHead;
        for (int i = 0; i <= index; i++) {
            cur = cur.next;
        }
        return cur.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(length, val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index > length) 
            return;
        Node pre = dummyHead;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
    
        Node newNode = new Node(val);
        newNode.next = pre.next;
        pre.next = newNode;
        length++;
    }
    
    public void deleteAtIndex(int index) {
        if (index >= length) {
            return ;
        }        
        length--;
        Node pre = dummyHead;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        pre.next = pre.next.next;
  
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */