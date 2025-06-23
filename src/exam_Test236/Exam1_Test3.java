package exam_Test236;

public class Exam1_Test3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        if(a != b)
        {
            System.out.println(" a==b :"+(a == b));
            System.out.println(" a > b :" +(a > b));
            System.out.println(" a > b :" +(a < b));
            System.out.println(" (a > b) && (a>0)" +((a > b) && (a>0)));
            System.out.println(" (a < b) || (a > 0)" +((a < b) || (a > 0)));
            System.out.println(" !(a > b)" +!(a > b));
        }
    }
}
