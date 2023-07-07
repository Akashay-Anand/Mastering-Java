package OOPs;

// Class-based programming starts with classes, which become the blueprints for objects. 


//Q But what does this really mean?
//// So, to start, we need to understand what objects are.
/*
 * This concept is inspired from real world objects 
 * i.e: keyboard, microphone, wall, door, phone, etc.
 * So, Real world objects have two major components 
 *  > State (characterstics that can describe it);
 *  > Behavior
 *  ex: State: keyboard has some length & width; also have some specific number of keys 
 *  ex: Behavior: keyboard can pass data to cpu on key press;
 * 
 * Hence, modelling real world objects as software objects, is a fundamental part of Object Oriented Programming.

 * > software object stores its 'state' in fields, which can also be called variables, or attributes.
 * > And Objects expose their 'behavior' with methods.
 */

// Well, think of a class as a template, or a blueprint for creating objects.

public class A01_Class {
    public static void main(String[] args) {
        System.out.println("Hello anand, I am a class");
    }
}

// More on Class ;
/*
 *  > Classes can be organized into logical groupings, which are called packages. 
    > You declare a package name in the class using the package statement.
    > If you don't declare a package, the class implicitly belongs to the default package.
 * 
 * > A class member can be a field, or a method, or some other type of dependent element.
 * > If a field is static, there is only one copy in memory, and this value is associated with the class, or template, itself.
 * 
 * > If a field is not static, it's called an instance field, and each object may have a different value stored for this field.
 * 
 */
/*
 * // Access Modifier for class
 * # Top Level class: A class is said to be a top-level class, if it is defined in the source code file, and not enclosed in the code block of another class, type, or method.
    > A top-level class has only two valid access modifier options: public, or none.
 *  
 * all access modifiers 
 * 
 * # keyword    |  Description
 * 
 * > public     | public means any other class in any package can access this class.
 * > protected  | protected allows classes in the same package, and any subclasses in other packages, to have access to the member.
 * > (empty)     | When the modifier is omitted, this has special meaning, called 'package access', meaning the member is accessible only to classes in the same package
 * > private    | private means that no other class can access this member

 */


// fields/member variable : are variable which is decleared inside a class and can be access by any method inside the class or through object


    
    