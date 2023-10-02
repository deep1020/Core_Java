package Integer_Methods;
import java.lang.Integer;
// It can take a String as well as an integer as parameter and returns an Integer object
// It can take a character as parameter and will return its corresponding unicode value
// When an integer is passed as parameter, it returns an Integer object corresponding to the given parameter.
// If Wrapper Integer object is needed then valueOf() method is to be used.
public class valueOf {
    public static void main(String[] args) {
        Integer obj=new Integer(10);
        System.out.println("Object value: "+obj.valueOf(20));

        char ch='a';
        int str1=Integer.valueOf(ch);
        System.out.println(str1);
    }
}
