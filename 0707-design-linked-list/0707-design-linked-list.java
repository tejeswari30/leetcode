class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class MyLinkedList {
    Node head;
    public MyLinkedList() {
        head = null;
    }
    
    public int get(int index) {
        int current = 0;
        Node temp = head;
        while(temp != null && current <= index) {
            if(current == index) {
                return temp.data;
            }
            else {
                temp = temp.next;
                current++;
            }
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if(head == null) {
            head = newNode;
            return;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if(head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }
    
    public void addAtIndex(int index, int val) {
        if(index == 0) {
            addAtHead(val);
            return;
        }
        Node temp = head;
        Node newNode = new Node(val);
        while(index > 1 && temp != null) {
            temp = temp.next;
            index--;
        }
        if(temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    
    public void deleteAtIndex(int index) {
        if(head == null) {
            return;
        }
        else if(index == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        while(index > 1 && temp != null) {
            temp = temp.next;
            index--;
        }
        if(temp == null || temp.next == null) {
            return;
        }
        temp.next = temp.next.next;
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