package Object_Class;
// When a variable is declared as static, then a single copy of the variable is created and
// shared among all objects at the class level.

public class static_variable {
    static class Student{
        int rollno; //instance variable
        String name;
        static String college ="Indus"; //static variable
        //constructor
        Student(int r, String n){
            rollno = r;
            name = n;
        }
        //method to display the values
        void display (){
            System.out.println(rollno+" "+name+" "+college);
        }
        static {
            System.out.println("Inside Static Block");
        }
    }
    static class Counter {
        static int count = 0;//will get memory only once and retain its value
        Counter() {
            count++;//incrementing the value of static variable
            System.out.println(count);
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student(111,"Deep");
        Student s2 = new Student(222,"Raj");
        s1.display();
        s2.display();

        Counter ct1=new Counter();
        Counter ct2=new Counter();
        Counter ct3=new Counter();
    }
}
