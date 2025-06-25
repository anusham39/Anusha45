package ex_15_StringBuffer_Builder_StringFunctions;

import java.util.Scanner;

public class SBuffer_Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String input = scanner.next();
        String newString_reversed = reverse_string(input);
        if(input.equalsIgnoreCase(newString_reversed))
        {
            System.out.println("Palindrome");
        }else {
            System.out.println("not a palindrome");
        }
    }

    static String reverseString(String userInput)
    {
        String reverse_string = "";
        for(int i = userInput.length()-1; i>=0; i--){
            reverse_string = reverse_string + userInput.charAt(i);

        }
        return reverse_string;
    }

    static String reverse_string(String userinput) {
        StringBuilder stringBuilder = new StringBuilder(userinput);
        return stringBuilder.reverse().toString();
    }
}
