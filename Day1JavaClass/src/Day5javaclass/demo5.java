package Day5javaclass;

import com.sun.xml.internal.stream.Entity;
import java.util.Scanner;

public class demo5 {
int length;
int breadth;

demo5(int len,int bre){
    this.length=len;
    this.breadth=bre;
}
public void getArea(){
    int area=length*breadth;
    System.out.println("Area is: "+area);
}
public static void main(String[] args) {
    int l,b;
    Scanner inp=new Scanner(System.in);
    System.out.println("Enter value of length: ");
    l=inp.nextInt();
    System.out.println("Enter value of breadth: ");
    b=inp.nextInt();
    demo5 d5=new demo5(l, b);
    d5.getArea();
}
}

