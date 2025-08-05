package dsa.sorting;


public class SelectionSort {

    /**
     * Sorts an array of integers in ascending order using the Selection Sort algorithm.
     *
     * @param arr The array of integers to be sorted.
     */
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        System.out.println("Starting Selection Sort...");

        // The outer loop iterates through the array
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part of the array
            int minIndex = i;

            // The inner loop finds the index of the smallest element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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
        int[] unsortedArray = {64, 25, 12, 22, 11};

        System.out.print("Original array: ");
        printArray(unsortedArray);

        selectionSort(unsortedArray);

        System.out.print("\nSorted array: ");
        printArray(unsortedArray);
    }
}
