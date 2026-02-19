package Assignment_Week01;

import java.util.Scanner;

public class Salary_Bonus_Checker {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int salary=input.nextInt();
        int experience=input.nextInt();
        if (experience>=5){
            System.out.println((salary*10)/100);
        }else {
            System.out.println(0);
        }
    }
}
