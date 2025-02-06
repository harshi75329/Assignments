import java.util.HashMap;
import java.util.Map;

public class A3Ques {
    public static void main(String[] args) {
        // Creating a HashMap to store student roll numbers and names
        HashMap<Integer, String> studentMap = new HashMap<>();

        // Inserting five student records
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(104, "David");
        studentMap.put(105, "Emma");

        // Displaying all student records
        System.out.println("Student Records:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Retrieving and displaying the name of a student using a specific roll number
        int searchRollNo = 103;
        if (studentMap.containsKey(searchRollNo)) {
            System.out.println("\nStudent with Roll No " + searchRollNo + ": " + studentMap.get(searchRollNo));
        } else {
            System.out.println("\nStudent with Roll No " + searchRollNo + " not found.");
        }

        // Removing a student entry using a roll number
        int removeRollNo = 102;
        if (studentMap.containsKey(removeRollNo)) {
            studentMap.remove(removeRollNo);
            System.out.println("\nStudent with Roll No " + removeRollNo + " removed.");
        } else {
            System.out.println("\nStudent with Roll No " + removeRollNo + " not found.");
        }

        // Displaying all student records after removal
        System.out.println("\nUpdated Student Records:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
