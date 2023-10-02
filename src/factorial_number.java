public class factorial_number {
    static int factorial(int number) {
        int fact=1;
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int number=5;
        System.out.println(factorial(number));
    }
}
//    int i,fact=1;
//    int number=5;
//        for(i=1;i<=number;i++){
//        fact=fact*i;
//    }
//        System.out.println("Factorial of "+number+" is: "+fact);
//}