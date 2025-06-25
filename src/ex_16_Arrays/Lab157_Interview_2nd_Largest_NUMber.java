package ex_16_Arrays;

import java.util.Arrays;

public class Lab157_Interview_2nd_Largest_NUMber {
    public static void main(String[] args) {
        int[] numbers = { 12, 34, 10, 43, 56, 10};

        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length -2]);


    }
}
