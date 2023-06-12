package OOPs;
public class J02_Constructor02 {}


// basic constructor setup; this doesn't have any return type; name is same as class name.
class No_cons {
    // here no constructor is defined by user
    // So, here a default constructor will be provided by compiler. & 
    // variable 'var_n1' will be initilized to it's default value.(which is 0 for int)
    int var_n1;     // these are not 'private'; it can be accessed directly from outlide
    int var_n2 = 5;
}
class User_empty_cons{
    private int var_e1;
    public User_empty_cons(){    // if I use 'void, int...' as return type, then we will get error at the time of object creation. but we will only get worning in this code base.
        System.out.println("\nEmpty constructor called");
    }
}
class Parameterized_cons {
    private int var_p1 ;
    public Parameterized_cons(int var){
        this.var_p1 = var;
        System.out.println("\nParameterized constructor called \n" + "class variable initilized: "+var_p1+"\n");
    }
}
class cons_overloded{
    private int var_o1;
    private String var_o2;
    public cons_overloded(){
        System.out.println("Overloding; \nEmpty constructor called");
    }
    public cons_overloded(String name){
        this.var_o2 = name;
        System.out.println("\nConstructor with one parametor .. \n"+"var: "+ var_o2);
    }
    public cons_overloded(int var_o1, String var_o2){
        this.var_o1 = var_o1;
        this.var_o2 = var_o2;
        System.out.println("\nConstructor with 2 parametors:"+"var int: "+var_o1+" var name: "+var_o2+"\n");
    }
}
class cons_with_this{
    private int var_this;
    private String st1;
    public cons_with_this(){
        this(10,"Anand"); // this will call the constructor which have these set of parameters.
        System.out.println("First constructor................");
    } 
    public cons_with_this(int a, String b){ // this constructor from above constructor
        System.out.println("Second constructor...............");
        var_this = a;   // not using 'this' keyword here becouse both variable have different names.
        st1 = b;
    }
}