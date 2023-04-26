
package Day5javaclass;

import java.util.Scanner;

/*
WAP to create private long acc_no,string name,string email,float amount
create getter and setter methods for all the private variables and assign value and print the values back
 */
public class Day5Assignment1 {
        //private data members  
    private long acc_no;  
    private String name,email;  
    private float amount;  
    
  //public getter and setter methods for each data member 
    public long getAcc_no() {  
        return acc_no;  
    }  
    public void setAcc_no(long acc_no) {  
        this.acc_no = acc_no;  
    }  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public String getEmail() {  
        return email;  
    }  
    public void setEmail(String email) {  
        this.email = email;  
    }  
    public float getAmount() {  
        return amount;  
    }   
    public void setAmount(float amount) {  
        this.amount = amount;  
    }  
    public static void main(String[] args) {  
        //create instance of Account class  
        Scanner inp = new Scanner(System.in);
        
        Day5Assignment1 myAcc=new Day5Assignment1();  
        System.out.println("Enter Account number: ");
        long acc=inp.nextLong();
        System.out.println("Enter Account holder name: ");
        String name=inp.next();
        System.out.println("Enter Email ID: ");
        String emailid=inp.next();
        System.out.println("Enter Amount: ");
        float amt=inp.nextFloat();
        //set values for data members through setter methods  
        myAcc.setAcc_no(acc);  
        myAcc.setName(name);  
        myAcc.setEmail(emailid);  
        myAcc.setAmount(amt);  
        //read data member values through getter methods  
        System.out.println("Account No: " + myAcc.getAcc_no()+"\nAccount Name: "
                + myAcc.getName()+"\nAccount holder email: " + myAcc.getEmail()
                + "\nAmount in Account:" + myAcc.getAmount());  
    }  

}
