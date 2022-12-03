public class SelectFromEnd {
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

    public void selectDataFromEnd(int num) {
        Node temp = head;
        int len = 0;

        if (temp == null) {
            return;
        }

        while (temp != null) {
            len++;
            temp = temp.next;
        }

        if (num > len) {
            return;
        }

        temp = head;

        for (int i = 0; i < len - num; i++) {
            temp = temp.next;
        }

        System.out.println(num + "th element from end of the list " + temp.data);
    }

    public static void main(String[] args) {
        SelectFromEnd list = new SelectFromEnd();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.addNode(50);
        list.selectDataFromEnd(4);
    }
}
