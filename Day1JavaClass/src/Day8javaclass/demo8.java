package Day8javaclass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class demo8 {
     public static void main(String[] args) {
         StringBuilder sb=new StringBuilder();
         String str1="";
         try{
             String filename="E://JavaFiles//one.txt";
             BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw=new FileWriter(filename,false);             
             System.out.println("Enter a line to add in file: ");
             String str2=r.readLine();
             fw.write(str2);
             fw.close();
             BufferedReader br=new BufferedReader(new FileReader("E://JavaFiles//one.txt"));
             while(str1!=null){
                 sb.append(str1);
                 sb.append(System.lineSeparator());
                 str1=br.readLine();
                 System.out.println(str1);
             }
             br.close();
         }
         catch(IOException ex){
             System.out.println("Error occured");
         }
     }
}
