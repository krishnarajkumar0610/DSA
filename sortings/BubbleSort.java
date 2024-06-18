package dsa.DSA.sortings;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        bubbleSort(ArrayValue.values());
    }

    private static void bubbleSort(int[] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length - i - 1; j++) {
                if (values[j] > values[j + 1]) {
                    Swaping.swap(values, j, j + 1); // calling user defined swap method
                }
                System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(values));
            }
            System.out.println();
        }
    }
}
