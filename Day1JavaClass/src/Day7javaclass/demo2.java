
package Day7javaclass;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        int var1,var2;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter first number: ");
        var1=inp.nextInt();
        System.out.println("Enter Second number: ");
        var2=inp.nextInt();
        IntWrap a=new IntWrap(var1);
        IntWrap b=new IntWrap(var2);
        System.out.println("In the Main Function Before Calling Swap function var1 = "+a.a+" var2 = "+b.a);
        Swapfunc(a, b);
        System.out.println("In the Main Function After Swapping var1 = "+a.a+" var2 = "+b.a);
    }
    public static void Swapfunc(IntWrap a, IntWrap b){
        
       System.out.println("Before swapping the values(Inside), num1 = " +a.a+" num2 = "+b.a);
        IntWrap c=new IntWrap(a.a);
        a.a = b.a;
        b.a=c.a;
        //num1=num2
        //num2=num1
         System.out.println("After swapping the values(Inside), num1 = " +a.a+" num2 = "+b.a);
    }
}
//by reference
class IntWrap{
    public int a;
    public IntWrap(int a)
    {
        this.a=a;
    }
}