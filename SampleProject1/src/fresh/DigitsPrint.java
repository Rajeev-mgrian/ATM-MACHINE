package fresh;
import java.util.Scanner;

public class DigitsPrint {
	public static void printDigits(int num) {
		int counter=0;
		while(num>0) {
			int rem=num%10;
			counter++;
			System.out.println(rem);
			num=num/10;
		}
		System.out.println("digit of given number is =" +counter);
	}
	public static void main(String [] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=Sc.nextInt();
		printDigits(num);
		}
	}
