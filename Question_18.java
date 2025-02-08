import java.util.Scanner;

public class Question_18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Year: ");
        int n = scn.nextInt();

        if(n % 4 == 0 || n % 400 == 0){
            System.out.print(n + " is a Leap Year.");
        }
        else if(n % 100 != 0){
            System.out.print(n + " is not a Leap Year.");
        }
        else{
            System.out.print("Enter Valid Year!!");
        }
    }
}