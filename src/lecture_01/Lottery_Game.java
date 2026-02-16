package lecture_01;

public class Lottery_Game {
    public static void main(String[] args){
        int no=111;
        if(no>=100 && no<=350){
            System.out.println("You won Bike");
        }
        else if(no>=450 && no<=585){
            System.out.println("You won MacBook");
        }
        else if(no>=51 && no<=99){
            System.out.println("You won Cycle");
        }
        else if(no>=642 && no<=755){
            System.out.println("You won car");
        }
        else {
            System.out.println("Happy Birthday");
        }
    }
}
