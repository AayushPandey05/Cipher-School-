import java.util.*;

public class Question_24 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Size of Array: ");
        int size = scn.nextInt();

        int[] array = new int[size];
        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scn.nextInt();
        }
       
        int candidate = 0; 
        int count = 0; 

        for (int i = 0; i < size; i++) {
            if (count == 0) {
                candidate = array[i];
                count = 1;
            } 
            else if (array[i] == candidate) {
                count++;
            } 
            else {
                count--;
            }
        }

        count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == candidate) {
                count++;
            }
        }

        if (count > size / 2) {  //!...Boyer-Moore Voting Algorithm....
            System.out.println("The majority element is: " + candidate);
        } else {
            System.out.println("No majority element found.");
        }
    }
}