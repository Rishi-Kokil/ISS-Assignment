package collectionframework;

public class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }

    @Override
    public int compareTo(Student other) {
        return this.id - other.id; // Sorting by ID
    }

    @Override
    public String toString() {
        return "Student[ID=" + id + ", Name=" + name + "]";
    }
}
