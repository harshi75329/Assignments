package Assignment2;

import java.util.ArrayList;

public class A3Ques3 {
    public static void main(String[] args) {
        // Creating an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding five integer elements to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Displaying the initial list
        System.out.println("Original List: " + numbers);

        // Removing the third element (index 2)
        if (numbers.size() > 2) {
            numbers.remove(2);
            System.out.println("After removing third element: " + numbers);
        }

        // Updating the second element (index 1) with a new value
        if (numbers.size() > 1) {
            numbers.set(1, 99);
            System.out.println("After updating second element: " + numbers);
        }

        // Displaying all elements using a loop
        System.out.println("Final List Elements:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
