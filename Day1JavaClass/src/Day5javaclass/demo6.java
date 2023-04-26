
package Day5javaclass;

import java.util.Scanner;

public class demo6 {
private int age;
public int getAge(){
    return age;
}
public void setAge(int age){
    this.age=age;
}
public static void main(String[] args) {
    demo6 d6=new demo6();
    Scanner inp=new Scanner(System.in);
    System.out.println("Enter age: ");
    int age=inp.nextInt();
    d6.setAge(age);
    System.out.println("The age is : "+d6.getAge());
}
}
