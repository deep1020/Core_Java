public class palindrome_number {

	public static void main(String[] args) {
		
		int r,sum=0,temp;    
		int n=454;
		temp=n;    
		while(n>0) {    
			r=n%10;  //getting remainder  
			sum=(sum*10)+r;    
			n=n/10;    
		}    
		if(temp==sum)    
			System.out.println(sum+" is palindrome number ");    
		else    
			System.out.println(sum+" not palindrome");    
	}

}
