package ex_13_Functions;

import jdk.jshell.Snippet;

import java.util.Scanner;

public class Lab134_Function_Arth {
    public static void main(String[] args) {
        // create a function of sub, sum, mul, and div
        // with parameter a,b (take the parameter from the user)

        //logic building
        // step 1 -> Inputs and outputs
        // a,b - int -> scanner
        // int -> variable result ->

        // step2 - Rough logic -> create functions
        //function -> type 4th - with return and with arguments /parameters

        // step 3 - write the code and find and fix -> Edge cases

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num 1");
        int a =0;
        if(scanner.hasNextInt()){
            a = scanner.nextInt();
        }else{
            System.out.println("Enter the int only");
            return;
            //System.out.println(status:0);
        }
        int c = scanner.nextInt();

        System.out.println("Enter the num 2");
        int b = scanner.nextInt();

        int result_sum = sum(a,b);
        System.out.println(result_sum);

        int result_sub=sub(a,b);
        System.out.println(result_sub);

        int result_div=div(a,b);
        System.out.println(result_div);

        int result_mul=mul(a,b);
        System.out.println(result_mul);

    }

    static int sum(int a, int b){
        return a+b;
    }
    static int sub(int a, int b){
        return a-b;
    }
    static int div(int a, int b){
        if(b == 0)
        {
            throw new ArithmeticException("B can't be Zero");
        }
        return a/b;
    }
    static int mul(int a, int b){
        return a*b;
    }
}
