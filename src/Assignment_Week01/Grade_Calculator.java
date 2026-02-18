package Assignment_Week01;

import java.util.Scanner;

public class Grade_Calculator {
    public static void main(String[] args){
        Scanner m=new Scanner(System.in);
        int marks=m.nextInt();
        if (marks>=90){
            System.out.println("A");
        } else if (marks>=75 && marks<90) {
            System.out.println("B");
        } else if (marks>=60 && marks<75) {
            System.out.println("C");
        }else {
            System.out.println("Fail");
        }
    }
}
