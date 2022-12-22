public class InsertionSortDesc {
    public static int[] insertionSortDescending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < current) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 30, 2, 41, 56, 12, 11, 22, 41 };
        arr = insertionSortDescending(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
