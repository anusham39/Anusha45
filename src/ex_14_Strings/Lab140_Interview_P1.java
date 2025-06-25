package ex_14_Strings;

public class Lab140_Interview_P1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hello";
        // scp - string constant pool - there are only 1 string available in string constant pool, immutable

        String s4 = new String("Hello");
        String s5 = new String("Hello");
        String s6 = new String("Hello");

        // Object area - there 3 strings available in object area, mutable
    }
}
