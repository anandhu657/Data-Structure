import java.util.Scanner;

public class QueueArray {
    int front, rear;
    int maxsize = 5;
    int arr[] = new int[maxsize];

    QueueArray() {
        front = rear = -1;
    }

    public void enQueue(Scanner sc) {
        if (rear == maxsize - 1) {
            System.out.println("Queue is full");
            return;
        }

        int value = sc.nextInt();

        if (rear == -1) {
            front = rear = 0;
        } else {
            rear++;
        }
        arr[rear] = value;
    }

    public void deQueue() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is empty");
            return;
        }

        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
    }

    public void display() {
        if (front == -1 && rear == -1) {
            System.out.println("Empty Queue");
            return;
        } else {
            System.out.print("Queue elements are: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueArray queue = new QueueArray();
        int choice;
        do {
            System.out.println("\n1:Enqueu\n2:Dequeue\n3:Display\n4:Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    queue.enQueue(sc);
                    break;
                case 2:
                    queue.deQueue();
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Enter valid choice: ");
            }
        } while (choice != 4);
    }
}
