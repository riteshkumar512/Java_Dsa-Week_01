package lecture_01;

public class MaximumThreeNumber {
    public static void main(String[] args){
        int a=121;
        int b=23;
        int c=22;
        if (a>=b && a>=c){
            System.out.println("Maximum Number is:" +a);
        }
        else if (b>=c){
            System.out.println("Maximum Number is:" +b);
        }
        else{
            System.out.println("Maximum Number is:" +c);
        }
    }
}
