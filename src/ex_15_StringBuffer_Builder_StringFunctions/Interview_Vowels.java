package ex_15_StringBuffer_Builder_StringFunctions;

import java.util.Scanner;

public class Interview_Vowels {
    public static void main(String[] args) {
        // java program to count vowels and consonants
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input");
        String str = scanner.nextLine().toLowerCase();

        int vowels =0;
        int consonants = 0;
        for(int i=0; i < str.length(); i++)
        {
            char ch= str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                vowels++;
            }
            else
                consonants++;
        }
        System.out.println("nunber of vowels " +vowels);
        System.out.println("number of consonants: "+consonants);
    }
}
