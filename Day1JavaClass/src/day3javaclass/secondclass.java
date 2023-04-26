
package day3javaclass;

import java.util.Scanner;

public class secondclass {
    String unm;
    //Constructor has the same name as that of the class
    secondclass(){
        System.out.println("This is the default constructor");
    }
    secondclass(String name1){
        unm=name1;
    }
     public static void add(int n1,int n2){
        System.out.println("The Addition is: "+(n1+n2));       
    }
    public static void sub(int n1,int n2){
        System.out.println("The Subtraction is: "+(n1-n2));
    }
    public static void mul(int n1,int n2){
        System.out.println("The Product is: "+(n1*n2));
    }
    public static void div(int n1,int n2){
        System.out.println("The Division is: "+(n1/n2));
    }
    public void display(){
        System.out.println("This is a method without any parameter");
        System.out.println("Your name is: "+unm);
    }
  public static void main(String[] args) {
      int num1,num2;
      Scanner inp=new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1=inp.nextInt();
        System.out.println("Enter second number: ");
        num2=inp.nextInt();
        secondclass s1=new secondclass();
        secondclass s2=new secondclass("John");
        s2.display();
        add(num1, num2);
        sub(num1, num2);
        mul(num1, num2);
        div(num1, num2);
  }   
}
