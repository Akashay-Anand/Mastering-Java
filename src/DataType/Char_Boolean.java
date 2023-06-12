package DataType;

public class Char_Boolean {
    public static void main(String[] args) {
        
        // Character

        char ch1 = 'A';
        char ch2 = '2';
        char ch3 = '*';
		char ch4 = '\t';
		char ch5 = '\n';
		char ch6 = '\b';
		char ch7 = ' ';
        System.out.println("ch1 is a character: " + Character.isLetter(ch1));
		System.out.println("ch2 is a character: " + Character.isLetter(ch2));
		System.out.println("ch2 is a digit: " + Character.isDigit(ch2));
		System.out.println("ch1 is a letter or digit: " + Character.isLetterOrDigit(ch1));
		System.out.println("ch3 is a letter or digit: " + Character.isLetterOrDigit(ch3));
        System.out.println("   ");
		System.out.println("ch1 is an uppercase char: " + Character.isUpperCase(ch1));
		System.out.println("ch1 is a lowercase char: " + Character.isLowerCase(ch1));
		System.out.println("ch2 is a lowercase char: " + Character.isLowerCase(ch2));
		System.out.println("ch2 to uppercase: " + Character.toUpperCase(ch2));
		System.out.println("ch1 to lowercase: " + Character.toLowerCase(ch1));
		System.out.println("ch3 is a letter or digit: " + Character.isLetterOrDigit(ch3));
		System.out.println("ch3 is a whitespace char: " + Character.isWhitespace(ch3));
		System.out.println("ch4 (tab char) is a whitespace char: " + Character.isWhitespace(ch4));
		System.out.println("ch5 (newline char) is a whitespace char: " + Character.isWhitespace(ch5));
		System.out.println("ch6 (backspace char) is a whitespace char: " + Character.isWhitespace(ch6));
		System.out.println("ch7 (space char) is a whitespace char: " + Character.isWhitespace(ch7));
    }
}

// @ Boolean
/* 
In Java, the boolean data type denotes a logical quantity with two possible values, indicated by the literals true or false.
The primitive type boolean has a corresponding wrapper class called Boolean. Both booleanBoolean can be used interchangeably. Which means, we can say:
Boolean isHot = true;
boolean isSnowing = false;
boolean isSummer = isHot && (!isSnowing);

The Boolean class wraps a primitive boolean value.
This class provides constants and methods that are useful while working with booleans. For example it has a method Boolean.parseBoolean(String s) which can be used to convert a string value representing one of the two logical states of being true or false into their corresponding boolean value
boolean x = Boolean.parseBoolean("true");
boolean y = Boolean.parseBoolean("false");

*/

// @ Character
/*
In Java, the primitive char type has a wrapper class called Character, which provide useful methods to work with characters.

isLetter()
isDigit()
isLetterOrDigit()
isUpperCase()
isLowerCase()
toUpperCase()
toLowerCase()
isWhitespace()

*/




