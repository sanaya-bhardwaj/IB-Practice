import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scanner = new Scanner(System.in);
        
        //Input 
        String A = scanner.nextLine().trim();
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        
        //call the function 
        printSubstring(A, L, R);
    }
    
    public static void printSubstring(String A, int L, int R){
        //Extract the substring from index L to R (inclusive)
        String substring = A.substring(L, R+1);
        System.out.println(substring);
    }
}
