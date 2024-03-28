package fresh;

public class Solution {
	public static void Digits(int num) {
		int rev=0;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		Digits(123);
		// TODO Auto-generated method stub

	}

}
