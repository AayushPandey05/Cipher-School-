import java.util.Scanner;

public class Question_13 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        int i = 0;
        int j = str.length() - 1;

        boolean isPalindrome = true;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (isPalindrome) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}