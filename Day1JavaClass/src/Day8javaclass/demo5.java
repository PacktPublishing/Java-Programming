
package Day8javaclass;

import java.io.File;

public class demo5 {
     public static void main(String[] args) {
         File file1=new File("E:/JavaFiles/file.txt");
         if(file1.exists()){
             System.out.println("The Directory or file exists");
         }
         else
         {
             System.out.println("The Directory or file does not exists");
         }
     }
}
