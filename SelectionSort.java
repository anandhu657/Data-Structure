public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 30, 2, 41, 56, 12, 11, 22, 41 };
        int[] result = selectionSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
