package day3javaclass;

import java.util.Scanner;

public class firstclass {
    public static int add(int n1,int n2){
        return n1+n2;
    }
    public static int sub(int n1,int n2){
        return n1-n2;
    }
    public static int mul(int n1,int n2){
        return n1*n2;
    }
    public static int div(int n1,int n2){
        return n1/n2;
    }
    public static void main(String[] args) {
    
        int num1,num2;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1=inp.nextInt();
        System.out.println("Enter second number: ");
        num2=inp.nextInt();
        int result=add(num1, num2);
        System.out.println("The Addition is: "+result);
        result=sub(num1, num2);
        System.out.println("The Subtraction is: "+result);
        result=mul(num1, num2);
        System.out.println("The Product is: "+result);
        result=div(num1, num2);
        System.out.println("The Division is: "+result);
    
        
    }
}
