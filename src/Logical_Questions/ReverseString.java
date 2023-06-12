package Logical_Questions;

// Reverse the given string.

public class ReverseString {
    public static void main(String[] args) {
        String st = "Hello Anand";
        String newST = "";
        for(int i = st.length()-1;i>=0;i--){
            // newST = st.charAt(i)  // Logicaly wrong and Check [Note-1]:
            newST += st.charAt(i);  // [Note-1]:
        }
        System.out.println("New String: "+ newST);
    }
}

/*
 * [Note-1]: String is reference type variable means it's a class and store address of object.
 * String is "immutable" means- once reference is created, we can not change address or reference stored in string variable. But
 * we can modify data stored at that address.
 * 
 * 
 */