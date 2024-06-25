import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        insertionSort(SpecialMethods.generateRandomArrayValues());
    }

    public static void insertionSort(int[] arr) {
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    SpecialMethods.swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
        System.out.println("Sorted array:" + Arrays.toString(arr));
    }
}
