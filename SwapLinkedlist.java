public class SwapLinkedlist {
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

    public void swapList(int dataOne, int dataTwo) {
        Node temp = head, prev = head;
        Node swapPrev1 = null, swapTemp1 = null, swapPrev2 = null, swapTemp2 = null;

        while (temp != null) {
            if (temp.data == dataOne) {
                swapPrev1 = prev;
                swapTemp1 = temp;
            }
            if (temp.data == dataTwo) {
                swapPrev2 = prev;
                swapTemp2 = temp;
            }
            prev = temp;
            temp = temp.next;
        }

        swapPrev1.next = swapTemp2;
        swapTemp2.next = swapTemp1.next;
        // swapTemp1
    }

    public void display() {
        Node temp = head;

        if (temp == null) {
            System.out.println("Empty linked list");
        }

        while (temp != null) {
            System.out.println(temp.data);
        }
    }
}
