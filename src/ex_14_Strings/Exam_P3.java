package ex_14_Strings;

public class Exam_P3 {
    public static final int iterations = 1000;
    public static void main(String[] args) {
        // Write a program that demonstrates the performance difference between String concatenation,
        // StringBuilder, and StringBuffer for multiple string operations.
        long startTime = System.nanoTime();
        String str ="";
        for(int i=0; i< iterations; i++) {
            str += "HelloWorld welcome to java program";
        }
        long endTime = System.nanoTime();
        System.out.println("String : " +(endTime - startTime) / 1000000.00 +"ms");
        // StringBuilder performance
        startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i < iterations; i++) {
            stringBuilder.append("Helloworld welcome to java program");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder: " +(endTime - startTime)/1000000.00 +"ms");

        //StringBuffer performance
        startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer("");
        for(int i=0; i < iterations; i++) {
            stringBuffer.append("HelloWorld welcome to java program");
        }
        System.out.println("StringBuffer: "+(endTime - startTime) / 1000000.00 +"ms");

    }
}
