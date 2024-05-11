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
        scanner.nextLine(); //Consume newLine
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Q, new MaxComparator());
        
        for (int i = 0; i<Q; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            scanner.nextLine(); //Consume newline 
            
            if(x == 1){
                maxHeap.add(y);
            } else if (x==2){
                if (maxHeap.isEmpty()){
                    System.out.println(-1);
                } else {
                    System.out.println(maxHeap.peek());
                }
            } else if (x == 3){
                if (!maxHeap.isEmpty()){
                    maxHeap.poll();
                }
            }
        }
        scanner.close();
    }
    
    static class MaxComparator implements Comparator<Integer> {
        public int compare(Integer a, Integer b){
            return b.compareTo(a);
        }
    }
}
