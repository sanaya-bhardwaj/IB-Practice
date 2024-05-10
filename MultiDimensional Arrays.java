//Task:
//Take 2D matrix A of size N X M as an input and print M integers denoting the column-wise sum of each of the M columns.

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scanner = new Scanner (System.in);
        //Read the integers N amd M 
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        //Create a 2D array (matrix) of size NxM
        int [][] matrix = new int [N][M]; 
        //Read NxM integers and store them in the matrix 
        for (int i=0; i<N;i++){
            for (int j=0; j<M; j++){
                matrix[i][j]= scanner.nextInt();
            }
        }
        
        //Calculate the column-wise sum of each column 
        int[] columnSums = new int [M];
        for (int j= 0; j<M; j++){
            for (int i=0; i<N; i++){
                columnSums[j] +=matrix[i][j];
            }
        }
        //Print the column-wise columnSums
        for (int sum: columnSums){
            System.out.print(sum + " ");
        }
        scanner.close( );
    }
}
