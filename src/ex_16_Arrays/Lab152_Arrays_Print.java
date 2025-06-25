package ex_16_Arrays;

import java.util.Arrays;

public class Lab152_Arrays_Print {
    public static void main(String[] args) {
        int[] marks = { 51, 65,67, 87, 23, 675};
        System.out.println(marks.length);
        System.out.println(".......");
        for(int i=0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
        System.out.println("------");

        Arrays.sort(marks);
        for(int i = 0; i<marks.length; i++)
        {
            System.out.println(marks[i]);
        }
    }
}
