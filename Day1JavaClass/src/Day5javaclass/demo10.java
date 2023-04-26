
package Day5javaclass;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class demo10 {
    
     public static void main(String[] args) {
         Dictionary<String, String> dict=new Hashtable<>();
         dict.put("101", "ABC");
         dict.put("102", "John");
         dict.put("1053", "Mishal");
         dict.put("1052", "Java");
         dict.put("1051", "Perth");
         dict.put("106", "Miller");
         dict.put("107", "STC");
         dict.put("108", "ABC");
        System.out.println(dict);
         System.out.println("The size of dictionary is: "+dict.size());
         System.out.println("The value of the specified key is : "+dict.get(107));
         for(Enumeration enm= dict.keys(); enm.hasMoreElements();){
             System.out.println(enm.nextElement());
         }
         Enumeration<String> keys=dict.keys();
         while(keys.hasMoreElements()){
             String key1=keys.nextElement();
             if(key1.startsWith("105")){
                 String value = dict.get(key1);
                 System.out.println("Key: "+key1+", Value: "+value);
             }
         }
}
}
