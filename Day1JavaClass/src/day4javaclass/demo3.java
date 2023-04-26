
package day4javaclass;

interface Drawable{
    void draw();
}

class Rectangle1 implements Drawable{
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}
class Circle implements Drawable{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}
class Triangle1 implements Drawable{
    public void draw(){
        System.out.println("Drawing Triangle");
    }
}
public class demo3 {
    public static void main(String[] args) {
        Drawable d=new Circle();
        d.draw();
        Drawable d1=new Rectangle1();
        d1.draw();
        Drawable d2=new Triangle1();
        d2.draw();
    }
}
