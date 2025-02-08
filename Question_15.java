import java.util.Scanner;

public class Question_15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j < n - i + 1; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}