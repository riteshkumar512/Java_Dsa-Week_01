package Assignment_Week01;

import java.util.Scanner;

public class Electricity_Bill_Calculator {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int unit=input.nextInt();
        if (unit<=100){
            System.out.println(unit*2);
        } else if (unit<=200) {
            System.out.println(unit*3);
        }else{
            System.out.println(unit*5);
        }
    }
}
