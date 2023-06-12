package OOPs;

public class J01_Constructor1 {
	public static void main(String[] args) {
		No_cons obj1 = new No_cons(); 	// object creation 
		System.out.println("Default cons.\n"+"variable initilized by cons.: "+ obj1.var_n1+"\npre-initilized variable: "+obj1.var_n2);

		// user defined empty constructor
		User_empty_cons obj2 = new User_empty_cons();
		
		// user defined parameterized constructor
		Parameterized_cons obj3 = new Parameterized_cons(9);

		// constructor can be overloded	; (overloding: same name but different parameters)
		// bellow constructor are having same name but different parameters
		cons_overloded obj4 = new cons_overloded();
		cons_overloded obj5 = new cons_overloded("Anand");
		cons_overloded obj6 = new cons_overloded(101,"Anand");

		// another constructor examplle with the help of 'this' keyword
		cons_with_this obj7 = new cons_with_this();
	}
	

}


// # Constructor

// All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. However, then you are not able to set initial values for object attributes.


/*  -------- Properties 

	A constructor is a special method (block of code) which is used to create instances of a class.
	A constructor is also used to initialize the fields of a class
	A constructor's name must always be the same as the class name
	A constructor is a special method which does not have a return type.
	we usage of this to differentiate the identifiers with same names in different scopes.
	A constructor must be written inside the class body.

It is a good practice to provide the arguments in the same order as they are declared in the class, if they happen to be the fields of the class.
In a class if the name of the constructor is different from the name of the class, Java treats it as a different method.

*/

/* 
Java Program to illustrate constructor overloading
using same task (addition operation ) for different
types of arguments.

Note: Constructor overloading means creating same constructor with different arguments.

*/