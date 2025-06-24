package loopcontrol;

/**
 * Loops - For Loop, While Loop, Do While Loop 
 * Decision Making - If Statement, If Else Statement, If Else-If else statement, Switch Statment.
 * Ternary Operator - Alternative to If Else. 
 */

public class LoopControlAndDecisionMaking {

    // While Loop
    public boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        int i = 2;
        while (i <= Math.sqrt(num)) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    // For Loop
    public int findMax(int[] num) {
        int maxNum = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > maxNum) {
                maxNum = num[i];
            }
        }
        return maxNum;
    }

    // If Else Statement
    public boolean isPositive(int num) {
        if (num > 0) {
            return true;
        } else {
            return false;
        }
    }

    // Ternary Operator
    public boolean isEven(int num) {
        return (num % 2 == 0) ? true : false;
    }

    // Do-While Loop
    public int countUntilThreshold(int[] arr, int threshold) {
        int i = 0;
        int count = 0;
        do {
            if (arr[i] < threshold) {
                count++;
            }
            i++;
        } while (i < arr.length);
        return count;
    }

    // If-Else-If Statement
    public String gradeFromMarks(int marks) {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 75) {
            return "A";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 45) {
            return "C";
        } else {
            return "F";
        }
    }

    // Switch Statement
    public String dayOfWeek(int dayNumber) {
        String day;
        switch (dayNumber) {
            case 1: day = "Monday"; break;
            case 2: day = "Tuesday"; break;
            case 3: day = "Wednesday"; break;
            case 4: day = "Thursday"; break;
            case 5: day = "Friday"; break;
            case 6: day = "Saturday"; break;
            case 7: day = "Sunday"; break;
            default: day = "Invalid Day"; break;
        }
        return day;
    }
}
