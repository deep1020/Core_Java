package Polymorphism;
// super keyword in java refers to dealing with parent class object while super() deals with parent class constructor
// super came into the picture with the concept of Inheritance.
public class super_method {
    static class Animal{
        void eat(){
            System.out.println("eating...");
        }
    }
    static class Dog extends Animal{
        void eat(){
            System.out.println("eating bread...");
        }
        void bark(){
            System.out.println("barking...");
        }
        void work(){
            super.eat();
            bark();
        }
    }
    public static void main(String[] args) {
        Dog d=new Dog();
        d.work();
    }

}
