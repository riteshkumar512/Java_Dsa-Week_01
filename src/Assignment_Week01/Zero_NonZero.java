package Assignment_Week01;

import java.util.Scanner;

public class Zero_NonZero {
    public static void main(String[] args){
        Scanner num=new Scanner(System.in);
        int number=num.nextInt();
        if (number ==0){
            System.out.println("Zero");
        }else {
            System.out.println("Non-Zero");
        }
    }
}
