package Polymorphism;

public class instance_initializer_block_super {
    static class Parent{
        Parent(){
            System.out.println("Parent class constructor is invoked");
        }
    }
    static class Child extends Parent{
        Child(){
            super();
            System.out.println("Child class constructor is invoked");
        }
        Child(int a){
            super();
            System.out.println("Child class constructor is invoked "+a);
        }
        {
            System.out.println("instance initializer block is invoked");
        }
    }
    public static void main(String[] args) {
        Child obj1=new Child();
        Child obj2=new Child(10);
    }
}
