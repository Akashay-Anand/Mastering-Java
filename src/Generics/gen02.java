package Generics;

public class gen02 {
    public static void main(String[] args) {

        //## case 1 ; no generic data type defined with '<>'; 
        // can store any type;
        HelloGen obj = new HelloGen("Anand", 101);
        System.out.println(obj.val); // direct access ; public field
        System.out.println(obj.getint()); // getter method
        
        System.out.println(obj.getgen()); // 
        // as there is no defined type of generic field we can change its value; and everything will be store as object
        // it's not a good practice 🤖🥷 ; always provide type while declaring;
        obj.setgen(34);
        System.out.println(obj.getgen()); 

        //## case 2 : with generic data type; (Type Safety Check)
        HelloGen<Integer> obj2 = new HelloGen<Integer>(135,101); 
        // everything is same except generic ; 
        // now generic fields can only have integer ; other wise it will give error
        System.out.println(obj2.getgen()); 
        // obj2.setgen("Anand"); // error: requires Integer 


    }
}

// Crisp & crystal clear example for generics 🧑🏻‍💻🤖
class HelloGen<T1>{
    public int val;
    private T1 gen;

    public HelloGen(T1 gen, int val){
        this.gen = gen;
        this.val = val;
    }
    public void setgen(T1 x){
        this.gen = x;
    }
    public void setint(int x){
        this.val = x;
    }
    public T1 getgen(){
        return this.gen;
    }
    public int getint(){
        return this.val;
    }
}