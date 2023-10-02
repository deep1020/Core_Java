public class type_casting {
    public static void main(String[] args) {
        double a=100.1;
        long b=(long) a;
        int c=(int) b;
        System.out.println("double type: "+a);
        System.out.println("double to long: "+b);
        System.out.println("long to int type: "+c);

        int d=100;
        long e=d;
        float f=e;
        System.out.println("int type: "+d);
        System.out.println("int to long: "+e);
        System.out.println("long to float: "+f);
    }
}
