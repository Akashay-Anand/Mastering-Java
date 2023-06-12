package Logical_Questions;

// Fibonacci Series: series of number where every number is the summ of previous two number.
// Ex: 0 1 1 2 3 5 8 13 21 ...

public class FibonacciSeries {
    static int a = 0, b = 1; 
    static int num = 0;
    public static void main(String[] args) {

        System.out.print(a+" "+b); 
        for(int i = 0; i < 10 ; i++){
            num = a+b;
            a= b;
            b = num;
            System.out.print(" "+num);
        }
        System.out.println();

        // through recourtion
        a = 0; b = 1;
        System.out.print(a+" "+b); 
        Fibo(10);
    
    }

    static void Fibo(int n){
        if(n>=1){
            num = a+b;
            a=b;
            b=num;
            System.out.print(" "+num);
            Fibo(n-1);
        }
    }

}
