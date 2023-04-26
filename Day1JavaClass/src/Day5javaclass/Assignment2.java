
package Day5javaclass;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class Assignment2 {
    /*
    WAP to make a dictionary to store the student id and name enter 10 values, and try to print the values using
    dict method you can also use loop, also fetch the dict size
    */
     public static void main(String[] args) {
         Dictionary studdetails=new Hashtable();
         studdetails.put(1, "ABC");
         studdetails.put(2, "John");
         studdetails.put(3, "Mishal");
         studdetails.put(4, "Java");
         studdetails.put(5, "Perth");
         studdetails.put(6, "Miller");
         studdetails.put(7, "STC");
         studdetails.put(8, "ABC");
        System.out.println(studdetails);
         System.out.println("The size of dictionary is: "+studdetails.size());
         for(Enumeration enm= studdetails.keys(); enm.hasMoreElements();){
             System.out.println(enm.nextElement());
         }
     }
    
}
