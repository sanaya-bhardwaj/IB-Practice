import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scanner = new Scanner(System.in);
        
        int Q = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        Deque<Integer> deque = new ArrayDeque<>();
        
        for (int i = 0; i < Q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            if (x == 1) {
                deque.addLast(y);
            } else if (x == 2) {
                deque.addFirst(y);
            } else if (x == 3) {
                if (!deque.isEmpty()) {
                    System.out.println(deque.peekFirst());
                } else {
                    System.out.println(-1);
                }
            } else if (x == 4) {
                if (!deque.isEmpty()) {
                    System.out.println(deque.peekLast());
                } else {
                    System.out.println(-1);
                }
            } else if (x == 5) {
                if (!deque.isEmpty()) {
                    deque.pollFirst();
                }
            } else if (x == 6) {
                if (!deque.isEmpty()) {
                    deque.pollLast();
                }
            }
        }
        
        scanner.close();
    }
}
