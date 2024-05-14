import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scanner = new Scanner(System.in);

        // Input the number of entries in the examination database
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Create a HashMap to store student names and their total marks
        HashMap<String, Integer> database = new HashMap<>();

        // Input the student names and their total marks
        for (int i = 0; i < numberOfStudents; i++) {
            String name = scanner.nextLine().trim();
            int marks = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            database.put(name, marks);
        }

        // Input the number of queries
        int numberOfQueries = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Process the queries
        for (int i = 0; i < numberOfQueries; i++) {
            String query = scanner.nextLine().trim();
            // Check if the student name exists in the database
            if (database.containsKey(query)) {
                // Print the total marks of the student
                System.out.println(database.get(query));
            } else {
                // Print "Not Found" if the student name is not found in the database
                System.out.println("Not Found");
            }
        }
    }
}
