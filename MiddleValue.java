public class MiddleValue {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void middle() {
        Node temp = head;
        int len = 0;
        int mid;

        if (temp == null) {
            return;
        }

        while (temp != null) {
            len++;
            temp = temp.next;
        }

        if (len % 2 == 0) {
            mid = len / 2;
        } else {
            mid = (len + 1) / 2;
        }

        temp = head;

        for (int i = 1; i < mid; i++) {
            temp = temp.next;
        }

        System.out.println("Middle value is: " + temp.data);
    }

    public static void main(String[] args) {
        MiddleValue list = new MiddleValue();

        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.addNode(50);
        list.addNode(60);
        list.middle();
    }
}
