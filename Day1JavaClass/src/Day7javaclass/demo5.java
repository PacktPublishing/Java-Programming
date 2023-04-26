
package Day7javaclass;

import java.util.Scanner;

public class demo5 {
    public static void main(String[] args) {
         String varstr1,varstr2;
         Scanner inp=new Scanner(System.in);         
         System.out.println("Enter String 1: ");
         varstr1=inp.next();         
         System.out.println("Enter String 2: ");
         varstr2=inp.next();         
         String varstr3=varstr1.concat(" "+varstr2);         
         System.out.println("The string after concatenation is : "+varstr3);
         //Try the same example for giving a space between 2 words using concat function
    }
}
