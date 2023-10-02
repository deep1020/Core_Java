package Polymorphism;
// a class has multiple methods having same name but different in parameters
// 2 ways to overload method -> 1) By changing number of arguments 2) By changing the data type
public class method_overloading {
    static class Student{
        String name;
        int age;
        public void printInfo(String name){
            System.out.println(name);
        }
        public void printInfo(int age){
            System.out.println(age);
        }
        public void printInfo(String name,int age){
            System.out.println(name+" "+age);
        }
    }
    public static void main(String[] args) {
        Student s1=new Student();
        s1.printInfo("Deep",24);
        s1.printInfo("Om");
    }
}

// Method Overloading is not possible by changing the return type of the method only.
// static int add(int a,int b){return a+b;}
// static double add(int a,int b){return a+b;}
