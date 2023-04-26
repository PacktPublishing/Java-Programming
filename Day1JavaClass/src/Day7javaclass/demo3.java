
package Day7javaclass;

import java.util.Scanner;

public class demo3 {
     public static void main(String[] args) {
         String varstr="";
         Scanner inp=new Scanner(System.in);
         System.out.println("Enter a string: ");
         varstr=inp.next();
         int num1 = varstr.charAt(0);
         int num2=varstr.charAt(10);
         System.out.println("The character at position 0 is: "+(char)num1);
         System.out.println("The character at position 10 is: "+(char)num2);         
     }
}
