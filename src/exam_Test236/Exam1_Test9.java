package exam_Test236;

import java.util.Scanner;

        /*
        Write a program to create a simple calculator using switch statement. **Requirements:** - Read two numbers
        and an operator (+, -, *, /) - Use switch statement to perform the operation - Handle division by zero -
        Display the result

         */
public class Exam1_Test9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st number" );
        float a =scanner.nextFloat();
        System.out.println("Enter the 1st number" );
        float b= scanner.nextFloat();
        System.out.println("select any operator +,/,*,-,%");
        char ch= scanner.next().charAt(0);
        switch(ch){
            case '+':
                System.out.println("REsult "+ (a+b));
                break;
            case '/':
                System.out.println("Divison by zero :" +(a/b));
            case '%':
                System.out.println("Invalid operator");
                break;
        }

    }
}
