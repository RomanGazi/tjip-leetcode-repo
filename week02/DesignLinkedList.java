class MyLinkedList {
    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    int size;
    Node dummyNode;

    public MyLinkedList() {
        dummyNode = new Node(-1);
        size = 0;
    }
    
    public int get(int index) {
        if(size <= index) {
            return -1;
        }
        Node current = dummyNode;
        for(int i = 0; i <= index; i++) {
            current = current.next;
        }
        return current.val;
    }
    
    public void addAtHead(int val) {
        Node headNode = new Node(val);
        headNode.next = dummyNode.next;
        dummyNode.next = headNode;
        size++;
    }
    
    public void addAtTail(int val) {
        Node current = dummyNode;
        for(int i = 0; i < size; i++) {
            current = current.next;
        }
        Node tailNode = new Node(val);
        current.next = tailNode;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        Node current = dummyNode;
        if(size < index) {
            return;
        }
        for(int i = 0; i < index; i++) {
            current = current.next;
        }
        Node indexNode = new Node(val);
        indexNode.next = current.next;
        current.next = indexNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(size <= index) {
            return;
        }
        Node current = dummyNode;
        for(int i = 0; i < index; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        size--;
    }
}
