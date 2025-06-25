package ex_10_For_loop;

public class Lab112_For_Loop_Continue {
    public static void main(String[] args) {
        for(int i =0; i < 50; i++)  // 0 to 49 ,  50 times
        {

            if(i == 5)
                continue;
            System.out.println(i);

        }
    }
}
