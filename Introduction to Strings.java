import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scanner = new Scanner( System.in);
        
        //input
        String A = scanner.nextLine().trim();
        String B = scanner.nextLine().trim();
        
        //Call the function 
        compareStrings(A,B);
    }
    
    public static void compareStrings(String A, String B){
        //Calculte the sum of the lengths A and B 
        int lengthSum = A.length() + B.length();
        System.out.println(lengthSum);
        
        //Check if A is lexicographically greater then B 
        if (A.compareTo(B)>0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        //Capitalize and print strings A and B 
        System.out.println(A.toUpperCase() + " " + B.toUpperCase());
    }
}
