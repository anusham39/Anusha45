package ex_06_TernaryOperator;

public class Lab065_TO {
    public static void main(String[] args) {

        // minimum number using ternary operator
        int x = 20;
        int y = 30;
        // System.out.println(Math.max(x,y));
        int min = x < y ? x : y;
        System.out.println(min);
    }
}
