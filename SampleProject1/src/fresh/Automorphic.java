package fresh;

import java.util.Scanner;

public class Automorphic {
	public static void main(String args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=Sc.nextInt();
		int seq=n*n;
		int l=(""+n).length();
		int end=seq%(int)Math.pow(10, 1);
		if(n==end) {
			System.out.println("correct number");
		}
		else {
			System.out.println("{wrong number");
		}
		
	}
}
