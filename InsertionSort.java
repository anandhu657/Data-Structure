public class InsertionSort {
    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i <= arr.length - 1; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 30, 2, 41, 56, 12, 11, 22, 41 };
        int[] result = insertionSort(arr);
        for (int i = 0; i <result.length; i++) {
            System.out.println(result[i]);
        }
    }
}