package lecture_01;
public class Lottery_Game2 {
    public static void main(String[] args){
        int no=750;
        if(no>=100 && no<=350){
            System.out.println("You won Bike");
            if (no<=289){
                System.out.println("Hero Bike");
            }
            else {
                System.out.println("KTM Bike");
            }
        }
        else if(no>=450 && no<=585){
            System.out.println("You won MacBook");
            if (no<=519){
                System.out.println("M1 Mac");
            }
            else {
                System.out.println("M2 Mac");
            }
        }
        else if(no>=51 && no<=99){
            System.out.println("You won Cycle");
            if (no<=79){
                System.out.println("Atlas Cycle");
            }
            else {
                System.out.println("Avon Cycle");
            }
        }
        else if(no>=642 && no<=755){
            System.out.println("You won car");
            if (no<=750){
                System.out.println("Thar");
            }
            else {
                System.out.println("Creta");
            }
        }
        else {
            System.out.println("Happy Birthday");
        }
    }
}
