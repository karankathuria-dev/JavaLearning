package dsa.arrays;

public class ArrayProblems {
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null.");
            return Integer.MIN_VALUE; // Or throw an exception
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null.");
            return Integer.MAX_VALUE; // Or throw an exception
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int calculateSum(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        int sum = 0;
        for (int num : arr) { // Enhanced for-loop (for-each)
            sum += num;
        }
        return sum;
    }

    public static double calculateAverage(int[] arr) {
        if (arr == null || arr.length == 0) return 0.0;
        return (double) calculateSum(arr) / arr.length;
    }
    public static void reverseArray(int[] arr) {
        if (arr == null || arr.length <= 1) return; // No need to reverse 0 or 1 element
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static boolean containsElement(int[] arr, int target) {
        if (arr == null || arr.length == 0) return false;
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
    public static void printMatrix(int[][] matrix) {
        if (matrix == null) return;
        for (int i = 0; i < matrix.length; i++) { // Iterating rows
            for (int j = 0; j < matrix[i].length; j++) { // Iterating columns
                System.out.print(matrix[i][j] + "\t"); // \t for tab space
            }
            System.out.println(); // New line after each row
        }
    }
}
