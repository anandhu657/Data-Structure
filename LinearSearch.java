import java.util.Scanner;

public class LinearSearch {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

    public int search(int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinearSearch lSearch = new LinearSearch();
        System.out.println("Enter your search element: ");
        int key = sc.nextInt();
        int position = lSearch.search(key);
        if (position == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present in the location " + position);
        }
    }
}
