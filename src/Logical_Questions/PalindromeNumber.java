package Logical_Questions;

// same from both side. Ex. 121 , 323, 23432

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 12321;
        int temp = num;
        int rev = 0;
        while(temp != 0){
            rev = (rev*10) + temp%10;
            temp = temp/10;
        }
        if(num == rev) System.out.println("Yes it is a Palindrome");
        else System.out.println("No it is not a Palindrome");
    }
}
