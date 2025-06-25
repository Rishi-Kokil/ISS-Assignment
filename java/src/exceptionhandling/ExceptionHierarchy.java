package exceptionhandling;

/**
 * Concept : Exception Hierarchy. We can Stack Exception Based on the Order In which We need 
 * to catch them
 */


public class ExceptionHierarchy {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught General Exception: " + e.getMessage());
        }
    }
}
