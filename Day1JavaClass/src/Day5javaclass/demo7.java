package Day5javaclass;

import java.util.Scanner;

public class demo7 {
private int stud_id;
private String sname;
public int getid(){
    return stud_id;
}
public void setid(int sid){
    this.stud_id=sid;
}
public String getname(){
    return sname;
}
public void setname(String s_name){
    this.sname=s_name;
}
public static void main(String[] args) {
    demo7 d7=new demo7();
    int id;
    String snm;
    Scanner inp=new Scanner(System.in);
    System.out.println("Enter Student id: ");
    id=inp.nextInt();
    System.out.println("Enter Student name: ");
    snm=inp.next();
    d7.setid(id);
    d7.setname(snm);
    System.out.println("The Student id is: "+d7.getid());
    System.out.println("The Student name is: "+d7.getname());
}
}
