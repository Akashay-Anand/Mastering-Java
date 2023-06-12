package OOPs;
class J00_Basic {
    public static void main(String[] args) {
        System.out.println("Anand");

        Hello obj = new Hello();
        obj.he();
        Hello.he();
    }

}
class Hello{
    static void he(){
        System.out.println("Static method");
    }
}