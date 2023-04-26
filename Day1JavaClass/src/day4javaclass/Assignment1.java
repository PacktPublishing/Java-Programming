package day4javaclass;

/*
WAP to create an interface for Bank and method getinterest and implement it in various other classes
 */

interface Bank1{
float rateOfInterest();
} 
class SBI1 implements Bank1{
public float rateOfInterest(){return 8.15f;}
}
class PNB implements Bank1{
public float rateOfInterest(){return 8.7f;}
}
class YesBank implements Bank1{
public float rateOfInterest(){return 7.7f;}
}

public class Assignment1 {
    public static void main(String[] args){
Bank1 b=new SBI1();
System.out.println("Rate Of Interest: "+b.rateOfInterest());
b=new PNB();
System.out.println("Rate Of Interest: "+b.rateOfInterest());
b=new YesBank();
System.out.println("Rate Of Interest: "+b.rateOfInterest());
}

}
