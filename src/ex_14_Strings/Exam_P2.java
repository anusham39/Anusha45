package ex_14_Strings;

public class Exam_P2 {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "hello";
        String string3 = "Hello";
        System.out.println("equals() : " + string1.equals(string2));
        System.out.println("equalsIgnoreCase(): " +string1.equalsIgnoreCase(string2));
        System.out.println("compareTo(): "+string1.compareTo(string2));

    }
}
