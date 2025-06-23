package exam_Test236;

import java.util.Scanner;

public class Exam1_Test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1 to 7");
        int a = scanner.nextInt();
        switch(a){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            default :
                System.out.println("Invalid day number");
                break;
        }
    }
}
