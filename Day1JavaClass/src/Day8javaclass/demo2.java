package Day8javaclass;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        int num1,num2;
        int[] arr=new int[4];//0 1 2 3
        Scanner inp=new Scanner(System.in);
    System.out.println("Enter first number: ");
    num1=inp.nextInt();
    System.out.println("Enter second number: ");
    num2=inp.nextInt();
        try{
            int res=num1/num2;
            System.out.println("The result is: "+res);
        int i=arr[4];
        System.out.println(i);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Trying to access wrong element in the array");
        }
        catch(ArithmeticException ex1){
            System.out.println("you are trying to divide a number by zero, that's not possible");
        }
        System.out.println("This is after the error line");
    }
}
