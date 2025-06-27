package ex_15_StringBuffer_Builder_StringFunctions;

public class Exam_P1 {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = s1.concat(" World");
        System.out.println("Length: " +s2.length());
        System.out.println("First char: " +s2.charAt(0));
        System.out.println("substring: " +s2.substring(6,11));
    }
}
