package Integer_Methods;

public class toString_method {
    static class Student{
        int rollno;
        String name;
        Student(int rollno,String name){
            this.rollno=rollno;
            this.name=name;
        }
        public String toString(){
            return rollno+" "+name;
        }
    }
    public static void main(String[] args) {
        Student s1=new Student(1,"Deep");
        System.out.println("using toString() method: "+s1);

        Integer a=5;
        String str=a.toString();
        System.out.println("Integer to String: "+str);
    }
}
