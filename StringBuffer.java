import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Don't alter anything here.
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        int L = inp.nextInt();
        inp.nextLine();
        int R = inp.nextInt();
        inp.nextLine();
        inp.close();
        
        System.out.println(solve(s,L,R));
        /**************************************/
    }
    
    //complete the function below
    
    public static String solve(String s, int L, int R)
    {
        //Convert the string to a character array to manipulate it 
        char[] chars = s.toCharArray();
        
        //Reverse the substring from index L to R 
        while (L<R){
            //swap characters at indices L and R 
            char temp = chars[L];
            chars [L] =  chars [R];
            chars [R] = temp;
            
            //Move indices inward
            L++;
            R--;
        }
        
        //Convert the character array back to a string 
        return new String(chars);
    }
}
