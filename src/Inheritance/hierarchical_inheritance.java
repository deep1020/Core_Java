package Inheritance;
// When two or more classes inherits a single class, it is known as hierarchical inheritance
// Triangle and Square classes inherits the Shape class
public class hierarchical_inheritance {
    static class Shape{
        public void display_area(){
            System.out.println("Display Area");
        }
    }
    static class Triangle extends Shape {
        public void traingle_area(int length,int height){
            System.out.println(0.5*length*height);
        }
    }
    static class Square extends Shape{
        public void square_area(int length,int height){
            System.out.println(length*height);
        }
    }
    public static void main(String[] args) {
        Square sq=new Square();
        sq.display_area();
        sq.square_area(10,5);
        // sq.traingle_area(10,5); gives compile time error

        Triangle tr=new Triangle();
        tr.traingle_area(10,20);
    }
}
