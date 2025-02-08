import java.util.Scanner;

public class Question_19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter size of Array: ");
        int n = scn.nextInt();

        System.out.print("Enter Array Elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int largest = arr[0];  //initialize zero index element as largest 
        int secondLargest = arr[1];  //initialize first index element as Secondlargest 

        for (int i = 2; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
            } 
        }

        if(secondLargest == arr[1] && largest == arr[0]){
            System.out.println("second largest element cannot be determined.");
        }
        else{
            System.out.println("Second largest element: " + secondLargest);
        }

    }

}