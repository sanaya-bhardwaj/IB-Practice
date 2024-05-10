import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scanner = new Scanner(System.in);
        
        // Create an ArrayList to store positive integers
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Read integers from the input stream until a negative integer is encountered
        int num;
        while ((num = scanner.nextInt()) >= 0) {
            numbers.add(num);
        }
        
        // Print the inputted stream in reverse format as space-separated integers in a single line
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i) + " ");
        }
        
        scanner.close();
    }
}
