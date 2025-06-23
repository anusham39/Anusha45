package exam_Test236;

public class Exam1_Test5 {
    public static void main(String[] args) {
        int a = 10;
        float b = 3.5f;
        float c = a+b;
        int d = a + (int)b;
        int e = (a*2)+(int)b;
        System.out.println("Expression result :" +e);
        System.out.println("Implicit casting : " +c);
        System.out.println("explicit casting : " +d);
    }
}
