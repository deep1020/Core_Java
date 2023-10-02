package Object_Class;
// It belongs to the class rather than the object of a class.
// It can be invoked without the need for creating an instance of a class.
// The static method can not use non-static data member or call non-static method directly.
// this and super cannot be used in static context.
public class static_method {
    static class Student{
        int rollno;
        String name;
        static String college = "ITS";
        //static method to change the value of static variable
        static void change(){
            college = "CSULA";
        }
        //constructor to initialize the variable
        Student(int r, String n){
            rollno = r;
            name = n;
        }
        //method to display values
        void display(){
            System.out.println(rollno+" "+name+" "+college);
        }
    }
    public static void main(String[] args) {
        Student.change(); //calling change method
        Student s1 = new Student(111,"Deep");
        Student s2 = new Student(222,"Aryan");
        Student s3 = new Student(333,"Raj");
        s1.display();
        s2.display();
        s3.display();
    }
}
