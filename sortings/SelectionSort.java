import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        selectionSort(SpecialMethods.generateRandomArrayValues());
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int maxIndex = SpecialMethods.getMaxElement(arr, 0, lastIndex);
            SpecialMethods.swap(arr, maxIndex, lastIndex);
        }
        System.out.println(Arrays.toString(arr));
    }
}