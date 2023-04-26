
package day4javaclass;

import java.util.Scanner;

public class demo5 {
 public static void main(String[] args) {
     Scanner inp=new Scanner(System.in);
     System.out.println("Enter a character: ");
     char ch1=inp.next().charAt(0);
     System.out.println("Enter a character: ");
     char ch2=inp.next().charAt(0);
     //ascii A a S @ #
     int asciivalue1=ch1;
     int asciivalue2=ch2;
     
     System.out.println("The ASCII Value of " +ch1+" is: "+asciivalue1);
     System.out.println("The ASCII Value of " +ch2+" is: "+asciivalue2);
     
     
 }
    
}

