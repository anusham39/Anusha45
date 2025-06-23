package exam_Test236;

import java.util.Scanner;

public class Exam1_Test6 {
    public static void main(String[] args) {
        System.out.println("Enter an integer");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a > 0)
            System.out.println( a +"is positive");
        else if(a < 0)
            System.out.println(a + "is negative");
        else if(a == 0)
            System.out.println( a +"is zero");
        else
            System.out.println(a + "is not an integer");

    }
}
