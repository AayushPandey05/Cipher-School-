import java.util.*;

public class Question_25 {

    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scn.nextInt();

        boolean isPrime = true;
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }

        for(int i = 1; i <= n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
}