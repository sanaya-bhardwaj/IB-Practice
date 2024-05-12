import java.lang.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
       Scanner scanner = new Scanner(System.in);
       String n = scanner.next();
       scanner.close();
       
       //Create a BigInteger object from the input String 
       BigInteger num = new BigInteger(n);
       
       //Check if the number is prime 
       if (num.isProbablePrime(1)){
           System.out.println("prime");
       } 
       else{
           System.out.println("not prime");
       }
    }
}
