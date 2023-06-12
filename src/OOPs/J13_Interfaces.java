package OOPs;

public class J13_Interfaces implements Interf{
    public static void main(String[] args) {
        System.out.println("Hello Anand");

        Interf Par_Obj = new J13_Interfaces();  // true ; we can store object of child in parent variable ;
        J13_Interfaces obj = new J13_Interfaces();
        
        obj.work();
        obj.body();
        // Rules of static method is different for interfaces. => A class does not inherit static methods from its superinterfaces.
        // obj.WithBody(); // false ; (https://docs.oracle.com/javase/specs/jls/se8/html/jls-8.html#jls-8.4.8)
        Interf.WithBody(); // true; we can call it with the help of interface name(in a static way); 

    }
    // we have to define body for abstract methods of parent class( abstract / interface).
    public void WithoutBody(){ } // return type should be grater than or equal to return type of original method(parent method)
    public void work(){ 
        System.out.println("I am abstract method, decleared inside interface and defined inside child class");
     }
}

interface Interf{

    int var1 = 10; // by defoult variables are ' public static final ' in nature ; acces modifier can not be changed
    public static final int var2 = 15;
    // private int y = 3; // false ; can't not be private

    void WithoutBody(); // method without body; by defolut it is 'public abstract'.
    public abstract void work(); // no body; always decleared with 'public abstract'

    // after java 8 version.
    // we can create 'default' & 'static' method with body(concreate method).
    default void body(){ System.out.println("I am defoult method from inside of Interface block"); }  
    static void WithBody(){  System.out.println("Static method from inside of interface"); }

    // we can also use 'private' for concreate methods after java 9 version
    private void Hello(){ };

}