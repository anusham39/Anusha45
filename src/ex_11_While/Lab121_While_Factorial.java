package ex_11_While;

import java.util.Scanner;

public class Lab121_While_Factorial {
    public static void main(String[] args) {
        // Factorial program
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the factorial program \n Enter the number!");
        if(!scanner.hasNextInt()){
            System.out.println("Enter a integer");
            return;
        }
        int num = scanner.nextInt();

        int factorial = 1;
        if(num <= 0)
        {
            System.out.println(factorial);
        }
        else{
            for(int i = 1; i <= num ; i++)
            {
                factorial = factorial * i;
            }
        }
        System.out.println("Factorial is -> " + factorial
        );
    }
}
