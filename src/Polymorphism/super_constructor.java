package Polymorphism;

public class super_constructor {
    static class Person{
        int id;
        String name;
        Person(int id,String name){
            this.id=id;
            this.name=name;
        }
    }
    static class Emp extends Person{
        float salary;
        Emp(int id1,String name1,float salary){
            super(id1,name1);  //reusing parent constructor
            this.salary=salary;
        }
        void display(){
            System.out.println(id+" "+name+" "+salary);
        }
    }
    public static void main(String[] args) {
        Emp e1=new Emp(1,"Deep",5000f);
        e1.display();
    }
}
