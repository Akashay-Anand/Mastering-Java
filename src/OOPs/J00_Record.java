package OOPs;

public class J00_Record {
    public static void main(String[] args) {
        Employee1 obj = new Employee1("Record_Boy",202,"CSE");

        System.out.println(obj);
    }    
}

//Notice:  'class' is replaced with 'record'
// it have '()' also 

// Record header
record Employee1(String name, int id, String department) {

}

// The record was introduced in JDK 14, and became officially part of Java in JDK 16. It's purpose is to replace the boilerplate code of the POJO, but to be more restrictive. Java calls them "plain data carriers".

/*
 * 
 * The record is a special class that contains data, that's not meant to be altered.
In other words, it seeks to achieve immutability, for the data in its members.
It contains only the most fundamental methods, such as constructors and accessors.
Best of all, you the developer, don't have to write or generate any of this code.

 * 
 * 
 */