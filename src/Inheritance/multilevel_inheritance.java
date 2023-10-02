package Inheritance;

public class multilevel_inheritance {
    static class Shape{
        public void area(){
            System.out.println("Display Area");
        }
    }
    static class Triangle extends Shape {
        public void area(int length,int height){
            System.out.println(0.5*length*height);
        }
    }
    static class EquilateralTriangle extends Triangle{
        public void area(int length,int height){
            System.out.println(0.2*length*height);
        }
    }
    public static void main(String[] args) {
        EquilateralTriangle obj=new EquilateralTriangle();
        obj.area(10,5);
        Triangle obj2=new Triangle();
        obj2.area(10,5);
    }
}
