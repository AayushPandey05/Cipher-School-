import java.util.Scanner;

public class Question_01 {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int marks = scn.nextInt();
        
        if(marks < 0 && marks > 100){
            System.out.print("Enter Valid Marks!!");
            return;
        }

        if(marks >= 90){
            System.out.print("Grade A");
        }

        else if(marks >= 80 && marks < 90){
            System.out.print("Grade B");
        }

        else if(marks >= 70 && marks < 80){
            System.out.print("Grade C");
        }

        else if(marks >= 60 && marks < 70){
            System.out.print("Grade D");
        }

        else{
            System.out.print("Grade F");
        }
    }
}