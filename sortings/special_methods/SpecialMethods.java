import java.util.*;

public class SpecialMethods {

    public static int[] generateRandomArrayValues() {
        Random generateNumber = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int[] arr = new int[sc.nextInt()];
        sc.close();
        for (int i = 0; i < arr.length; i++)
            arr[i] = generateNumber.nextInt(100) + 1;
        return arr;
    }

    public static int getMaxElement(int[] arr, int st, int end) {
        int max = 0;
        for (int i = 0; i <= end; i++) {
            if (arr[max] < arr[i])
                max = i;
        }
        return max;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

}
