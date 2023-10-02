package Polymorphism;

// to refer immediate parent class object. It may be variable, method or constructor
public class super_variable {
    static class Animal{
        String color="white";
    }
    static class Dog extends Animal{
        String color="black";
        void printColor(){
            System.out.println(color);//prints color of Dog class
            System.out.println(super.color);//prints color of Animal class
        }
    }
    public static void main(String[] args) {
        Dog d=new Dog();
        d.printColor();
    }
}
