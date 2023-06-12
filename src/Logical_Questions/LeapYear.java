package Logical_Questions;

import java.util.Scanner;

// Program to check wether the year is leap year or not.

public class LeapYear {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        input.close();

        if(year%400 == 0){ System.out.println("Yes, it is a Leap year"); }
        else if(year%4==0 && year%100 != 0){ System.out.println("Yes, it is a Leap year"); }
        else { System.out.println(" Not a Leap year"); }
        
    }
    
}

// Condition for leap year

/*
 * 1. either divisible by 400.
 * 2. or divisible by 4 but not divisible by 100.
 * 
 * 
 */