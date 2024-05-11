import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
       Scanner scanner = new Scanner (System.in);
       //Read the number of test cases
       int T = scanner.nextInt();
       scanner.nextLine(); //Consume newLine character 
       
       //Interate through each test cases
       for (int i =0; i<T; i++){
           //Read the string for the current test case
           String A = scanner.nextLine();
           //call the function to check if parentheses are balanced 
           int result = isBalanced(A);
           //print the result 
           System.out.println (result);
       }
    }
    public static int isBalanced(String A){
        Stack<Character> stack = new Stack <>();
        //Iterate through each character in the String 
        for (char c : A.toCharArray ()){
            //If its an opening parenthesis, push it onto the stack is empty or the top of the stack is not opening parenthesis
            if (c == '(') {
                stack.push(c);
            }
            //If its a closing parenthesis
            else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return 0; //Unbalanced parentheses
                }
                stack.pop(); //Pop the corresponding opening parenthesis 
            }
        }
        //If the stck is empty, all the parentheses are balanced 
        return stack.isEmpty () ? 1 : 0;
    }
}
