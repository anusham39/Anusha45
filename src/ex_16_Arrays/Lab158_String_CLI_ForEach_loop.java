package ex_16_Arrays;

public class Lab158_String_CLI_ForEach_loop {
    public static void main(String[] anusha) {
        for(int i=0; i< anusha.length; i++)
        {
            System.out.println(anusha[i]);
        }
        System.out.println("--------");
        for(Object o: anusha){
            System.out.println(o);
        }
        System.out.println("-------");
        for(String arg: anusha){
            System.out.println(arg);
        }
    }
}
