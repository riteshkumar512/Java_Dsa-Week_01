package Assignment_Week01;

import java.util.Scanner;

public class Multiple_of_3_and_7 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        if (number%3==0 && number%7==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
