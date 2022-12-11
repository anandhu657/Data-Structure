public class Stack {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public Node top;

    // Stack push operation
    public void push(int data) {
        Node newNode = new Node(data);

        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }


    // Stack pop operation
    public void pop() {
        if (top == null) {
            System.out.println("Stack underflow");
            return;
        }
        top = top.next;
    }


    // Stack display
    public void display() {
        Node current = top;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Stack stacklist = new Stack();

        stacklist.push(10);
        stacklist.push(20);
        stacklist.push(30);
        stacklist.push(40);

        stacklist.pop();

        stacklist.display();
    }
}