package DataType;

// Note how an int data type can be assigned values from binary, octal and hex and character literals.

public class Integeral {
    public static void main(String[] args) {
        int decimalOne = 1;
		System.out.println("decimalOne = " + decimalOne);
		Integer binaryThree = 0b11;     // '0b' represents binary number
		System.out.println("binaryThree = " + binaryThree);
		
        long octalEight = 010;       //  '0' at the starting treated aa octal number
		System.out.println("octalEight = " + octalEight);
		Long hexTen = (long) 0xA;       //  '0x' represent hex/hexadecimal number // type casting required
		System.out.println("hexTen = " + hexTen);
        
        //In case the value happens to be a char literal, their Unicode value is assigned.
		short unicodeValueOfOne = '1';
		System.out.println("unicodeValueOfOne = " + unicodeValueOfOne);
		Short unicodeValueOfA = 'A'; // why type casting is not required
		System.out.println("unicodeValueOfA = " + unicodeValueOfA);
		Byte unicodeValueOfZ = 'Z';
		System.out.println("unicodeValueOfZ = " + unicodeValueOfZ);
        
        // Note: The initial 256 characters of the ASCII character set are the same in Unicode character set.
        Long x = 4l;
        System.out.println("Long = "+x);
    
    }
}

// @ Integer
/* 
# The primitive type int has a corresponding wrapper class called Integer. Both int and Integer can be used interchangeably
------
int num1 = 3;   
Integer num2 = 4; // note: don't use it for character literal ( type miss match error may accures)
------

# Integer wrapper class provides constant and method that are use full while working with int. 
> Methods
• Integer.parseInt(String s, int radix);  // used to convert a string value representing a binary, octal, hex or a decimal integer within the valid range of a Integer
    ex-----
    int x = Integer.parseInt("B", 16);  //parses the string literal "B" using base-16 and returns decimal 11 as a int
    int y = Integer.parseInt("747");    //parses the string literal "747" using base-10 and returns decimal 747 as an int//Note that we need not pass the radix when we want to convert to decimal (or base-10)
    ------
• Integer.MAX_VALUE
• Integer.MIN_VALUE

*/

// @ Long / short / byte
/*
    type casting may required
    Similar to Integer...
*/





/*
Q) why Integer class is giving type missmatch error for character literal but int works?

*/