//!..Check Eligibility for Premium Membership
import java.util.*;

public class Question_04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scn.nextInt();
        
        System.out.print("Enter your monthly income: ");
        double monthlyIncome = scn.nextDouble();

        System.out.print("Do you have pending dues (true/false): ");
        boolean pendingDue = scn.nextBoolean();

        String eligible = (age >= 18 && monthlyIncome >= 30000 && pendingDue == false) ? "You are eligible for premium membership." : "You are not eligible for premium membership"; 
        System.out.println(eligible);
    }
}