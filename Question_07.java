import java.util.*;

public class Question_07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        String s1 = scn.nextLine();

        System.out.print("Enter String 2: ");
        String s2 = scn.nextLine(); 

        if(s1.length() != s2.length()) {
            System.out.println("False");
        }

        else{
            String con = s1 + s2;

            if(con.contains(s2)){ //!..To check whether con containg string s2 or not, if contain then true else false..
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }

    }
}