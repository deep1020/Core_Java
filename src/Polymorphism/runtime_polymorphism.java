package Polymorphism;
// It is a process in which a call to an overridden method is resolved at runtime rather than compile-time
// Upcasting: If the reference variable of Parent class refers to the object of Child class.
public class runtime_polymorphism {
    static class Parent{
        void show(){
            System.out.println("Parent's show()");
        }
    }
    static class Child extends Parent {
        void show(){
            System.out.println("Child's show()");
        }
    }
    public static void main(String[] args) {
        Parent obj=new Child(); // Upcasting
        obj.show();
    }
}
