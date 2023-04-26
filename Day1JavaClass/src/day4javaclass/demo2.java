
package day4javaclass;

abstract class shape{
    abstract void draw();
}
class Rectangle extends shape{
    void draw(){
        System.out.println("Drawing Rectangle");
    }
}
class Square extends shape{
    void draw(){
        System.out.println("Drawing Square");
    }
}
class Triangle extends shape{
    void draw(){
        System.out.println("Drawing Triangle");
    }
}
public class demo2 {
    public static void main(String[] args) {
        shape s;
        s=new Rectangle();
        s.draw();
        s=new Square();
        s.draw();
        s=new Triangle();
        s.draw();
    }
}
