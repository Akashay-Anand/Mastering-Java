package OOPs;

//----- Composition forms 'has-a' relationship ------
// lets take a 'pen' as our example--- A pen has a grip; pen has a refill; a pen has a case'

// basic setup of Composition
public class J09_Composition01 { // main class
    public static void main(String[] args) {
        Grip grip = new Grip("Rubber");
        Case newCase = new Case(15, "With cap", grip);
        Refill newRefill = new Refill("Blue");

        Pen myPen = new Pen("Agni", newCase, grip, newRefill);  // passing objects

        System.out.println("Before: "+myPen.getRefill().getRefillColor());      // accessing method of different class
        myPen.getRefill().changeColor("Black");
        System.out.println("After: "+myPen.getRefill().getRefillColor());
    }
}

class Pen {
    private String name;
    private Case myCase;    // variable of class
    private Grip grip;      // variable of class
    private Refill refill;
    public Pen(String name, Case myCase, Grip grip, Refill refill){
        this.myCase = myCase;
        this.grip = grip;
        this.refill = refill; 
    }
    public Case getCase(){
        return myCase;
    }
    public Grip getGrip(){
        return grip;
    }
    public Refill getRefill(){
        return refill;
    }

}
class Case{
    private int length;
    private String type;
    private Grip grip;

    public Case(int length, String type, Grip grip){
        this.length = length;
        this.type = type;
        this.grip = grip;
    }
}

class Grip{
    private String gripType;

    public Grip(String gripType){
        this.gripType = gripType;
    }

    public String getGripType(){
        return gripType;
    }

}
class Refill{
    String color;
    public Refill(String color) {
        this.color = color;
    }
    public String getRefillColor(){
        return color;
    }
    public void changeColor(String color){
        this.color = color;
    }
}

