package Inheritance;
// one object acquires all the properties and behaviors of a parent object
// represents the IS-A relationship which is also known as a parent-child relationship.
// Provide code reusability which facilitates you to reuse the fields and methods of the existing class
// when you create a new class. You can use the same fields and methods already defined in the previous class
public class single_inheritance {
    static class Shape{
        public void area(){
            System.out.println("Display Area");
        }
    }
    static class Triangle extends Shape{
        public void area(int length,int height){
            area();
            System.out.println(0.5*length*height);
        }
    }
    public static void main(String[] args) {
        Triangle obj=new Triangle();
        obj.area(10,5);
    }
}
