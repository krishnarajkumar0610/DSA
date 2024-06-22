public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 2;
        System.out.println(findTarget(arr, target, 0, arr.length - 1));
    }

    public static int findTarget(int[] arr, int target, int st, int end) {
        if (st > end) {
            return -1; // Target not found
        }
        int mid = st + (end - st) / 2; // Calculate midpoint to avoid potential overflow

        if (arr[mid] == target) {
            return mid; // Found the target
        } else if (target > arr[mid]) {
            return findTarget(arr, target, mid + 1, end); // Search in the right half
        } else {
            return findTarget(arr, target, st, mid - 1); // Search in the left half
        }
    }
}
