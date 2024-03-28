package fresh;

public class ToReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123456789;
		int rev =0;
		System.out.println("given number is: " +num);
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("the reverse of given number is : " + rev);
	}
}
