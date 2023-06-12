package Logical_Questions;

public class Factorial_loop_recursive {
    static int  factorial_loop = 1, factorial_recursive = 1;
    public static void main(String[] args) {
        System.out.println("**************** Factorial****************");
        int number = 5;

        // Factorial using loop 
        for(int i = 1; i <= number; i++){
            factorial_loop *= i;
        }
        System.out.println("Using Loop: "+factorial_loop);

        // Factorial using recursion mwthod
        factoRecursion_1(number);
        System.out.println("Uning Recursion method 1: "+ factorial_recursive );
        System.out.println("Uning Recursion method 2: "+ factoRecursion_2(number) );
        System.out.println("Uning Recursion method 1: "+ factoRecursion_3(number) );
    }

    // method 1
    public static void factoRecursion_1(int n){
        if(n>=1){
            factorial_recursive *= n;
            factoRecursion_1(n-1);
        }
    }

    // method 2
    public static int factoRecursion_2(int n){
        if(n>1)
            return n * factoRecursion_2(n-1);
        return 1;   
    }

    // method 3
    public static int factoRecursion_3(int n){
        return (n>1)? n*factoRecursion_3(n-1):1 ;
    }




    
}
