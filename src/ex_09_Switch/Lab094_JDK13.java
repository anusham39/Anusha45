package ex_09_Switch;

public class Lab094_JDK13 {
    public static void main(String[] args) {
        // multiple match with , seperated
        int itemcode = 006;
        switch(itemcode){
            case 001,002,005:
                System.out.println("all of them are electronic gadgets");
                System.out.println("this is multiple case");
                break;
            case 004,006,003:
                System.out.println("This is mech gadgets");
                break;
            default:
                System.out.println("None");
        }
    }
}
