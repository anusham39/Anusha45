package ex_02_Java_Basics;

public class Lab024_printF {
    public static void main(String[] args) {
        int a = 10;
        System.out.print("print command print without the new line");
        System.out.println("Hello world");
        System.out.println("This is add in new line");

        System.out.println(a);
        System.out.printf("your variable name is %d",a);

        //when we are using %d, %s... we have to use printf only not println
        // %d -> int,byte,long,short, - data type
        // %s -> string
        // %f -> float,double
        // %b -> boolean
         int b = 20;
        System.out.println("-----------");
        System.out.printf("%d + %d",a,b);
    }
}
