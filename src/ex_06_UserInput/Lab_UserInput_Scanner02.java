package ex_06_UserInput;

import java.util.Scanner;

public class Lab_UserInput_Scanner02 {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        System.out.println(s);

        System.out.println("Enter integer");
        int int_input = scanner.nextInt();

        System.out.println("Enter the double");
        double double_input = scanner.nextDouble();
    }
}
