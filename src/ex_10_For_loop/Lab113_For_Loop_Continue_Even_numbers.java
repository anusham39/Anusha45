package ex_10_For_loop;

public class Lab113_For_Loop_Continue_Even_numbers {
    public static void main(String[] args) {
        for( int i =0; i <= 50; i++){
            if(i % 2 == 0){
                // System.out.println("Even ->" +i);
                continue;
            }
            System.out.println("ODD -> " +i);
        }
    }
}
