package ex_06_TernaryOperator;

public class Lab068_TO_Three_Max {
    public static void main(String[] args) {
        //Find the maximum between the three numbers
        // logic building formula
        int x = 30;
        int y = 20;
        int z = 40;

        //Step 1: Find inouts / outputs
        //I/O -> x,y,z int
        // o/p -> string -> max number

        //Step 2: rough logic, think about it
        // x>y and x>z -> x
        // y>z and y>z -> y
        // z

        //step 3
        int max = (x>y) ? (x>z) ? x : z : (y > z) ? y : z;
        System.out.println(max);
    }
}
