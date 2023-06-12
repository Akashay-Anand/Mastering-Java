package OOPs;

public class J11_Polymorphism {


    
}

class Base extends J11_Polymorphism{

    public static void main(String[] args) {
        
        Child obj = new Child();
    
        obj.hello();
    }

    private int time = 12;
    public void hello(){
        System.out.println("\nParent class\n");
    }

}

class Child extends Base{
    private int age = 9;

    @Override
    public void hello(){
        System.out.println("\nChild class\n");
    }
}
