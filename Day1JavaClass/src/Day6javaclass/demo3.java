
package Day6javaclass;

public class demo3 {
public static void main(String[] args) {
    
    byte b1=20;
    short s1=30;
    int num1=50;
    long l1=5678788;
    float f1=45.6F;
    double d1=45.657D;
    char ch1='a';
    boolean b2=true;
    
    Byte obj1=b1;
    Short obj2=s1;
    Integer obj3=num1;
    Long obj4=l1;
    Float obj5=f1;
    Double obj6=d1;
    Character obj7=ch1;
    Boolean obj8=b2;
    
    System.out.println("Byte object : "+obj1);
    System.out.println("Short object : "+obj2);
    System.out.println("Integer object : "+obj3);
    System.out.println("Long object : "+obj4);
    System.out.println("Float object : "+obj5);
    System.out.println("Double object : "+obj6);
    System.out.println("Character object : "+obj7);
    System.out.println("Boolean object : "+obj8);
    
    byte b3=obj1;
    short s2=obj2;
    int num2=obj3;
    long l2=obj4;
    float f2=obj5;
    double d2=obj6;
    char ch2=obj7;
    boolean b4=obj8;
    
    System.out.println("byte value: "+b3);
    System.out.println("short value: "+s2);
    System.out.println("int value: "+num2);
    System.out.println("long value: "+l2);
    System.out.println("float value: "+f2);
    System.out.println("double value: "+d2);
    System.out.println("char value: "+ch2);
    System.out.println("boolean value: "+b4);
}    
}
