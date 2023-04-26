
package Day7javaclass;

import java.util.Scanner;

public class demo7 {
    public static void main(String[] args) {
        String str="",str2;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a sample string: "); //java programming
        str=inp.next();
        System.out.println("Enter the word which you want to replace: ");//java
        str2=inp.next();
        String newstr = str.replace(str2,"replace");
        System.out.println("New string is: "+newstr);
        
    }
}
