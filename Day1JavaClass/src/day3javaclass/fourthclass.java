
package day3javaclass;

public class fourthclass {
    public static void main(String[] args) {
        baseclass b=new baseclass();
        deriveclass d=new deriveclass();
        b.method1();
        d.method1();
    }
}
class baseclass{
    void method1(){
        System.out.println("Base Class Method");
    }
}
class deriveclass extends baseclass{
    void method1(){
        System.out.println("Derive Class Method");
    }
}
