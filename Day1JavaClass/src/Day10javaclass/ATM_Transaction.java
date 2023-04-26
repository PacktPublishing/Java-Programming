
package Day10javaclass;

import java.util.Scanner;

public class ATM_Transaction {
    public static void main(String args[]){
        int bal=5000,varwithdraw,vardeposit;
        Scanner inp=new Scanner(System.in);
        while(true){
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for Exit");
            System.out.println("Choose the operation you want to perform: ");
            int res=inp.nextInt();
            switch(res){
                case 1:
                    System.out.println("Enter money to be withdrawn: ");
                    varwithdraw=inp.nextInt();
                    if(bal>=varwithdraw){
                        bal=bal-varwithdraw;
                        System.out.println("Please Collect your Money");                                
                    }
                    else{
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Enter money to be deposited: ");
                    vardeposit=inp.nextInt();
                    bal=bal+vardeposit;
                    System.out.println("Your money has been deposited Successfully");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Your account Balance is: "+bal);
                    System.out.println("");
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid option");
        }                    
        }
    }
}
