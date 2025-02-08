import java.util.Scanner;

public class Question_16{

    public static int Fibonacci(int n){

        int a = 0, b = 1;
        int count = 0;
        System.out.print("Fibonacci Series: ");

        if(n >= 1){
            System.out.print(a + " ");
            count++;
        }

        if(n >= 2){
            System.out.print(b + " ");
            count++;
        }

        for(int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
            count++;
        }

        System.out.print("\n");
        return count;

    }

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        Fibonacci(n);
    }
}