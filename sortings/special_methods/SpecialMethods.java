package dsa.DSA.sortings.special_methods;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SpecialMethods {

    public static int[] generateRandomArrayValues() {
        Random generateNumber = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int[] arr = new int[sc.nextInt()];
        sc.close();
        for (int i = 0; i < arr.length; i++)
            arr[i] = generateNumber.nextInt(100) + 1;
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
