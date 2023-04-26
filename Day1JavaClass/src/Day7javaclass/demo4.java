
package Day7javaclass;

import java.util.Scanner;



public class demo4 {
     public static void main(String[] args) {
         String varstr1,varstr2;
         Scanner inp=new Scanner(System.in);
         System.out.println("Enter String 1: ");
         varstr1=inp.next();
         System.out.println("Enter String 2: ");
         varstr2=inp.next();
         System.out.println("String 1 = "+varstr1);
         System.out.println("String 2 = "+varstr2);
         int comp=varstr1.compareTo(varstr2);
         //varstr1= A varstr2=a A!=a ascii a a
         //<A = 65 a = 97 "varstr1"
         if(comp < 0){
             System.out.println("\"" + varstr1 +"\"" +" is less than "+"\""+varstr2+"\"");
         }
         else if(comp == 0){
             System.out.println("\"" + varstr1 +"\"" +" is equal to "+"\""+varstr2+"\"");
         }
         else{
             System.out.println("\"" + varstr1 +"\"" +" is greater than "+"\""+varstr2+"\"");
         }
                 
     }
}
