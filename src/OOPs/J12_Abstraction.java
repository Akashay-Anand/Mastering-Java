package OOPs;

public class J12_Abstraction extends Abs{
    public static void main(String[] args) {
        System.out.println("Hello Anand");

        Abs par_obj = new J12_Abstraction(); // true; we can store reference of child in parent variable ;
        J12_Abstraction obj = new J12_Abstraction();
        obj.start();
        obj.go();
    }
    void start(){
        System.out.println("Starting car");
    }
}
abstract class Abs{
    abstract void start();
    void go(){
        System.out.println("Hurreeee.. we are moving");
    }
}

