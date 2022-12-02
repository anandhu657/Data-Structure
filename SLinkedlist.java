public class SLinkedlist {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    // Insert at the end
    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    // Insert at the intermediate location
    public void insertAfter(int nextTo, int data) {
        Node newNode = new Node(data);

        Node temp = head;

        while (temp != null && temp.data != nextTo) {
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        if (temp == tail) {
            tail.next = newNode;
            tail = newNode;
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // insert at the before
    public void insertBefore(int match, int data) {
        Node newNode = new Node(data);

        Node temp = head, prev = null;

        if (temp != null && temp.data == match) {
            newNode.next = head;
            head = newNode;
            return;
        }

        while (temp != null && temp.data != match) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }
        prev.next = newNode;
        newNode.next = temp;
    }

    // Insert from the begging
    public void insertBegin(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // set a value
    public void setValue(int match, int data) {
        Node newNode = new Node(data);

        Node temp = head, prev = null;

        if (temp != null && temp.data == match) {
            newNode.next = temp.next;
            head = newNode;
            return;
        }

        while (temp != null && temp.data != match) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == tail) {
            prev.next = newNode;
            tail = newNode;
            return;
        }
        prev.next = newNode;
        newNode.next = temp.next;
    }

    // Display
    public void display() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // Delete at any location
    public void delete(int data) {
        Node temp = head, prev = null;

        if (temp != null && temp.data == data) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        if (temp == tail) {
            tail = prev;
            tail.next = null;
            return;
        }

        prev.next = temp.next;
    }

    // main function
    public static void main(String[] args) {
        SLinkedlist list = new SLinkedlist();

        // Insert from beginnig
        list.insertBegin(100);

        // Insert at the end
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);

        // Insert at the intermediate and beginning
        list.insertAfter(30, 50);
        list.insertBegin(70);
        list.insertBefore(90, 200);

        // Delete data at any location
        list.delete(30);

        list.setValue(40, 90);

        // Display
        list.display();
    }
}