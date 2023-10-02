package Object_Class;
// Only static members of Outer class is directly accessible in nested static class
// An instance of an inner class cannot be created without an instance of the outer class
// Therefore, an inner class instance can access all of the members of its outer class,
// without using a reference to the outer class instance
public class static_class {
    static String msg = "Hello World";
    static class NestedStaticClass{
        public void printInfo(){
            System.out.println("Message from nested static class: "+msg);
        }
    }
    public class InnerClass{
        public void display(){
            System.out.println("Message from non-static nested class: "+msg);
        }
    }
    public static void main(String[] args) {
        NestedStaticClass obj=new NestedStaticClass();
        obj.printInfo();

        static_class outer=new static_class();
        static_class.InnerClass inner=outer.new InnerClass();
        inner.display();
    }
}
