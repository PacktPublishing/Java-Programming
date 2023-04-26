
package Day7javaclass;
//call by value

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        int var1,var2;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter first number: ");
        var1=inp.nextInt();
        System.out.println("Enter Second number: ");
        var2=inp.nextInt();
        System.out.println("In the Main Function Before Calling Swap function var1 = "+var1+" var2 = "+var2);
        swapFunc(var1, var2);
        System.out.println("In the Main Function After Swapping var1 = "+var1+" var2 = "+var2);
    }
    public static void swapFunc(int num1,int num2){
        System.out.println("Before swapping the values(Inside), num1 = " +num1+" num2 = "+num2);
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After swapping the values(Inside), num1 = " +num1+" num2 = "+num2);
    }
}
