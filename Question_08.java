import java.util.*;

public class Question_08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter num: ");

        int num = scn.nextInt();
        
        int rev = 0;
        while(num != 0){
            int lastDigit = num % 10;

            if(rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                System.out.print("overflows Num: 0");
                return;
            }

            rev = (rev * 10) + lastDigit;
            num /= 10;
        }

        System.out.println("Reversed Num: " + rev);
    }
}