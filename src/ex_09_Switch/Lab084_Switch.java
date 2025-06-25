package ex_09_Switch;

import java.util.Scanner;

public class Lab084_Switch {
    public static void main(String[] args) {

        // Take a user input and tell them the day which they have told
        // 1 to 7 -> 1 mon, 5 -> fri
        // 8? - Not allowed or error
        // if we write sitch statements without break, it will execute all the statements

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7");
        int day = scanner.nextInt();
        switch(day)
        {
            case 1:
                System.out.println("Mon");

            case 2:
                System.out.println("Tue");

            case 3:
                System.out.println("Wed");

            case 4:
                System.out.println("Thu");

            case 5:
                System.out.println("Fri");

            case 6:
                System.out.println("Sat");

            case 7:
                System.out.println("Sun");

            default:
                System.out.println("Not allowed");

        }
    }
}
