package OOPs;
/* # here we we see--
> constructor chaining, 
> difference between good constructon and bad constructor
> duplicate values reduction  

*/

public class J03_ConstructorChaining_Good_Bad_Constructor {
    public static void main(String[] args) {
    }
}
/*  Bad constructor
> you can see that every constructor in 'Bad_cons' have same type of code to assign value to fields(variable).
> thats unnecessary and bad approach, (increasing the lines of code).
*/
class Bad_cons{
    // rectangle 
    private int x;
    private int y;
    private int width;
    private int height;

    public Bad_cons(){
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }
    public Bad_cons(int width, int height){
        this.x = 0;
        this.y = 0;
        this.width = width;
        this.height = height;
    }
    public Bad_cons(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
/* Good constructor
> Here we have removed unnecessary code from 1st and 2nd constructor
> (constructor chaining) we have used 'this() call' to call other cons. and have passed value through it.; it will end up calling final constructor

*/
class Good_cons{
    // rectangle 
    private int x;
    private int y;
    private int width;
    private int height;

    public Good_cons(){ // 1st cons.
        this(0,0); // this will call 2nd cons.
    }
    public Good_cons(int width, int height){    // 2nd cons.
        this(0,0,width,height); // this will call 3rd cons.
    }
    public Good_cons(int x, int y, int width, int height){  // 3rd cons.
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
