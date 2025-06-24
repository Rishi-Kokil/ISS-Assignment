package stringsarrays;
import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
    	
    	
        // Array Declaration and Initialization
        int[] numbers = new int[5]; // Declaration + Instantiation
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        
        // Declaration + Instantiation + Initialization
        int[] initializedArray = {5, 10, 15, 20}; 

        // Array Length 
        System.out.println("Length of numbers array: " + numbers.length);

        // For Loop and For-Each Loop to traverse Array
        System.out.println("\nUsing traditional for-loop:");
        for (int i = 0; i < initializedArray.length; i++) {
            System.out.println("Element at index " + i + ": " + initializedArray[i]);
        }

        System.out.println("\nUsing for-each loop:");
        for (int value : initializedArray) {
            System.out.println("Value: " + value);
        }

        // Passing Array as a parameter to a Method
        System.out.println("\nSum of array elements: " + getSum(initializedArray));

        // Returning Array from Method
        int[] doubled = doubleElements(initializedArray);
        System.out.println("Array after doubling: " + Arrays.toString(doubled));

        // Anonymous Array Passed to a Method
        System.out.println("Sum of anonymous array: " + getSum(new int[]{1, 2, 3, 4, 5}));

        // Multi-Dimensional Arrays
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("\nMulti-dimensional array (matrix):");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Jagged Array (Array of arrays with different lengths)
        int[][] jagged = {
            {1, 2},
            {3, 4, 5},
            {6}
        };

        System.out.println("\nJagged Array:");
        for (int[] row : jagged) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        // Copying Array
        int[] original = {1, 2, 3};
        int[] copy = new int[original.length];
        System.arraycopy(original, 0, copy, 0, original.length);
        System.out.println("\nCopied array using System.arraycopy(): " + Arrays.toString(copy));

        // Cloning Array
        int[] cloned = original.clone();
        System.out.println("Cloned array: " + Arrays.toString(cloned));
    }

    // Method that accepts array and returns sum
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    // Method that returns a new array with elements doubled
    public static int[] doubleElements(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] * 2;
        }
        return result;
    }
}
