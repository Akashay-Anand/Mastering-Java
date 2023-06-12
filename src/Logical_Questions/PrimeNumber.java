package Logical_Questions;

// check wether the number is prime number or not.
/*
 * Prime number: prime number has exactly two distinct factors, 1 and itself, or that a prime is a whole number greater than 1 that is only divisible by 1 and itself
 */

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 31;
        boolean flag = false;

// code to check
        for(int i =2;i<number/2;i++) // No need of '{}' becouse single block is there bellow
            if(number%i == 0) {
                flag = true;
                break;
            }
        if(flag) System.out.println(number + " is not a prime number");
        else System.out.println("Given number "+ number +" is prime number");

// Print all prime number between 1 - 100;
        for(int i = 2; i<=100; i++){
            flag = true;

            for(int j = 2;j<= i/2; j++){
                if(i%j == 0) {
                    flag = false;
                    break;
                }
            }
            
            if(flag) System.out.println(i);
        }

    }
    
}
