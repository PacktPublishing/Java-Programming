
package Day10javaclass;

import java.util.Scanner;

public class AtmMachine {
private static Scanner inp;
private static float bal=0;
private static int transaction;
public static void main(String[] args){
    inp=new Scanner(System.in);
    transaction_func();
}
private static void transaction_func(){
    int res;
    System.out.println("Please select one option: ");
    System.out.println("1. Withdraw");
    System.out.println("2. Deposit");
    System.out.println("3. Balance Check");
    res=inp.nextInt();
    switch(res){
        case 1:
            float amt;
            System.out.println("Please enter the amount to withdraw: ");
            amt=inp.nextInt();
            if(amt > bal || amt==0){
                System.out.println("You have insuffient balance");
                anothertrans();
            }else{
                bal=bal-amt;
                System.out.println("You have withdrawn " +amt+" and your new balance is "+bal);
                anothertrans();
            }
            break;
        case 2:
            float vardeposit;
            System.out.println("Please enter the amount you want to deposit: ");
            vardeposit=inp.nextFloat();
            bal=vardeposit+bal;
            System.out.println("You have deposited " +vardeposit+" new balance is "+bal);
            anothertrans();
            break;
        case 3:
            System.out.println("Your balance is: "+bal);
            anothertrans();
            break;
        default:
            System.out.println("Invalid option");
            anothertrans();
            break;
    }
}
private static void anothertrans(){
    System.out.println("Do you want another transaction? \nPress 1 for another transaction \n2 To Exit");
    transaction=inp.nextInt();
    if(transaction==1){
        transaction_func();
    }else if(transaction==2){
        System.out.println("Thanks for using this ATM Machine, Bye!!!");
    }
    else{
        System.out.println("Invalid Choice : ");
        anothertrans();
    }
}
}

