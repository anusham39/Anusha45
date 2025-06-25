package ex_05_TypeCasting;

public class Lab061_TypeCasting {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        // int total = course + GST;
        int total = course + (int)GST;   // data loss
        System.out.println(total);


        float total2 = course + GST;   // widening - auto - implicit
        float total3 = (float)course + GST;  //widening  - Explicit
        System.out.println(total2);
        System.out.println(total3);
    }
}
