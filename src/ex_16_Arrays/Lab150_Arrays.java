package ex_16_Arrays;

public class Lab150_Arrays {
    public static void main(String[] args) {
        int[] marks = {1, 2,3,4,5,6};

        //2nd way to create array
        //2nd way is fixed size
        int[] marks2 = new int[3];    // Fixed size , 3, index - 0 -2
        String[] names = new String[3];
        names[0] = "Anusha";
        names[1] = "Yashi";
        names[2] = "Anil";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
    }
}
