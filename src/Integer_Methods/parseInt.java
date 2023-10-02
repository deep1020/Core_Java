package Integer_Methods;
// int, being a primitive data type has got less flexibility. We can only store the binary value of an integer in it.
// Integer is a wrapper class for int data type, it gives us more flexibility in storing, converting and manipulating an int data.
// 1) Casting to String Variable -> using the Integer(String)
// 2) Direct Conversion of value to other base -> using toBinaryString(), toOctalString() or toHexString()
// 3) Performing operations on data -> using reverse(), rotateLeft() and rotateRight()

// parseInt() method
// It can only take a String as a parameter and returns a primitive int
// When an integer is passed as parameter, it produces an error due to incompatible types
// If we need the primitive int datatype then Integer.parseInt() method is to be used.
public class parseInt {
    public static void main(String[] args) {
        String s="100";
        int i=Integer.parseInt(s); // int i=Integer.parseInt(s.trim());
        System.out.println(s+200);
        System.out.println(i+200);

        int b=Integer.parseInt("123");
        System.out.println(b);
        System.out.println(b+new Float("10.1"));
    }
}
