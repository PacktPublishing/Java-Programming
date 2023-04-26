
package day2javaclass;

import java.util.Scanner;

public class IfCondition {
public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
    System.out.println("Enter a number to check if it is odd or even: ");
    int num1=inp.nextInt();
    if(num1 % 2 ==0)
    {
        System.out.println(num1 + " is a even number");
    }
    else{
        System.out.println(num1 + " is a odd number");
    }            
}    
}
