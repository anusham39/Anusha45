package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab147_SBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append("world");
        System.out.println(stringBuilder.reverse());
    }
}
