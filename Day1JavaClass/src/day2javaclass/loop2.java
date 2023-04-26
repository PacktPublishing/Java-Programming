
package day2javaclass;

import java.util.Scanner;


public class loop2 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int num,num2,sum=0;
        
        System.out.println("Enter starting number: ");//10
        num=inp.nextInt();
        System.out.println("Enter ending number: ");//20
        num2=inp.nextInt();
       /* int i=num;
        while(i<=num2)//10<=20
        {
            sum+=i;//10+11+12+13+14+...20
            i++;
        }*/
       for(int i=num;i<=num2;++i){
           sum+=i;
       }
        System.out.println("Sum of natural numbers from "+num+ " till "+num2+ " = "+sum);
    }
}
