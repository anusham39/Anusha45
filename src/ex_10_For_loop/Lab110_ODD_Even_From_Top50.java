package ex_10_For_loop;

public class Lab110_ODD_Even_From_Top50 {
    public static void main(String[] args) {
        // Find the even numbers from 1 to 50
        for( int i = 1; i<=50 ; i++){
            if(i % 2 == 0)
                System.out.println("Even ->" +i);

        }
    }
}
