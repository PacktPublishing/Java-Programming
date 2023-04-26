
package day1javaclass;

import java.util.Scanner;

public class Assignment1 {
/* WAP to accept 2 numbers from user and perform subtraction, multiplication and 
division and give the result to the user
- * / */
     public static void main(String[] args) {
          Scanner scan1=new Scanner(System.in);//class object
        int num1,num2,sub,mul,div;
        System.out.println("Enter First Number: ");
        num1=scan1.nextInt();
        System.out.println("Enter Second Number: ");
        num2=scan1.nextInt();
        sub=num1-num2;
        mul=num1*num2;
        div=num1/num2;
        System.out.println("The Subtraction is: "+sub);
        System.out.println("The Multiplication is: "+mul);
        System.out.println("The Division is: "+div);
     }
}

