
package Day8javaclass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import jdk.jfr.events.FileWriteEvent;

public class demo9 {
    public static void main(String[] args) {
          BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str1="";
        try{
            String file1="E:/JavaFiles/one.txt";
            FileWriter fw=new FileWriter(file1,true);
            System.out.println("Enter a line to add in file: ");
             String str2=r.readLine();
            fw.write("\n"+str2);
            fw.close();
            BufferedReader br=new BufferedReader(new FileReader(file1));
            while(str1!=null){
                sb.append(str1);
                sb.append(System.lineSeparator());
                str1=br.readLine();
                System.out.println(str1);
                        
            }
            br.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
