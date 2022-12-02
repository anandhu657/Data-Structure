public class DLinkedlist {

    public class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
        }
    }

    public Node head;
    public Node tail;

    // Insert at the end
    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
    }

    // Insert beginning
    public void insertBegin(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    // Insert at the intermediate location
    public void insertAfter(int match, int data) {
        Node newNode = new Node(data);
        Node temp = head;

        while (temp != null && temp.data != match) {
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        if (temp == tail) {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
            return;
        }
        newNode.prev = temp;
        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // Update a value
    public void setValue(int match, int data) {
        Node newNode = new Node(data);
        Node temp = head;

        if (temp != null && temp.data == match) {
            newNode.next = temp.next;
            head = newNode;
            return;
        }

        while (temp != null && temp.data != match) {
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        if (temp == tail) {
            newNode.prev = tail.prev;
            tail.prev.next = newNode;
            tail = newNode;
            return;
        }
        newNode.prev = temp.prev;
        newNode.next = temp.next;
        temp.prev.next = newNode;
        temp.next.prev = newNode;
    }

    // Delete at any location
    public void delete(int data) {
        Node temp = head;

        if (temp != null && temp.data == data) {
            temp.next.prev = null;
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != data) {
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        if (temp == tail) {
            temp.prev.next = null;
            tail = temp.prev;
            return;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    // traverse
    public void display() {
        Node temp = head;

        if (head == null) {
            System.out.println("Empty");
            return;
        }

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // reverse traverse
    public void displayReverse() {
        Node temp = tail;
        if (tail == null) {
            System.out.println("Empty");
        }

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        DLinkedlist list = new DLinkedlist();

        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.insertAfter(20, 100);

        list.insertBegin(50);
        list.setValue(30, 600);
        list.delete(600);
        list.display();
        // list.displayReverse();
    }
}
