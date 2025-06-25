package ex_08_If_Condition;

import java.util.Scanner;

public class Lab082_If_else {
    public static void main(String[] args) {
        //int age = Integer.parseInt(args[0]);

        System.out.println("enter the age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age < 18)
            System.out.println("Not allowed for vote");
        else
            System.out.println("Allowed for vote");

    }
}
