package ex_14_Strings;

public class Lab141_String_Interview_P2 {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s4 = "Hello";

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("Hello");

        // == -> comparison -> string -> this check the locations ref
        System.out.println( s1 == s3);
        System.out.println( s1== s2 );
        System.out.println( s2 == s3);
        System.out.println( s1 == s4);

        // equals (content) -> value
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s5));

        //equalsIgnoreCase -> ignore upper and lower case
        // == check for the referance
        // = assignment the value

        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
