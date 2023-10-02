package Polymorphism;
// final variables must be used only for the values that we want to remain constant throughout the execution of the program.
// Reference final variable:
// It cannot be re-assign but the internal state of the object pointed by that reference variable can be changed.

// This helps ensure that data is immutable and cannot be accidentally or maliciously modified.
// optimize code more effectively
// simplify code analysis and debugging
// code reuse and reduce duplication, as subclasses must use the parent class’s implementation of the method.
// enhance security by preventing malicious code from modifying sensitive data
public class final_variable {
    static int speedlimit=90; // final int speedlimit=90; gives compile time error
    void run(){
        speedlimit=400;
        System.out.println(speedlimit);
    }
    public static void main(String[] args) {
        final_variable obj=new final_variable();
        obj.run();

        int arr[]={1,2,3};
        for(final int i:arr){ // final array
            System.out.print(i+" ");
        }

        // Reference final variable
        final StringBuilder sb=new StringBuilder("Hello");
        System.out.println("\n"+sb);
        sb.append("World");
        System.out.println(sb);
    }
}
