public class swap_number {
    static int[] swap(int num1,int num2){
        int temp=num1;
        num1=num2;
        num2=temp;
        int swappedValues[]={num1,num2};
        return swappedValues;
    }
    public static void main(String[] args) {
        int a=5,b=10;
        int swapped[]=swap(a,b);
        System.out.println("Original values: "+"a="+a+" "+"b="+b);
        System.out.println("Swapped values: "+"a="+swapped[0]+" "+"b="+swapped[1]);
    }
}
