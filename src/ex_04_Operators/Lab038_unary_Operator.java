package ex_04_Operators;

public class Lab038_unary_Operator {
    public static void main(String[] args) {
        //Unary operator
        int a = +10; // here + is optional
        int a1 = -110;
        int result = a+a1;
        System.out.println(a);
        System.out.println(a1);
        System.out.println(result);

        int b = -1;
        b = b+1;
        System.out.println(b);
    }
}
