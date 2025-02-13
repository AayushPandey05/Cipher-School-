import java.util.Scanner;

public class Question_23 {
    public static void generatePascalTriangle(int n) {

        int[][] triangle = new int[n][]; //Declaring a 2-D array.....
        
        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1; // Har row mai pehla element 1 hoga....
            triangle[i][i] = 1; // har row ka last element 1 hoga....
            
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scan.nextInt();
        scan.close();
        
        generatePascalTriangle(n);
    }
}