
package Day6javaclass;

public class demo1 {
public static void main(String[] args) {
    int a=50;
    double d1=5.677;
    Integer obj1=Integer.valueOf(a);
    Double obj2=Double.valueOf(d1);
    if(obj1 instanceof Integer){
        System.out.println("An object of Integer class is created");
    }
    if(obj2 instanceof Double){
        System.out.println("An object of Double class is created");
    }
}

}
