package Object_Class;
// Block of code that initialize a newly created object
// call when an instance of class is created. At the time of calling constructor, memory for the object is allocated.
// object is created using new() keyword at least one constructor is called

// Name must be same as its class name
// No explicit return type
// can't be abstract, static, final, synchronized
// can't be inherited by subclasses
public class constructor {
    static class Student{
        String name;
        int age;
        public void printInfo(){
            System.out.println(name+" "+age);
        }
        // Default Constructor
        Student(){
            System.out.println("Default Constructor Called");
            System.out.println(name+" "+age);
        }
        // Parameterized Constructor
        Student(String Name,int Age){
            this.name=Name;
            this.age=Age;
        }
        // Copy Constructor
        Student(Student s){
            name=s.name;
            age=s.age;
        }
    }
    public static void main(String[] args) {
        new Student(); // when Student object is created, call Student() constructor
        Student s1=new Student("Deep",24);
        s1.printInfo();

        Student s2=new Student(s1);
        s2.printInfo();
    }
}
