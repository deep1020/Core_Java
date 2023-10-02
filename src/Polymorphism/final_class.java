package Polymorphism;
// As final classes cannot be extended so it is used to prevent inheritance
// All Wrapper Classes like Integer, Float, etc. are final classes
public class final_class {
    static class Parent{ // final static class Parent gives compile time error
        void printInfo(){
            System.out.println("Parent Class Method");
        }
    }
    final static class Child extends Parent{
        void printInfo(){
            System.out.println("Child Class Method");
        }
    }
    public static void main(String[] args) {
        Child obj=new Child();
        obj.printInfo();
    }
}
