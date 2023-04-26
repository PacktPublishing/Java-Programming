package Day8javaclass;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class demo7 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        String str1="";
        try{
            BufferedReader br= new BufferedReader(new FileReader("E:/JavaFiles/one.txt"));
            while(str1!=null){
                sb.append(str1);
                sb.append(System.lineSeparator());
                str1=br.readLine();
                System.out.println(str1);
            }
            br.close();
        }catch(FileNotFoundException ex){
            System.out.println("File not found");
        }
         catch(IOException ex1){
                 System.out.println("Unable to read the file");
          }      
    }
}
