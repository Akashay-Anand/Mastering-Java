package CollectionsInJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class J00_Basic {
    public static void main(String[] args) {
        // Map hm = new HashMap<>();
        // hm.put(101, "Anand");
        // hm.put(102, "Rohan");
        // System.out.println(hm);

// Reference methods
        // we can store child's object reference in parent class/Interface veriable.
        ArrayList al = new ArrayList(); // "ArrayList" is a class which extends "List" interface
        List ll     = new ArrayList();  // "List Interface" is parent of ArrayList becouse it is extended by ArrayList;
        Collection cl = new ArrayList(); // "Collection Interface" is parent of List interface; List extends Collection.       

        al.add("ArrayList object refer by Arraylist veriable");
        ll.add("ArrayList object refer by List veriable");
        cl.add("ArrayList object refer by Collection veriable ");

        System.out.println(al);
        System.out.println(ll);
        System.out.println(cl);

    }
}

// Collecction framework 
/**
 * collection framework consist of two interfaces - Colection & Map
 *  
 */