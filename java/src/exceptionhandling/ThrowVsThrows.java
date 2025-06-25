package exceptionhandling;

// Custom exception class
class AgeRestrictionException extends Exception {
    public AgeRestrictionException(String message) {
        super(message);
    }
}

public class ThrowVsThrows {

    static void checkName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty or null.");
        } else {
            System.out.println("Name accepted: " + name);
        }
    }

    // Method that throws custom exception
    static void checkAge(int age) throws AgeRestrictionException {
        if (age < 18) {
            throw new AgeRestrictionException("Age must be 18 or older.");
        } else {
            System.out.println("Age accepted: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            checkName("");  // Will throw IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Caught built-in exception: " + e.getMessage());
        }
       
        try {
            checkAge(16);  
        } catch (AgeRestrictionException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}
