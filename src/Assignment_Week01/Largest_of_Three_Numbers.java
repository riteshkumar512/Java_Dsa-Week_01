package Assignment_Week01;

import java.util.Scanner;

public class Largest_of_Three_Numbers {
    public static void main(String[] args){
        Scanner num1=new Scanner(System.in);
        Scanner num2=new Scanner(System.in);
        Scanner num3=new Scanner(System.in);
        int number1=num1.nextInt();
        int number2=num1.nextInt();
        int number3=num1.nextInt();

        if (number1>=number2 && number1>=number3){
            System.out.println(number1);
        }else if (number2>=number3){
            System.out.println(number2);
        }else{
            System.out.println(number3);
        }
    }
}
