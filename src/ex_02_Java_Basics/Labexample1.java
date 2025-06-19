package ex_02_Java_Basics;

public class Labexample1 {
    //
     // int i;
    // static int s;
    // these are instance variables, these have default values
    // local variables don't have default values
    public static void main(String[] args) {
        int a = 10;
        {
            int b = 10;
            System.out.println(b);
        }
        int b = 90;
        System.out.println(b);

    }
}
