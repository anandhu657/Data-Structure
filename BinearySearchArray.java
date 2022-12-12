public class BinearySearchArray {
    static int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    public void binearySearch(int key, int first, int last) {
        int middle = (first + last) / 2;
        while (first <= last) {
            if (arr[middle] == key) {
                System.out.println("Element is found at index: " + middle);
                break;
            } else if (arr[middle] < key) {
                first = middle + 1;
            } else if (arr[middle] > key) {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }

        if (first > last) {
            System.out.println("Element is not found");
        }
    }

    public static void main(String[] args) {
        BinearySearchArray searchElement = new BinearySearchArray();
        int key = 6;
        int last = (arr.length) - 1;
        searchElement.binearySearch(key, 0, last);
    }
}
