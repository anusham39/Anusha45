package exam_Test236;

import java.util.Scanner;

public class Exam1_Test9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        float a =scanner.nextFloat();
        float b= scanner.nextFloat();
        System.out.println("select any operator +,/,*,-,%");
        char ch= scanner.next().toLowerCase();
        switch(ch){
            case +:
                System.out.println("REsult "+ (a+b));
                break;
            case /:
                System.out.println("Divison by zero :" +(a/b));
            case %:
                System.out.println("Invalid operator");
                break;
        }

    }
}
