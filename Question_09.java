import java.util.Scanner;

public class Question_09 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns:");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt(); 

       
        int[][] array = new int[rows][cols];

   
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt(); 
            }
        }

       
        int maxSum = 0; 
        int maxRow = -1;

        for (int i = 0; i < rows; i++) {
            int rowSum = 0; 
            for (int j = 0; j < cols; j++) {
                rowSum += array[i][j]; 
            }

            if (rowSum > maxSum) {
                maxSum = rowSum; 
                maxRow = i + 1; 
            }
        }

        System.out.println("Row with the maximum sum: " + maxRow);
        System.out.println("Maximum sum: " + maxSum);
    }
}