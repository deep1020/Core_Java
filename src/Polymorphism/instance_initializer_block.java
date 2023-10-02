package Polymorphism;
// The instance initializer block is created when instance of the class is created.
//The instance initializer block is invoked after the parent class constructor is invoked
// (i.e. after super() constructor call).
public class instance_initializer_block {
    static class Shape{
        Shape(){
            System.out.println("Constructor is invoked");
        }
        {
            System.out.println("Instance Initialize block is invoked");
        }
    }
    public static void main(String[] args) {
        Shape obj=new Shape();
    }
}
// class Shape{
// Shape(){
// System.out.println("Constructor is invoked");
// }
// { System.out.println("Instance initializer block is invoked"); }

// What compiler do?
// The java compiler copies the instance initializer block in the constructor after the first statement super()

// class Shape{
// Shape(){
// super();
// { System.out.println("Instance initializer block is invoked"); }
// System.out.println("Constructor is invoked"); }
// }