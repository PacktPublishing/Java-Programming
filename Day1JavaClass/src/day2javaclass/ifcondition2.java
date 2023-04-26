package day2javaclass;

import java.util.Scanner;

public class ifcondition2 {
    public static void main(String[] args) {
        char ch;
        Scanner inp =new Scanner(System.in);
        System.out.println("Enter a character: ");
        ch=inp.next().charAt(0);
        if(ch=='a' ||ch=='e' || ch=='i' ||ch=='o' ||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println(ch+ " is a vowel");
        }
        else
        {
            System.out.println(ch+ " is a Consonent");
        }
    }
}
