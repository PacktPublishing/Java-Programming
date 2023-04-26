
package day2javaclass;

import java.util.Scanner;

public class ifcondition3 {
     public static void main(String[] args) {
         Scanner inp=new Scanner(System.in);
         int num1,num2,num3;
         System.out.println("Enter First Number: ");
         num1=inp.nextInt();
         System.out.println("Enter Second Number: ");
         num2=inp.nextInt();
         System.out.println("Enter Third Number: ");
         num3=inp.nextInt();
         if(num1>num2 && num1>num3){
             System.out.println(num1+ " is the largest number");
         }
         else if(num2>num1 && num2>num3){
             System.out.println(num2+ " is the largest number");
         }
         else{
             System.out.println(num3+ " is the largest number");
         }
                 
     }
}
