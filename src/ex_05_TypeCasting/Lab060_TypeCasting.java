package ex_05_TypeCasting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {
        // phone
        long phn = 823842823;
       // short s = phn;   //Implicit narrow
        short s = (short)phn;   //Explicit narrow

    }
}
