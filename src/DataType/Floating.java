package DataType;

import java.math.BigDecimal;
import java.math.MathContext;
// import java.math.RoundingMode;

public class Floating {
    public static void main(String[] args) {
        // float
        float x = Float.POSITIVE_INFINITY;
        Float y = Float.NaN;
        float z = Float.parseFloat("4.5");
        System.out.println(x + " and "+y);
        System.out.println(z);
        // double
        double d1 = 0.2;
        Double d2 = 0.1;
        double d3 = Double.parseDouble("3.45d");
        System.out.println("Sum = " + (d1 + d2)); // its output looks weird right, that's why we have BigDecimal to handle this type of precise number.
        System.out.println("d1 = "+d1+", "+"d2 = "+d2+", "+"d3 = "+d3);
        
        // BigDecimal
        BigDecimal bd1 = new BigDecimal("3.0000000000000001");
        System.out.println(bd1);

        MathContext mc = new MathContext(3);
        BigDecimal bd2 = new BigDecimal("3.14159265358", mc);
        System.out.println(bd2);

        // NaN
        double dn = 0d / 0d;
		System.out.println("x == Double.NaN : " + (dn == Double.NaN));
		System.out.println("Double.isNaN(x) : " + Double.isNaN(dn));


    }
}

//@ Float
/*
In Java, the float data type denotes a 32-bit single-precision 32-bit IEEE 754 floating point number. In Java, a float can represent
 both positive and negative numbers
 positive infinity (Float.POSITIVE_INFINITY) and negative infinity (Float.NEGATIVE_INFINITY)
 NaN (a special Not-a-Number value, i.e. mathematically undefinable number).
A NaN value is used to represent the result of invalid operations such as dividing zero by zero, or square root of a negative number. Its value is represented by a constant in Float class (Float.NaN) etc.

# The primitive type float has a corresponding wrapper class called Float. Both float and Float can be used interchangeably. Which means, we can say:
ex------
float num1 = 3.0f;
Float num2 = 4.2f;
Float total = num1 + num2;
-------
> Method ( float wrapper class have verious method)
• Float.parseFloat();
• Float.POSITIVE_INFINITY
• FLOAT.NEGATIVE_INFINITY
...
*/

// @ Double
/*
double is more commonly used than a float in calculations like sine, cos, tan etc... Like in float a double can represent
 both positive and negative numbers
 positive infinity (Double.POSITIVE_INFINITY) and negative infinity (Double.NEGATIVE_INFINITY)
 NaN (a special Not-a-Number value, i.e. mathematically undefinable number).
A NaN value is used to represent the result of invalid operations such as dividing zero by zero, or square root of a negative number. Its value is represented by a constant in Float class (Double.NaN) etc.

The 64 bits of a double are divided into three parts.
   - 1 Sign bit is used to mark the sign of the number.
   - 11 bits are used to determine the value of the exponent.
   - remaining 52 bits are used to determine the mantissa (significand)

# The primitive type double has a corresponding wrapper class called Double. Both double and Double can be used interchangeably. Which means, we can say:
ex----
double num1 = 3.4d;
Double num2 = 1.2d;
Double total = num1 + num2;
------
 */

 // @ BigDecimal
 /* 
Java provides a class called BigDecimal for representing and computing decimal numbers with any required precision.

BigDecimal is not a wrapper class of any primitive data type. It is a convenience class for handling large decimal numbers with arbitrary precision. The value to be represented by BigDecimal should be passed to one of the BigDecimal constructors.

 */

 // NaN
/*
# The Float.NaN and Double.NaN refer to a result that is not a number.
For example we get a NaN (not a number result) when dividing zero by zero or when we try to calculate the square root of a negative number

While coding in Java, to verify if the result of an expression is not a number, we should never compare the result (using == operator) to either Float.NaN or Double.NaN.
The correct way of verifying if the value is not a number is to use the method Float.isNaN() or Double.isNaN().
 */

// nul

/* 
A reference having a null value indicates that it is not pointing to a valid object.
In Java code, when an attempt is made to access a member (like field or method using the dot ) of a null reference, NullPointerException is thrown.

*/