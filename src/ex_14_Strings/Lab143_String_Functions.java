package ex_14_Strings;

public class Lab143_String_Functions {
    public static void main(String[] args) {
        String name = "yashi";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(4));
        //System.out.println(name.charAt(9));

        //concat
        System.out.println(name.concat(" yelder child"));

        //contains()
        System.out.println(name.contains("ash"));

        // equals()
        System.out.println(name.equals("YASHI"));

        //equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("YASHI"));

        //indexOf()
        System.out.println(name.indexOf('h'));

        String s1 = "madam";
        System.out.println(s1.indexOf("m"));
        System.out.println(name.lastIndexOf("a"));

        //length()
        System.out.println(s1.length());

        //replace()
        System.out.println(name.replace("yas","YAs"));

        //split()
        String name4 = "Pramod@live.com@123";
        String[] split_name4 = name4.split("@");
        System.out.println(split_name4[0]);
        System.out.println(split_name4[1]);
        System.out.println(split_name4[2]);

        // 10. substring()
        System.out.println(name.substring(1,3));

        // 11. toLowerCase()
        System.out.println("AnUShA".toLowerCase());

        //12 . toUpperCase()
        System.out.println("sonal".toUpperCase());

        //14. startsWith()
        System.out.println(name.startsWith("y"));

        //15. endsWith()
        System.out.println(name.endsWith("K"));

        //16. concatenation( By )

        String s111 = "Hello";
        String s222 = "world";

        String s333 = "j1";
        String result = s111 + s222 + s333;
        System.out.println(result);
    }
}
