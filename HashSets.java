import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        int N = scanner.nextInt();

        // Create a HashSet to store unique elements
        HashSet<Integer> uniqueElements = new HashSet<>();

        // Input the array elements and add them to the HashSet
        for (int i = 0; i < N; i++) {
            int element = scanner.nextInt();
            uniqueElements.add(element);
        }

        // Print the total number of unique elements
        System.out.println(uniqueElements.size());
    }
}
