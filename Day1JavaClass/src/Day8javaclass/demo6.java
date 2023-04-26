package Day8javaclass;

import java.io.File;

public class demo6 {
     public static void main(String[] args) {
         File file1=new File("E:/JavaFiles/file.txt");
         if(file1.isDirectory()){
             System.out.println(file1.getAbsolutePath()+" is a directory");
         }
         else
         {
             System.out.println(file1.getAbsolutePath()+" is not a directory");
         }
         if(file1.isFile()){
             System.out.println(file1.getAbsolutePath()+" is a file");
         }
         else
         {
             System.out.println(file1.getAbsolutePath()+" is not a file");
         }
             
     }
}
