public class NthNodetoFirst {
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

    public void changeFirstNode(int match) {
        Node temp = head;
        Node prev = null;
        // Node prevTemp;

        if (temp != null && temp.data == match) {
            return;
        }

        while (temp != null && temp.data != match) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        if (temp == tail) {
            temp.next = head;
            head = tail;
            tail = prev;
            tail.next = null;
            return;
        }
        // prevTemp = prev.next;
        prev.next = temp.next;
        temp.next = head;
        head = temp;
    }

    public void display(){
        Node temp = head;

        if(temp == null){
            System.out.println("Empty");
            return;
        }

        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        NthNodetoFirst list = new NthNodetoFirst();

        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.addNode(50);
        list.changeFirstNode(20);
        list.display();
    }

}
