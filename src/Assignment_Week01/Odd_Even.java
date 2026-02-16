package Assignment_Week01;

import java.util.*;

public class Odd_Even {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if (n%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
