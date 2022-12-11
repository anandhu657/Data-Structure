import java.util.Scanner;

class StackArray {
    int top;
    int maxsize = 10;
    int arr[] = new int[maxsize];

    StackArray() {
        top = -1;
    }

    public void push(Scanner sc) {
        if (top == maxsize - 1) {
            System.out.println("Overflow");
            return;
        } else {
            System.out.println("Enter value");
            int value = sc.nextInt();
            top++;
            arr[top] = value;
            System.out.println("Item pushed");
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Underflow");
            return;
        } else {
            top--;
            System.out.println("Item Poped");
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Empty Stack");
            return;
        }
        System.out.print("Stack elements are: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        StackArray s = new StackArray();
        do {
            System.out.println("\nEnter your choice: ");
            System.out.println("1:Push\n2:Pop\n3:Display\n4:Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    s.push(sc);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        } while (choice != 4);

    }
}