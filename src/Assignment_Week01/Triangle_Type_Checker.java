package Assignment_Week01;

import java.util.Scanner;

public class Triangle_Type_Checker {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int side1=input.nextInt();
        int side2=input.nextInt();
        int side3=input.nextInt();
        if (side1==side2 && side1==side3){
            System.out.println( "Equilateral");
        } else if (side1==side2 || side1==side3 || side2==side3) {
            System.out.println("Isosceles");
        }else{
            System.out.println("Scalene");
        }
    }
}
