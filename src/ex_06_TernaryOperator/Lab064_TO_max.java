package ex_06_TernaryOperator;

public class Lab064_TO_max {
    public static void main(String[] args) {
        // maximum number using ternary operator
        int x = 20;
        int y = 30;
        // System.out.println(Math.max(x,y));
        int max = x > y ? x : y;
        System.out.println(max);
    }
}
