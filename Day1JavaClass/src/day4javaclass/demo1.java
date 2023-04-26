
package day4javaclass;

abstract class Bank{
    abstract int getinterest();
}
class SBI extends Bank{
    int getinterest(){
        return 8;
    }
}
class HDFC extends Bank{
    int getinterest(){
        return 7;
    }
}
class ICICI extends Bank{
    int getinterest(){
        return 6;
    }
}
public class demo1 {
 public static void main(String[] args) {
     Bank b;
     b=new SBI();
     System.out.println("Rate of interest of SBI Bank is: "+b.getinterest()+"%");
     b=new HDFC();
     System.out.println("Rate of interest of HDFC Bank is: "+b.getinterest()+"%");
     b=new ICICI();
     System.out.println("Rate of interest of ICICI Bank is: "+b.getinterest()+"%");
 }    
}

