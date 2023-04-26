
package day3javaclass;

import java.util.Scanner;

public class thirdclass {
    public static int n1,n2,n3;
    public static float f1;
    public static int result;
    Scanner inp=new Scanner(System.in);
    static int add(int n1,int n2){
        return n1+n2;
    }
    static int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    static float add(int n1,int n2, float f1){
        return n1+n2+f1;
    }
    public void accept2(){
        System.out.println("Enter First Number: ");
        n1=inp.nextInt();
        System.out.println("Enter Second Number: ");
        n2=inp.nextInt();
        int res = add(n1, n2);
        System.out.println("The Result is: "+res);
    }
    public void accept3(){
        System.out.println("Enter First Number: ");
        n1=inp.nextInt();
        System.out.println("Enter Second Number: ");
        n2=inp.nextInt();
        System.out.println("Enter Third Number: ");
        n3=inp.nextInt();
        int res=add(n1, n2, n3);
        System.out.println("The Result is: "+res);
    }
    public void accept31(){
        System.out.println("Enter First Number: ");
        n1=inp.nextInt();
        System.out.println("Enter Second Number: ");
        n2=inp.nextInt();
        System.out.println("Enter Third Number: ");
        f1=inp.nextFloat();
        float res=add(n1, n2, f1);
        System.out.println("The Result is: "+res);
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Please enter proper input: ");
        System.out.println("1. Adding 2 integer values");
        System.out.println("2. Adding 3 integer values");
        System.out.println("3. Adding 3 integer & float values");
        result=inp.nextInt();
        thirdclass t1=new thirdclass();
        if(result==1){
            t1.accept2();            
        }
        else if(result==2){
            t1.accept3();
        }
        else if(result==3){
            t1.accept31();
        }
    }
}
