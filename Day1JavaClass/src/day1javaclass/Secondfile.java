
package day1javaclass;
import java.util.Scanner;

public class Secondfile {
    public static void main(String[] args) {
        Scanner scan1=new Scanner(System.in);//class object
        String fnm,lnm;
        System.out.println("Enter First Name: ");
        fnm=scan1.next();
        System.out.println("Enter Last Name: ");
        lnm=scan1.next();
        System.out.println("Welcome: "+fnm+" "+lnm);
        
    }
}
