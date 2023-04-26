
package Day7javaclass;

import java.util.Scanner;

public class demo6 {
     public static void main(String[] args) {
         String varstr1,varstr2;
         Scanner inp=new Scanner(System.in);
         System.out.println("Enter String 1: ");
         varstr1=inp.next();
         System.out.println("Enter String 2: ");
         varstr2=inp.next();
         CharSequence cs1="javaprogramming.com";
         System.out.println("Original String 1 = "+varstr1);
         System.out.println("Original String 2 = "+varstr2);
         
         System.out.println("Comparing "+varstr1+" and "+cs1+" : "+varstr1.contentEquals(cs1));
         System.out.println("Comparing "+varstr2+" and "+cs1+" : "+varstr2.contentEquals(cs1));
     }
}
