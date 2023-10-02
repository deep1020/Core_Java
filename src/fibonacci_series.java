public class fibonacci_series {

	static int[] printFibbonacci(int n){
		int a=0,b=1;
		int arr[]=new int[n];
		arr[0]=a;
		arr[1]=b;
		for(int i=2;i<n;i++){
			int c=a+b;
			arr[i]=c;
			a=b;
			b=c;
		}
		return arr;
	}
	public static void main(String[] args) {
		int n=7;
		int result[]=printFibbonacci(n);
		for (int i=0;i<result.length;i++){
			System.out.print(result[i]+" ");
		}
	}
}

//int n1=0,n2=1,count=10;
//	System.out.print(n1+" "+n2);//printing 0 and 1
//
//			for(int i=2;i<count;i++) {
//	int n3=n1+n2;
//	System.out.print(" "+n3);
//	n1=n2;
//	n2=n3;
//	}
