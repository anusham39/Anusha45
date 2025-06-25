package ex_13_Functions;

public class Lab132_UD_part1 {

    //User Defined Functions

    //1. without parameters and without return type
    //2. without parameters and with return type
    //3. with parameters and without return type
    //4. with parameters and with return type

    public static void main(String[] args) {

        //1. without parameters and without return type
        wp_wr_greet();

        //2. without parameters and with return type
        String msg = greet_with_hello_wp_with_RT();
        System.out.println(msg);

        //3. with parameters and without return type
        greet_with_details("anusha", 34, 50000);
        greet_with_details("anil", 43, 5000);

        //4. with parameters and with return type
        int sum = sum_of_two_numbers(30,40,60);
        int sum2 = sum_of_two_numbers(23,56,66);
        int sum4 = sum_of_two_numbers(34,46,35);
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum4);
    }
    //1. without parameters and without return type
    static void wp_wr_greet(){
        System.out.println("Hi, how are you");
    }

    //2. without parameters and with return type
    static String greet_with_hello_wp_with_RT(){
        System.out.println();
        System.out.println("wp_with_RT");
        return "Hi, How are you";
    }

    //3. with parameters and without return type
    static void greet_with_details(String name,int age, double salary){
        System.out.println("your name is ->" +name + "\n your age is ->" + age + "\n your salary is ->" +salary);
    }

    //4. with parameters and with return type
    static int sum_of_two_numbers(int a, int b, int c){
        return a+b+c;
    }
}
