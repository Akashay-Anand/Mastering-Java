package OOPs;
// getter setter
public class J04_Methods01 {
    public static void main(String[] args) {
       /// first case
        Test_Methods01 obj = new Test_Methods01();
        obj.x = 5;  // this work 
        // obj.text1 = "Anand"; //(error) text1 is private so cant access it outside class
        obj.text2 = "Anand"; // protected mode can be accessed from outside class but in same package
        // System.out.println(obj.text2+" "+ obj.x);

        /// second case (solving above error)
        Test_Methods02 obj2 = new Test_Methods02("Hello", "Anand", 12); // through this i can assign value to private values also
        // System.out.println(obj2.t1);  //(error) but still I can't access t1 becouse it is private

        /// third case (solving above error)
        // so here using set and get method 
        System.out.println(obj2.getT1());
    }   
}

class Test_Methods01{
    private String text1;
    protected String text2;
    int x;
}
class Test_Methods02{
    private String t1;
    protected String t2;
    int y;

    public Test_Methods02(String t1, String t2,int y){
        this.t1 = t1;   // 'this' is used to refer class variables
        this.t2 = t2;
        this.y = y;
    }
    public void setT1(String t1){ this.t1 = t1; }
    public String getT1(){ return t1; }
}

// Why use private and then setter/gatter ? why not directly access veriable.?

/*
 * "I think I understand that the getter needs to be called because it's a public method though?"
    
    The reason to use getters and setters, instead of making all variables public, is encapsulation. You want to be able to have control over how your methods work, and what and how your variables are changed, including the ability to do validation. By using something like Room.Radio.setVolume(34.6) instead of something like Room.Radio.volume = 34.6, you can specify that, perhaps, 10 is the max, then it could deal with the error of someone putting in an invalid value, or perhaps when someone turns up the volume, you also want to set the bass lower? You can do that with this method, but if someone can randomly changes the variable, there's no way to stop them from using it in an inappropriate way.
 */