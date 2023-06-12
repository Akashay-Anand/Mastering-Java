package Exercise;

public class A_test01 {
    // public static void main(String[] args) {
    //     A_test01 obj = new A_test01();
    //     Name n = new Name("Akashay", "Anand");
    //     obj.display(15, n);
    // }   
    public void display(int age, Name n){
        System.out.println("age: "+age);
        System.out.println("Full name: "+ n.firstName+" "+n.lastName);
    }
}

class Name{

    public static void main(String[] args) {
        A_test01 obj = new A_test01();
        Name n = new Name("Akashay", "Anand");
        obj.display(15, n);
    }  

    String firstName;
    String lastName;
    public Name(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
}