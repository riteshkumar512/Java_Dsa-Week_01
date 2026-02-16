package lecture_01;

import java.util.*;

public class Positive_Negative {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int n=input.nextInt(); //user input
        if(n>0){
            System.out.println("Positive");
        }
        else if(n<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
}
