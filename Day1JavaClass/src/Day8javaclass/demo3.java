
package Day8javaclass;

import java.io.File;

public class demo3 {
    public static void main(String[] args) {
        File file=new File("E:/JavaFiles/");
        String[] filelist1=file.list();
        for(String name:filelist1){
            System.out.println(name);
        }
    }
}
