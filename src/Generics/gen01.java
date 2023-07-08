package Generics;

import java.util.ArrayList;

public class gen01 {
    public static void main(String[] args) {
        
        // condition - 1
        ArrayList al = new ArrayList();
        al.add("Anand");
        al.add(4);
        System.out.println(al.get(1));
        // int a = al.get(1); // error: [Note - 1]
        int a = (int) al.get(1);

        // Condition - 2
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        // al2.add("Anand"); // error: // stores integer as given in generic,
        al2.add(4);
        int a2 = al2.get(0); // works; data type is defined
        System.out.println(a2);
    }
}

// [Note - 1]: al is row without any data type, it store data as object so it doesn't know if data type is same or not so we have to type cast it;

//> insted of creating multiplenumber of overloaded methods, concept called 'Generics' is introduced;
//> it helps to store data type for inputes which can be evaluted forther;