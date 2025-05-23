import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(101, new Student(101, "Alice", 88.5));
        studentMap.put(102, new Student(102, "Bob", 91.2));
        studentMap.put(103, new Student(103, "Charlie", 79.8));


        System.out.println("Student with ID 102: " + studentMap.get(102));

        System.out.println("\nAll Students:");
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " → " + entry.getValue());
        }
    }
}
