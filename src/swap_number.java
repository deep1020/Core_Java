public class swap_number {

	public static void main(String[] args) {
		int x = 100, y = 200;
		 
        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
 
        int temp = x;
        x = y;
            System.out.println(x);
        y = temp;
        
        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        
        int a = 10;
        int b = 5;
        System.out.println("Before swapping:" + " a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping:" + " a = " + a + ", b = " + b);
	}

}
