public class SumNonrepeatValue {
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

    public void sumNonRepeat() {
        Node temp = head;
        Node innerTemp;
        int sum = 0;
        boolean flag;

        while (temp != null) {
            flag = true;
            innerTemp = temp.next;
            while (innerTemp != null) {
                if (temp.data == innerTemp.data) {
                    flag = false;
                    innerTemp.data = 0;
                }
                innerTemp = innerTemp.next;
            }
            if (flag == true) {
                sum = sum + temp.data;
            }
            temp = temp.next;
        }

        System.out.println("Non repeat value Sum= " + sum);
    }

    public static void main(String[] args) {
        SumNonrepeatValue list = new SumNonrepeatValue();
        list.addNode(10);
        list.addNode(20);
        list.addNode(10);
        list.addNode(30);
        list.addNode(40);
        list.addNode(50);
        list.addNode(30);
        list.addNode(20);
        list.addNode(60);
        list.addNode(20);

        list.sumNonRepeat();
    }
}
