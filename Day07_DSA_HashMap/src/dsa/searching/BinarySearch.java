package dsa.searching;

public class BinarySearch {

    /**
     * Implements the Binary Search algorithm to find a target in a sorted array.
     *
     * @param arr The sorted array of integers.
     * @param target The value to search for.
     * @return The index of the target if found, otherwise -1.
     */
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        // The search continues as long as the search space is not empty
        while (low <= high) {
            // Calculate the middle index
            // Using `low + (high - low) / 2` prevents integer overflow
            // compared to `(low + high) / 2` if low and high are large.
            int mid = low + (high - low) / 2;

            // Check if the target is at the middle
            if (arr[mid] == target) {
                return mid; // Target found, return its index
            }

            // If the target is greater, ignore the left half
            else if (arr[mid] < target) {
                low = mid + 1;
            }

            // If the target is smaller, ignore the right half
            else {
                high = mid - 1;
            }
        }

        // If the loop finishes, the target was not found
        return -1;
    }

    public static void main(String[] args) {
        // A sorted array for testing binary search
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};

        // Test with a target that exists
        int target1 = 23;
        int result1 = binarySearch(sortedArray, target1);
        if (result1 != -1) {
            System.out.println("Target " + target1 + " found at index: " + result1); // Expected: 5
        } else {
            System.out.println("Target " + target1 + " not found in the array.");
        }

        System.out.println("--------------------");

        // Test with a target that does not exist
        int target2 = 50;
        int result2 = binarySearch(sortedArray, target2);
        if (result2 != -1) {
            System.out.println("Target " + target2 + " found at index: " + result2);
        } else {
            System.out.println("Target " + target2 + " not found in the array."); // Expected: Not found
        }
    }
}