package Polymorphism;
// method resolution follows a hierarchy of data type widening.
// In this hierarchy, int can be widened to long, but long cannot be narrowed to int.
public class method_overloading_type_promotion_2 {
    static void sum(short a,int b){
        System.out.println("Method 2");
    }
    static void sum(int a,long b){
        System.out.println("Method 1");
    }

    public static void main(String[] args) {
        method_overloading_type_promotion_2 obj=new method_overloading_type_promotion_2();
        obj.sum(10, 20);
    }
}
