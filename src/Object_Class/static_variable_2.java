package Object_Class;
// static block and static variables are executed in order they are present in a program.`
// Here first static_method is executed then static block
// Because static_method is declared first in static variable but it will not return 20 until it calls in main method
public class static_variable_2 {
    static int a=static_method();
    static {
        System.out.println("Inside static block");
    }
    static int static_method(){
        System.out.println("From Static Method");
        return 20;
    }
    public static void main(String[] args) {
        System.out.println("Value of a: "+a);
        System.out.println("From main method");
    }
}
