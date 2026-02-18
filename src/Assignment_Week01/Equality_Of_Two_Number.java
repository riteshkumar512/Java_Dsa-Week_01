package Assignment_Week01;

import java.util.Scanner;

public class Equality_Of_Two_Number {
    public static void main(String [] args){
        Scanner num1=new Scanner(System.in);
        Scanner num2=new Scanner(System.in);
        int number1=num1.nextInt();
        int number2=num1.nextInt();
        if (number1 == number2){
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }
    }
}
