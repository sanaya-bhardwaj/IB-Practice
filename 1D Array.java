//Take N integers as an input and store them in an array and then print the array in reverse format.

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scanner = new Scanner (System.in);
        
        //Read the integer N
        int N = scanner.nextInt();
        
        //Create an array of size N 
        int[] array = new int [N];
        
        //Read N integers and store them in the array 
        for (int i=0; i<N; i++){
            array[i]=scanner.nextInt();
        }
        
        //Print the array in reverse order
        for (int i = N - 1; i>=0; i--){
            System.out.println(array[i]);
        }
        
        scanner.close();
    }
}
