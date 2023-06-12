package Logical_Questions;

//  Swap 2 number with or without using 3rd veriable.

public class SwapNumber {

    public static void main(String[] args) {
        
        int a = 10, b = 20;
        with_3rd_veriable(a, b);
        without_3rd_variable(a, b);

    }
    public static void with_3rd_veriable(int a, int b){
        int temp;

        // swap
        temp = a;
        a = b;
        b = temp;
        System.out.println("\nWith 3rd veriable > "+"a: " + a + " b: " + b);
    }

    public static void without_3rd_variable(int a, int b){
        // swap
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Without 3rd veriable > "+"a: " + a + " b: " + b +"\n");

    }
    
}
