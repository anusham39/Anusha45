package ex_14_Strings;

import java.util.Scanner;

public class InterviewCoding {
    public static void main(String[] args) {
        // string is a palindrome or not
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String s1 = scanner.next();
        String s1_reverse = "";
        for(int i= s1.length() -1; i >= 0; i--)
        {

            s1_reverse = s1_reverse + s1.charAt(i);
        }
        if(s1.equals(s1_reverse))
            System.out.println(s1 + " is a palindrome");
        else
            System.out.println(s1 +" is not a palindrome");
    }
}
