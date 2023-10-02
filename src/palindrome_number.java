public class palindrome_number {
	static boolean isPalindrome(int num){
		if(num<0){
			return false;
		}
		int reverseNum=0;
		int originalNum=num;
		while (num>0){
			int reminder=num%10;
			reverseNum=reverseNum*10+reminder;
			num=num/10;
		}
		return originalNum==reverseNum;
	}
	public static void main(String[] args) {
		int num=121;
		System.out.println(isPalindrome(num));
	}
}
// T.C -> O(logn)
// S.C -> O(1)

//	int r,sum=0,temp;
//	int n=454;
//	temp=n;
//	while(n>0) {
//	r=n%10;  //getting remainder
//	sum=(sum*10)+r;
//	n=n/10;
//	}
//	if(temp==sum)
//	System.out.println(sum+" is palindrome number ");
//	else
//	System.out.println(sum+" not palindrome");