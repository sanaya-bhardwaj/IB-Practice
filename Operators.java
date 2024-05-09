import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    
    /***Don't change anything here***/
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        inp.nextLine();
        int b = inp.nextInt();
        inp.nextLine();
        inp.close();
    /*********************************/
    
    /*Perform the task here*/
        
        int add;
        int sub;
        int multi;
        int div;
        
        add= a+b;
        sub= a-b;
        multi= a*b;
        div= a/b;
        
    /***********************/
    
    /******Don't change anything here******/
        System.out.println(add);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);
    
    }
}
