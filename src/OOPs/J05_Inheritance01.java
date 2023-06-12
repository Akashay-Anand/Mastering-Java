package OOPs;
// Note: we can create all class in separate file; here I am creating in the same file just for easiness
public class J05_Inheritance01 {
    public static void main(String[] args) {
        Superclass p_obj = new Superclass();
        Subclass c_obj = new Subclass("Anand","Student",2);

        // p_obj.result();
        c_obj.result();
        System.out.println(p_obj.age);  // I can access 'protected' fields of same project. but can't access 'private'
        
    }
}

// parent class
class Superclass {
    private String name;    //  'private' allows access in same class only
    protected int age ;  //  'protected' allows access in same project
   
    public Superclass(){}   // empty constructor
    public Superclass(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void result(){
        System.out.println("parest class");
    }
    public void parent_method(){
        System.out.println("if you are not using object of parent class then ");
        System.out.println("Parent_method can only be accesed from child with the elp of 'super' keyword");
    }
}
// child class ; it inherits the properties of parent class
class Subclass extends Superclass {
    private String work_type;
    protected int experience = 6;

    public Subclass(String name, String work, int experience){
        super(name, 20);
        this.work_type = work;
        this.experience = experience;
    }

    @Override      //[note-1]
    public void result(){
        System.out.println("Child class: super.age: "+ super.age);
        super.result(); 
    }

    public void parent_method(){ // [note-2] (it is not good design)
        System.out.println("This is child class overriding paent_method");
        System.out.println("we are not using 'super' to access parent method");
    }
}

/*

[Note-1]: '@Override' is just a annotation(tag) for compiler; it's not important for code execution, we use it only for understanding purpose. Code will work perfectly without that also.

[Note-2]: (if you are only using object of child class)--
> If you override method without call to super, then there is no way to get code from super class to execute or in other words you can't call method from super class.
> If both classes have methods with same name but different functionality then it is first sign of bad design
> it is first sign of bad design, just rename your method and problem solved.

*/
