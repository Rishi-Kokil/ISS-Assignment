package collectionframework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // List of Integers
        List<Integer> numbers = Arrays.asList(5, 3, 9, 1);
        Collections.sort(numbers);
        System.out.println("Sorted Integers: " + numbers);

        // List of Student objects
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(102, "Ravi"));
        studentList.add(new Student(101, "Rishi"));
        studentList.add(new Student(103, "Amit"));

        // Sort using Comparable (by ID)
        Collections.sort(studentList);
        System.out.println("\nStudents Sorted by ID (Comparable):");
        for (Student s : studentList) {
            System.out.println(s);
        }

        // Sort using Comparator (by Name)
        studentList.sort(Comparator.comparing(Student::getName));
        System.out.println("\nStudents Sorted by Name (Comparator):");
        for (Student s : studentList) {
            System.out.println(s);
        }

        // Set of Student objects
        Set<Student> studentSet = new HashSet<>(studentList);
        System.out.println("\nStudent Set:");
        for (Student s : studentSet) {
            System.out.println(s);
        }

        // Map of <Student ID, Student Object>
        Map<Integer, Student> studentMap = new HashMap<>();
        for (Student s : studentList) {
            studentMap.put(s.getId(), s);
        }

        System.out.println("\nStudent Map (ID -> Student):");
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}
