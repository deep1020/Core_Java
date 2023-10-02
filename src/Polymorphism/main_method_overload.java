package Polymorphism;
// main() method can be overloaded by having any number of main methods in a class
// But JVM calls main() method which receives string arrays arguments only
public class main_method_overload {
    public static void main(String[] args) {
        System.out.println("Main with String[]");
    }
    public static void main(String args) {
        System.out.println("Main with String");
    }
    public static void main() {
        System.out.println("Main without args");
    }
}
