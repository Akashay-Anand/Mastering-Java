package DataType;

public class Basic {
    public static void main(String[] args){
        System.out.println("hello");
        String s1 = "123";
        System.out.println(Integer.valueOf(s1));
        System.out.println(Integer.parseInt(s1));
    }    
}

/**
 * These data types can be grouped as Primitive and Composite (or Reference Type).
 * 
 * As their names suggest, primitives form the primary building blocks(these usually have built-in support in the language) and composites are usually made up of one or more primitive type.
 * 
 * Java is a statically typed language, which means that the type imposes some constraints on the value it can hold and the operations that can be performed, and this is verified by the compiler during the compilation. 
 */ 

 /*
In Java, there are different numeric data types to represent whole numbers(integral) and fractions(floating-point) of different sizes (magnitudes).

	Integral type: signed two's-complement
•	byte: 8 bit (1 byte)
•	short: 16 bits (2 byte) 
•	int: 32 bits (4 byte)	-2,147,483,648 (-231) and +2,147,483,647 (231-1).
•	long: 64 bits (8 byte) 

	Floating-point
•	float: 32 bit(4 byte)  IEEE 754 floating-point numbers, 
•	double: 64 bit(8 byte) IEEE 754 floating-point numbers.

	Char: 16-bit unsigned integers representing UTF-16 code units (#3.1).
	boolean: 
 */

 // @ Number Literals
/* 

# Java version 7 has added a new feature to improve the readability of Numeric Literals.
# We can include an underscore ('_') in numeric literals to show grouping of digits.
For example: long mySalary = 900_000L;// Which is equal to 900000 (Nine Hundred Thousand)
long magicNumberInHex = 0xCAFE_BABE; // Want to know more about Magic Number?

Note: Underscore is only for programmer's readability, it is completely ignored during computations.

Usage rules for underscore:
• Underscore can only be used between two digits.
• Underscore cannot be used at the beginning or ending of a number.
• Underscore cannot be used before a suffix like F (used in float), L (used in Long) or D (used in Double).
• Underscore cannot be used before or between a radix prefix used for binary or octal or hex numbers

*/

 // Local variables are never assigned default value by compiler