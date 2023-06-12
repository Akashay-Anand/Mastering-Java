package OOPs;

public class J07_Object_Reference {
    public static void main(String[] args) {
        House blueHouse = new House("blue");    // House = class ; blueHouse = instance(it sstore the address of object) ; new House() = object (it create an object and alocate some memory to that); 
        House anotherHouse = blueHouse;     // anotherHouse points the same address which is pointed by blueHouse

        System.out.println(blueHouse.getColor() +" " +anotherHouse.getColor());

        blueHouse.setColour("yellow");
        System.out.println(blueHouse.getColor() +" " +anotherHouse.getColor());

        anotherHouse.setColour("green");
        System.out.println(blueHouse.getColor() +" " +anotherHouse.getColor());
    
        // becouse both reference to same address , they printed same value.
    }
}

// House BluePrint
class House{
    private String color;
    public House(String color){
        this.color = color;
    }
    public void setColour(String color){
        this.color = color;
    }
    public String getColor(){
        return color; // we can also use this.color
    }
}