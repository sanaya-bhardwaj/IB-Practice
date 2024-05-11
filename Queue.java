import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scanner = new Scanner (System.in);
        int Q = scanner.nextInt();
        scanner.nextLine(); //Consume newline
        Queue<Integer> queue = new LinkedList <> ();
        for (int i = 0; i<Q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            scanner.nextLine(); //Consume newline
            
            if(x == 1) {
                queue.add(y);
            } 
            else if (x == 2){
               if (!queue.isEmpty ()) {
                   System.out.println(queue.peek());
               } 
               else{
                   System.out.println(-1);
               }
            }
            else if (x==3){
                if (!queue.isEmpty()){
                    queue.poll();
                }
            }
        }
        scanner.close();
    }
}
