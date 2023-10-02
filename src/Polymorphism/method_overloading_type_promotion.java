package Polymorphism;
// method resolution follows a hierarchy of data type widening.
// In this hierarchy, int can be widened to long, but long cannot be narrowed to int.
public class method_overloading_type_promotion {
    static void sum(int a,int b){
        System.out.println("int arg method invoked");
    }
    static void sum(long a,long b){
        System.out.println("long arg method invoked");
    }
    public static void main(String[] args) {
        method_overloading_type_promotion obj=new method_overloading_type_promotion();
        obj.sum(10L,20);
    }
}
