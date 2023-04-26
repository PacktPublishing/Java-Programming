
package day2javaclass;

public class loop3 {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            if(i==5)
                continue;
            System.out.println(i);
        }
        System.out.println("Out of loop");
    }
}
