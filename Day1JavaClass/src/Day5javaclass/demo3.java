
package Day5javaclass;


public class demo3 {
private void display(){
    System.out.println("This is private display method of demo3 class in the Day5javaclass package");
}    
protected void display2(){
    System.out.println("This is protected display method of demo3 class in the Day5javaclass package");
}
 public static void main(String[] args) {
     demo3 d=new  demo3();
     d.display();
     d.display();
 }
}
