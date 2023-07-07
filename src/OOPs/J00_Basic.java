package OOPs;
class J00_Basic {
    public static void main(String[] args) {
        System.out.println("Anand");
        Hello obj = new Hello();
        obj.he();
        Hello.he();
    }
}
class Hello{
    static void he(){
        System.out.println("Static method");
    }
}
//> OOP is a common acronym for Object Oriented Programming.

// What is Object Oriented Programming?
//> Object oriented programming is a way to model real world objects, as software objects, which contain both data and code.
