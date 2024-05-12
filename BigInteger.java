import java.lang.*;
import java.util.*;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scanner = new Scanner (System.in);
        
        //Input two numeric strings 
        String numStr1 = scanner.nextLine();
        String numStr2 = scanner.nextLine();
        
        //Convert numeric strings to BigIntegers 
        BigInteger num1 = new BigInteger(numStr1);
        BigInteger num2 = new BigInteger(numStr2);
        
        //Calculate the sum 
        BigInteger sum = num1.add(num2);
        
        //Print the sum 
        System.out.println(sum);
        scanner.close();
    }
}
