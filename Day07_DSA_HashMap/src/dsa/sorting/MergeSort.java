package dsa.sorting;


public class MergeSort {

    // Main method to initiate the sorting
    public void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        mergeSort(arr, 0, arr.length - 1);
    }

    // The recursive method that divides the array
    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = left + (right - left) / 2;

            // Recursively sort the first half
            mergeSort(arr, left, mid);

            // Recursively sort the second half
            mergeSort(arr, mid + 1, right);

            // Merge the two sorted halves
            merge(arr, left, mid, right);
        }
    }

    // The merge method that combines two subarrays
    private void merge(int[] arr, int left, int mid, int right) {
        // Find the sizes of the two subarrays to be merged
        int size1 = mid - left + 1;
        int size2 = right - mid;

        // Create temporary arrays
        int[] leftArr = new int[size1];
        int[] rightArr = new int[size2];

        // Copy data to the temporary arrays
        for (int i = 0; i < size1; ++i) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < size2; ++j) {
            rightArr[j] = arr[mid + 1 + j];
        }

        // Initial indices of the two subarrays
        int i = 0, j = 0;

        // Initial index of the merged array
        int k = left;

        // Merge the temporary arrays back into the original array
        while (i < size1 && j < size2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArr, if any
        while (i < size1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArr, if any
        while (j < size2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    // A helper method to print the elements of an array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] unsortedArray = {12, 11, 13, 5, 6, 7};
        MergeSort sorter = new MergeSort();

        System.out.print("Original array: ");
        printArray(unsortedArray);

        sorter.sort(unsortedArray);

        System.out.print("\nSorted array: ");
        printArray(unsortedArray);
    }
}
