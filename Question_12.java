import java.util.*;

public class Question_12 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        //!..Swapping using Arithmetic operators...
        System.out.print("a = ");
        int a = scn.nextInt();

        System.out.print("b = ");
        int b = scn.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.print("a = " + a + "  " + "b = " + b);
    }
}