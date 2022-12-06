public class SlinkedlistGt {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public Node head;
    public Node tail;

    public void addnode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // public void display() {
    // Node temp = head;

    // if (temp == null) {
    // System.out.println("Empty Linked list");
    // return;
    // }

    // while (temp != null) {
    // System.out.println(temp.data);
    // temp = temp.next;
    // }
    // }

    public void largerCheck() {
        Node max = head;
        Node temp = head.next;

        while (temp != null) {
            if (max.data < temp.data) {
                max = temp;
            }
            temp = temp.next;
        }
        System.out.println("Largest value is " + max.data);
    }

    public static void main(String[] args) {
        SlinkedlistGt list = new SlinkedlistGt();

        list.addnode(10);
        list.addnode(50);
        list.addnode(30);
        list.addnode(60);
        list.addnode(20);
        list.addnode(40);

        list.largerCheck();
    }

}
