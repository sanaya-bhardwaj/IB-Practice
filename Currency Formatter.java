//Given a double-precision number, payment, denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert payment into the US and Indian currency formats. 
//Then print the formatted values as follows:
//US: formattedPayment
//India: formattedPayment
//where formattedPayment is payment formatted according to the appropriate Locale's currency.
//Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).

import java.lang.*;
import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        
        //Format for US locale
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usFormat.format(payment);
        
        //Format for Indian locale 
        Locale indiaLocale = new Locale("en","IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        String india = indiaFormat.format(payment);
         
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        
    }
}
