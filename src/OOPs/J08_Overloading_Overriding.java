package OOPs;

public class J08_Overloading_Overriding {
    public static void main(String[] args) {
        
        
    }
}
// Overriding rule
// Covariant return type (Return type can be a subclass of return type in parent class.)

class BurgerFactory {
    public Burger createBurger() {
        return new Burger(); // return type - parent class
    }
}
class HealthyBurgerFactory extends BurgerFactory{
    @Override
    public HealthyBurger createBurger(){
        return new HealthyBurger(); // return type - Subclass of parent class
    }
}

class Burger{
    // parent class
}
class HealthyBurger extends Burger{
    // Subclass or child class
}