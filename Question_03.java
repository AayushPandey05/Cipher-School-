import java.util.*;

public class Question_03{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
 
        System.out.print("Enter the total cart amount: ");
        int cartAmount = scn.nextInt();

        if(cartAmount > 5000) {
            double discount = cartAmount * 0.2;
            double finalAmount = cartAmount - discount;

            System.out.printf("Discount: Rs.%.1f\n", discount);
            System.out.printf("Final Amount: Rs.%.1f\n", finalAmount); 
        }

        else if(cartAmount >= 3000 && cartAmount <= 5000) {
            double discount = cartAmount * 0.1;
            double finalAmount = cartAmount - discount;

            System.out.printf("Discount:  Rs.%.1f\n", discount);
            System.out.printf("Final Amount: Rs.%.1f\n", finalAmount); 
        }

        else{
            System.out.printf("No Discount below Rs.3000");
            System.out.printf("Final Amount: Rs.%.1f\n", cartAmount); 
        }
    }
}