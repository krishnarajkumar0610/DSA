package dsa.DSA.sortings;

import java.util.*;

public class ArrayValue {
    public static int[] generateRandomArrayValues() {
        Random generateNumber = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int[] arr = new int[sc.nextInt()];
        sc.close();
        for (int i = 0; i < arr.length; i++)
            arr[i] = generateNumber.nextInt(100)+1;
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
