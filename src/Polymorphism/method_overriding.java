package Polymorphism;
// subclass has the same method as declared in the parent class
// subclass provides the specific implementation of the method that has been declared by one of its parent class
// must have the same parameter as in the parent class.
// must be an IS-A relationship (inheritance)
public class method_overriding {
    static class Parent{
        static void show(){
            System.out.println("Parent's show()");
        }
    }
    static class Child extends Parent{
        static void show(){
            show();
            System.out.println("Child's show()");
        }
    }
    public static void main(String[] args) {
//        Child obj=new Child();
        Child.show();
    }
}
// static method cannot be overridden because static method is bound with class whereas instance method is bound with an object.
// Static belongs to the class area, and an instance belongs to the heap area.
// It can be proved by runtime polymorphism
// main method can't be overrided as it has static method
