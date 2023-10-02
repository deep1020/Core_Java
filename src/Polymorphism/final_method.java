package Polymorphism;
// final method cannot be overridden.
public class final_method {
    static class Parent{
        static void show(){
            System.out.println("Parent's show()");
        }
    }
    static class Child extends Parent {
        static void show(){
            System.out.println("Child's show()");
            show();
        }
    }
    public static void main(String[] args) {
        Child obj=new Child();
        obj.show();
    }
}
