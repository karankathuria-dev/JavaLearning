package dsa.sorting;



public class QuickSort {

    /**
     * The main method that implements QuickSort.
     *
     * @param arr The array to be sorted.
     * @param low The starting index.
     * @param high The ending index.
     */
    public void sort(int[] arr, int low, int high) {
        if (low < high) {
            // partitionIndex is the index of the pivot element, now in its final position
            int partitionIndex = partition(arr, low, high);

            // Recursively sort the elements before the pivot
            sort(arr, low, partitionIndex - 1);

            // Recursively sort the elements after the pivot
            sort(arr, partitionIndex + 1, high);
        }
    }

    /**
     * This function takes the last element as a pivot, places the pivot element at its
     * correct position in a sorted array, and places all smaller elements to the left
     * of the pivot and all greater elements to the right.
     *
     * @param arr The array to be partitioned.
     * @param low The starting index.
     * @param high The ending index (the pivot).
     * @return The index of the pivot after partitioning.
     */
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of the smaller element

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at arr[i + 1]
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // A helper method to print the elements of an array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] data = {10, 7, 8, 9, 1, 5};
        int n = data.length;
        QuickSort sorter = new QuickSort();

        System.out.print("Original array: ");
        printArray(data);

        sorter.sort(data, 0, n - 1);

        System.out.print("\nSorted array: ");
        printArray(data);
    }
}