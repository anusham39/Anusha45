package ex_16_Arrays;

import java.util.Arrays;

public class Lab153_Arrays_Max_min {
    public static void main(String[] args) {
        int[] array = { 25, 56, 35, 37, 76, 87, 32, 89};

      //  Arrays.sort(array);
      //  System.out.println(array[array.length-1]);
        // in interciews it will not used
        int max_output = give_max_num(array);
        int min_output = give_min(array);
        System.out.println(min_output);
        System.out.println(max_output);

    }
    static int give_max_num(int[] array)
    {
        int max = array[0];
        for(int i =0; i < array.length; i++){
            if(array[i]> max)
                max = array[i];
        }



        return max;
    }

    static int give_min(int[] array)
    {
        int min=array[0];
        for(int i=0; i < array.length; i++)
        {
            if(array[i] < min)
                min = array[i];
        }

        return min;
    }
}
