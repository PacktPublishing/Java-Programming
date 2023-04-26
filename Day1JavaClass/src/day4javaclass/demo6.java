
package day4javaclass;

import java.util.Scanner;

public class demo6 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter any Alphabet: ");
        char ch=inp.next().charAt(0);        
        if(ch>=65 && ch<=97){
            System.out.println("Alphabet is in upper case");
        }
        else if(ch>=97 && ch<=122){
            System.out.println("Alphabet is in lower case");
        }
        else
        {
            System.out.println("Invalid Alphabet");
        }
        Day5javaclass.demo1 d=new Day5javaclass.demo1();
        Day5javaclass.demo3 d3=new Day5javaclass.demo3();
        d.display();
        
        
    }
}
