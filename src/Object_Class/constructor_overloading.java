package Object_Class;

public class constructor_overloading {
    static class Student{
        String name;
        int age;
        int id;
        Student(String Name,int Age){
            name=Name;
            age=Age;
        }
        Student(String Name,int Age,int Id){
            name=Name;
            age=Age;
            id=Id;
        }
        public void printInfo(){
            System.out.println(id+" "+name+" "+age);
        }
    }
    public static void main(String[] args) {
        Student s1=new Student("Deep",24,1);
        s1.printInfo();
    }
}
