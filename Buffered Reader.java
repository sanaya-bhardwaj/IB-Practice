import java.lang.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {

        // Instantiate InputStreamReader and BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
         // Read the first integer
        int num1 = Integer.parseInt(reader.readLine());
        
        // Read the second integer
        int num2 = Integer.parseInt(reader.readLine());

        // Print both integers in space-separated format
        System.out.println(num1 + " " + num2);
        
        // Read the first string
        String str1 = reader.readLine();
        
        // Read the second string
        String str2 = reader.readLine();

        // Print both strings in space-separated format
        System.out.println(str1 + " " + str2);
    }
}
