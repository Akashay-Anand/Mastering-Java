package OOPs;

public class J10_Encapsulation {

    public static void main(String[] args) {
        
        // without Encapsulation. (end-up with some issues in big project)
        Normal obj1 = new Normal();
        // obj1.age = 30;      // if latter someone change variable name, this way here we get error for name.
        obj1.health = 200;  // value should be less than or equal to '100', but due to direct access someone can do this type of mistake. 
        obj1.printData();
        
        //with Encapsulation.   (better for big project).
        Modified obj2 = new Modified();
        obj2.setAge(25);    // we don't need variable name to access then.; more independent and effective.
        obj2.setHealth(200);    // this won't work; we have implemented validation code; So value should be in our range. effective
        System.out.println(obj2.getHealth());   // we can access them with methods also. 
    
    }
   
}

class Normal{
    int myage = 20;
    public int health = 80; // Health should-not be grater than 100

    public void printData(){
        System.out.println("Age: "+myage+", Health: "+health);
    }
    
}

class Modified{
    private int age = 20;   // 'private' prevent from direct access from outside the class.
    private int health = 80;

    public void setAge(int age){
        this.age = age;
    }
    public void setHealth(int health){
        if(health >0 && health <=100)   // validation on health variable.
        this.health = health;
    }
    public int getAge(){
        return age;
    }
    public int getHealth(){
        return health;
    }
}