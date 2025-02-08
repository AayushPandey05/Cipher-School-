import java.util.Scanner;

public class Question_17 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

 //! Input for Matrix A
        System.out.print("Enter row: ");
        int n = scn.nextInt();
        System.out.print("Enter colume: ");
        int m = scn.nextInt();

        int arr[][] =  new int[n][m];
        System.out.println("Enter Matrix A Elements: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        System.out.println("Matrix A:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }

//! Input for Matrix B
        System.out.print("Enter row: ");
        int a = scn.nextInt();
        System.out.print("Enter colume: ");
        int b = scn.nextInt();

        int arr1[][] =  new int[a][b];
        System.out.println("Enter Matrix B Elements: ");
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                arr1[i][j] = scn.nextInt();
            }
        }

        System.out.println("Matrix B:");
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.print("\n");
        }
//! RESULTANT MULTIPLICATION

        int c[][] = new int[n][b]; 
        for(int i = 0; i < n; i++){
            for(int j = 0; j < b; j++) {
                for(int k = 0 ; k < m; k++){
                    c[i][j] += arr[i][k] * arr1[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}