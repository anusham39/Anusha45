package exam_Test236;

public class Exam1_Test4 {
    public static void main(String[] args) {
        int i = 5;
        System.out.println("Original: " +i);
        int a = ++i;
        System.out.println("per-increment : " +a);
        int b = i++;
        System.out.println("post-increment : "+b + "(returned 6)");
        int c = --i;
        System.out.println("Pre decrement: " +c);
        int d= i--;
        System.out.println("post - decrement: "+d + "(returned 5)");
    }
}
