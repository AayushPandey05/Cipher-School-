import java.util.*;

public class Question_22 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("S1: ");
        String s1 = scn.nextLine();

        System.out.print("S2: ");
        String s2 = scn.nextLine();

        //Converting string to char arraya

        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        Arrays.sort(s1Array); //inbuild class to sort the char array
        Arrays.sort(s2Array); //inbuild class to sort the char array

        if(Arrays.equals(s1Array, s2Array)){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}