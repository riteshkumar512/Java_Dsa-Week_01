package Assignment_Week01;

import java.util.Scanner;

public class Divisible_By_5 {
    public static void main(String[] args){
        Scanner num=new Scanner(System.in);
        int number=num.nextInt();
        if (number%5==0){
            System.out.println("Divisible");
        }else {
            System.out.println("Not Divisible");
        }
    }
}
