package Assignment3;

import java.util.HashSet;
import java.util.Scanner;

public class A3Ques1 {
    public static void main(String[] args) {
        //Create a HashSet of Strings
        HashSet<String> cities = new HashSet<>();

        //Add five city names, including a duplicate
        cities.add("Hyderabad");
        cities.add("Chennai");
        cities.add("Bangalore");
        cities.add("Mumbai");
        cities.add("Chennai"); // Duplicate entry

        //Display the elements (duplicates will not be allowed)
        System.out.println("Cities in the HashSet: " + cities);

        // Step 4: Check if a city exists in the set
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a city to check: ");
        String cityToCheck = scanner.nextLine();

        if (cities.contains(cityToCheck)) {
            System.out.println(cityToCheck + " exists in the set.");
        } else {
            System.out.println(cityToCheck + " does not exist in the set.");
        }

        //Remove a city
        System.out.print("Enter a city to remove: ");
        String cityToRemove = scanner.nextLine();

        if (cities.remove(cityToRemove)) {
            System.out.println(cityToRemove + " has been removed.");
        } else {
            System.out.println(cityToRemove + " was not found in the set.");
        }

        // Display the updated set
        System.out.println("Updated Cities in the HashSet: " + cities);

        scanner.close();
    }
}
