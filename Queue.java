public class Queue {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public Node front;
    public Node rear;

    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public void dequeue() {
        if (front == null) {
            System.out.println("Empty");
            return;
        }
        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    public void display() {
        Node current = front;

        if (front == null) {
            System.out.println("List is empty");
            return;
        }

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Queue list = new Queue();

        list.enqueue(10);
        list.enqueue(20);
        list.enqueue(30);
        list.enqueue(40);

        list.dequeue();
        list.dequeue();
        // list.dequeue();
        // list.dequeue();
        // list.dequeue();

        list.enqueue(30);

        list.display();
    }
}
