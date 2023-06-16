public class GCD_two_number {
    public static int gcd(int x,int y){
        int gcd=1;
        for(int i=1;i<=x && i<=y; i++){
            if(x%i==0 && y%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        System.out.println(gcd(12,8));
    }
}

//    int x = 12, y = 8, gcd = 1;
//        for(int i = 1; i <= x && i <= y; i++)
//                {
//                if(x%i==0 && y%i==0)
//                gcd = i;
//                }
//                System.out.printf("GCD of %d and %d is: %d", x, y, gcd);