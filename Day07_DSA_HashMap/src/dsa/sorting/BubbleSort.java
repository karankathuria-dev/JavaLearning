package dsa.sorting;

public class BubbleSort {

    /**
     * Sorts an array of integers in ascending order using the Bubble Sort algorithm.
     *
     * @param arr The array of integers to be sorted.
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        System.out.println("Starting Bubble Sort...");

        // The outer loop runs for each pass of the sort
        for (int i = 0; i < n - 1; i++) {
            // The inner loop performs the comparisons and swaps
            // The largest 'i' elements are already at the end, so we don't need to check them
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap them if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.print("After pass " + (i + 1) + ": ");
            printArray(arr); // Print the array to visualize the process
        }
    }

    /**
     * A helper method to print the elements of an array.
     *
     * @param arr The array to be printed.
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] unsortedArray = {64, 34, 25, 12, 22, 11, 90};

        System.out.print("Original array: ");
        printArray(unsortedArray);

        bubbleSort(unsortedArray);

        System.out.print("\nSorted array: ");
        printArray(unsortedArray);
    }
}