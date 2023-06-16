// static -> use for memory management. static keyword with variables, methods, blocks, and classes
// static class -> way of grouping classes together.
// It is also used to access the primitive member of the enclosing class through the object reference
// It does not require any reference of the outer class.
// It does not allows us to access the non-static members of the outer class.

public class static_keyword {
    private static String s = "Hello world";
    //Static and nested class
    static class StaticNestedClass {
        //non-static method of the nested class
        public static void show() {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {

//        static_keyword.StaticNestedClass obj= new static_keyword.StaticNestedClass();
        StaticNestedClass.show();
    }
}