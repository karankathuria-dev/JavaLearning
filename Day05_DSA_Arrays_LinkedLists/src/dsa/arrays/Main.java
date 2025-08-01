package dsa.arrays;

import java.util.Arrays; // Needed for Arrays.toString()

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, 3, 7};
        int[] emptyArr = {};
        int[] singleElementArr = {100};

        System.out.println("--- Array Operations ---");

        // Max/Min
        System.out.println("Max in numbers: " + ArrayProblems.findMax(numbers));
        System.out.println("Min in numbers: " + ArrayProblems.findMin(numbers));
        System.out.println("Max in emptyArr: " + ArrayProblems.findMax(emptyArr));

        // Sum/Average
        System.out.println("Sum of numbers: " + ArrayProblems.calculateSum(numbers));
        System.out.println("Average of numbers: " + ArrayProblems.calculateAverage(numbers));

        // Reverse
        System.out.println("Original numbers: " + Arrays.toString(numbers));
        ArrayProblems.reverseArray(numbers);
        System.out.println("Reversed numbers: " + Arrays.toString(numbers));
        ArrayProblems.reverseArray(singleElementArr); // Test single element
        System.out.println("Reversed singleElementArr: " + Arrays.toString(singleElementArr));


        // Contains Element
        System.out.println("Numbers contains 8? " + ArrayProblems.containsElement(numbers, 8));
        System.out.println("Numbers contains 10? " + ArrayProblems.containsElement(numbers, 10));

        // 2D Array
        System.out.println("\n--- 2D Array (Matrix) ---");
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        ArrayProblems.printMatrix(matrix);
    }
}