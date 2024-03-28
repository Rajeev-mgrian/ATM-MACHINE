package fresh;

import java.util.Scanner;

public class Accenture {
public static void main(String [] args) {
	Scanner Sc=new Scanner(System.in) ;
	System.out.println("enter the string");
	String input=Sc.nextLine();
	Sc.close();
	if(isPalindrome(input)) {
		System.out.println("the string is palindrome");
	}else {
		System.out.println("the string is not a palindrome");
	}
}
private static boolean isPalindrome(String str) {
	int i=0; int j=str.length()-1;
	while(i<=j) {
		if(str.charAt(i) !=str.charAt(j)) {
			return false;
		}
		i++;
		j--;
	}
	return true;
}
	
}
