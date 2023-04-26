
package Day8javaclass;

import java.util.Scanner;

public class demo1 {
public static void main(String[] args) {
    int num1,num2;
    Scanner inp=new Scanner(System.in);
    System.out.println("Enter first number: ");
    num1=inp.nextInt();
    System.out.println("Enter second number: ");
    num2=inp.nextInt();
    try{
    int res=num1/num2;
    System.out.println("The result is: "+res);
    }
    catch(ArithmeticException ex){
        System.out.println("you are trying to divide a number by zero, that's not possible");
    }
    
}    
}
