package Operator;

public class prefix_postfix_2 {
    public static void main(String[] args) {
        int x=5;
        int a=x++;
        System.out.println(x+" "+a); // variable a stores 5 so a=5 and x will increment and print x=6
        System.out.println(x++); // print 6 and then increment now value of x is 7
        System.out.println(x++); // print 7 and then increment now value of x is 8
        System.out.println(++x); // increment x now value of x is 9 and print x
        System.out.println(x++); // print x which is 9 and then increment now value of x is 10
        int ans=(++x)*(++x)+(x++)*(x++); // 11*12 + 12*13
        System.out.println(ans);
    }
}
