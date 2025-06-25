package ex_14_Strings;

public class Lab142_String_Functions {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("hello");
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
    }
}
