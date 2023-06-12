package CollectionsInJava;

import java.util.List;
import java.util.ArrayList;

public class J01_Collection_Interface {
    public static void main(String[] args) {

// working with 'List'.

        List Al = new ArrayList();

        Al.add(10);
        Al.add(1, "Anand"); // indexed
        Al.add(9.4);                     // add at end. 

        System.out.println(Al.size());
              
    }
}

//  Collection Interface is parent of 'List', 'Set', 'Queue'

/*
 * 
 */