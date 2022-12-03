public class SortSingle {
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

        if (head == null) {
            System.out.println("Empty");
            return;
        }
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void deleteDuplicate() {
        Node current = head;

        while (current != null) {
            Node nextEle = current.next;
            while (nextEle != null && nextEle.data == current.data) {
                nextEle = nextEle.next;
            }

            current.next = nextEle;
            if (nextEle == tail) {
                tail = current;
            }
            current = nextEle;
        }
    }

    public static void main(String[] args) {
        SortSingle list = new SortSingle();

        list.addNode(10);
        list.addNode(10);
        list.addNode(20);
        list.addNode(20);
        list.addNode(30);
        list.addNode(30);
        list.addNode(30);
        list.addNode(30);
        list.addNode(40);
        list.addNode(40);
        list.deleteDuplicate();
        list.display();
    }
}
