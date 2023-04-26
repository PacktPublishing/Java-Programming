
package day1javaclass;

import java.util.Scanner;

public class thirdfile {
      public static void main(String[] args) {
        Scanner scan1=new Scanner(System.in);//class object
        int num1,num2,sum;
        System.out.println("Enter First Number: ");
        num1=scan1.nextInt();
        System.out.println("Enter Second Number: ");
        num2=scan1.nextInt();
        sum=num1+num2;
        System.out.println("The sum is: "+sum);
        
    }
}
