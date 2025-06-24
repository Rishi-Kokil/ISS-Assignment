package loopcontrol;

public class Main {
    public static void main(String[] args) {
        LoopControlAndDecisionMaking lc = new LoopControlAndDecisionMaking();

        // Checking if No is Prime
        int num = 29;
        System.out.println(num + " is prime: " + lc.isPrime(num));

        // Finnding Maximum Number 
        int[] arr = {12, 45, 23, 67, 34};
        System.out.println("Maximum number in array: " + lc.findMax(arr));

        // Checking if number is positive
        int testNum = -10;
        System.out.println(testNum + " is positive: " + lc.isPositive(testNum));

        // Checking if Number is Even or Odd
        int evenTest = 8;
        System.out.println(evenTest + " is even: " + lc.isEven(evenTest));

        // Checking all Values Less that Threshold from the Start
        int[] values = {5, 10, 15, 3, 9};
        int threshold = 10;
        System.out.println("Count of numbers less than " + threshold + ": " + lc.countUntilThreshold(values, threshold));

        // Calculating Grade from Marks
        int marks = 78;
        System.out.println("Grade for marks " + marks + ": " + lc.gradeFromMarks(marks));

        // Find the Day of the Week
        int day = 3;
        System.out.println("Day " + day + " of the week: " + lc.dayOfWeek(day));
    }
}
