public class Sumlinkedlisr {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public Node head;
    public Node tail;

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

    public void display() {
        Node temp = head;

        if (temp == null) {
            System.out.println("Empty Linked list");
            return;
        }

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void listSum() {
        Node temp = head;
        int sum = 0;
        int avg = 0;
        int len = 0;

        while (temp != null) {
            sum = sum + temp.data;
            len++;
            temp = temp.next;
        }

        avg = sum / len;

        System.out.println("Sum= " + sum);
        System.out.println("Average= " + avg);
    }

    public static void main(String[] args) {
        Sumlinkedlisr list = new Sumlinkedlisr();

        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.addNode(50);
        list.addNode(60);

        list.listSum();

        // list.display();
    }
}
