package ex_16_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab154_Array_User_Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array(int) only");
        int size= sc.nextInt();
        int[] numbers_marks = new int[size];
        for(int i=0; i <numbers_marks.length ; i++)
        {
            System.out.println("Enter the marks");
            numbers_marks[i]=sc.nextInt();
        }
        System.out.println("---- Below code is printing the marks");
        for(int i=0; i < numbers_marks.length;i++)
        {
            System.out.println(numbers_marks[i]);
        }
        Arrays.sort(numbers_marks);
        for(int i=0; i<numbers_marks.length; i++){
            System.out.println(numbers_marks[i]);
        }

    }

}
