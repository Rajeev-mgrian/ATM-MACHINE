package pkg1;
import java.util.Scanner;

public class fibanacci {
	
//write a program to find the first 20 number of fibnacci series
	/*public static void main(String args[]) {
		int num1=0;
		int num2=1;
		int num3=0;
		System.out.println(num1);
		System.out.println(num2);4c
		for(int i=1; i<=20; i++) {
 		num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
		}
	}
	*/
//	write a program to find the n number of fibanacci series
	
	/*public static void main(String args[]) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=Sc.nextInt();
		int num1=0;
		int num2=1;
		int num3=0;
		System.out.println(num1);
		System.out.println(num2);
		for(int i=1; i<=n; i++) {
			num3= num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
			
		}
	}
	*/
	public static void main(String args[]) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter your number");
		int n=Sc.nextInt();
		int fac=1;
		for(int i=n; i>=1;  i--) {
			fac=fac*i;
		}
		System.out.println(fac);
	}
		
}
