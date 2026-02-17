package Assignment_Week01;

import java.util.Scanner;

public class Greater_Than100 {
    public static void main(String[] args){
        Scanner num=new Scanner(System.in);
        int number=num.nextInt();
        if (number>100){
            System.out.println( "Greater");
        }else {
            System.out.println("Not Greater");
        }
    }
}
