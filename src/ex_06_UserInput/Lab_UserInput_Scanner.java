package ex_06_UserInput;

import java.util.Scanner;

public class Lab_UserInput_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");

        int age = scanner.nextInt();
        String canIvote = age>=18 ? "yes" : "No";
        System.out.println(canIvote);
    }
}
