//!..To find the longest word in the sentence..
import java.util.*;
public class Question_06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Input: ");
        String str = scn.nextLine();

        String[] sentence = str.split("\\s+");  // Split the sentence into words

        String longest = "";
        int maxLength = 0;

        for(int i = 0; i < sentence.length; i++) {
            if(sentence[i].length() > maxLength) {
                longest = sentence[i];
                maxLength = sentence[i].length();
            }
        }

        System.out.println("Output: " + longest);
    }
}