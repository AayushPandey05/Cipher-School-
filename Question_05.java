import java.util.*;

public class Question_05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter current permissions (0-15): ");
        int permissions = scn.nextInt();

        System.out.println("Enter the bit position to toggle (0-3): ");
        int position = scn.nextInt();

        if(position < 0 || position > 3){
            System.out.println("Please enter the valid bit position to toggle (0-3): ");
        }

        int mask =  1 << position; //to shift left
        int update = position ^ mask; //Xor

        System.out.println(Integer.tobinary(position));
        System.out.println(Integer.tobinary(update));
    }
}