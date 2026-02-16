package Assignment_Week01;

import java.util.*;

public class Voting_Eligibility {
    public static void main(String[] args){
        Scanner age=new Scanner(System.in);
        int n=age.nextInt();
        if (n>=18){
            System.out.println("Eligible");
        }else {
            System.out.println( "Not Eligible" );
        }
    }

}
