
package fifthfile;

public class java {
 public static void main(String[] args) {
     int n1=20,n2=-10,n3=45,n4=4;
     boolean b=true,b1=false;
     int num1=20,num2=2,num3=40,res;
     int n5=10;
     System.out.println("Post increment operator: "+(n1++));
     System.out.println("Pre increment operator: "+(++n1));
     System.out.println("Post decrement operator: "+(n1--));
     System.out.println("Pre decrement operator: "+(--n1));
     System.out.println("Negation operator: "+~n1); // -20-1 = -21
     System.out.println("Negation operator: "+~n2); // 10-1 = 9
     System.out.println("Modulo operator: "+(n3%n4));
     System.out.println("Division operator: "+(n3/n4));
     System.out.println((100*10)/5+3*4/2);//BODMAS //100*2+3*2 //200+3*2 // 200+6 = 206
     //+= -= *= /=
     //n1=n1+5 n1+=5 n1-=5 n1*=5 n1/=5
     System.out.println("+= operator: "+(n5+=10));
     System.out.println("-= operator: "+(n5-=10));
     System.out.println("*= operator: "+(n5*=10));
     System.out.println("/= operator: "+(n5/=10));
     
 }
}
