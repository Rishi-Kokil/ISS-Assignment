package exceptionhandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int num = 10 / 0;  // Causes ArithmeticException
            System.out.println("output : " + num);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed");
        } finally {
            System.out.println("Finally block always executes");
        }
    }
}

