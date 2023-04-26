
package Day8javaclass;

import java.io.File;
import java.io.FilenameFilter;

public class demo4 {
     public static void main(String[] args) {
         File file1=new File("E:/JavaFiles/");
         String[] list1=file1.list(new FilenameFilter(){
             @Override
             public boolean accept(File dir,String name){
                 if(name.toLowerCase().endsWith(".txt")){
                     return true;
                 }
                 else{
                     return false;
                 }
             }
         });
         for(String f1:list1){
             System.out.println(f1);
         }
     }
}
