package array;
import java.util.Scanner;

public class LoveCalculator {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String myName=sc.next();
		System.out.println("enter your lover name");
		String loverName=sc.next();
		int perct = (int)(Math.random()*100);
		System.out.println("your lover " + loverName + "  " + perct + " % lover "+ " to you " + myName );
		
	}

}
