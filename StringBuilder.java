import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Don't alter anything here.
        Scanner inp = new Scanner(System.in);
        String S = inp.nextLine();
        int L = inp.nextInt();
        inp.nextLine();
        int R = inp.nextInt();
        inp.nextLine();
        inp.close();
        
        Main main = new Main(); // Create an instance of Main
        System.out.println(main.solve(S,L,R)); // Call the solve method on the instance
        /**************************************/
    }
    
    // complete the function below
    
    public String solve(String S, int L, int R) {
        // Create a StringBuilder object from the input string
        StringBuilder sb = new StringBuilder(S);

        // Extract the substring from index L to R (inclusive)
        String substring = sb.substring(L, R + 1);

        // Reverse the substring using StringBuilder's reverse method
        StringBuilder reversedSubstring = new StringBuilder(substring).reverse();

        // Replace the original substring with the reversed substring in the StringBuilder
        sb.replace(L, R + 1, reversedSubstring.toString());

        // Convert the StringBuilder back to a string and return it
        return sb.toString();
    }
}
