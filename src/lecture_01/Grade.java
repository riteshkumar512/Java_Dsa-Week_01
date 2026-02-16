package lecture_01;

public class Grade {
    public static void main(String[] args){
        int marks=59;
        if(marks>=75){
            System.out.println("Grade A");
        }
        else if (marks>=65 && marks<75){
            System.out.println("Grade B");
        }
        else if (marks>=55 && marks<65){
            System.out.println("Grade C");
        }
        else if (marks>=45 && marks<55){
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }
}
