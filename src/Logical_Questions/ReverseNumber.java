package Logical_Questions;

// Reverse the given number. Ex: 123 -> 321, 342 -> 243. 

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 254, rev = 0;
        
        while(number != 0){
            rev = (rev*10) + (number%10);
            number = number/10;
        }
        System.out.println("Reverse of given number is: "+rev);
    }
}
