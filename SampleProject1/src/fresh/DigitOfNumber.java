package fresh;
import java.util.Scanner;;
public class DigitOfNumber {
	public static void main(String args[]) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter a number");
		long num=Sc.nextLong();
		int counter=0;
		while(num>0) { 
			long rem=num%10;
			counter++;
			System.out.println(rem);
			num=num/10;
		}
		System.out.println("the digite of given number is = " + counter);
	}

}
