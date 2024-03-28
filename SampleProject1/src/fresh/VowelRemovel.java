package fresh;
import java.util.Scanner;

public class VowelRemovel {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the String");
		String input=Sc.nextLine();
	//	char c=input.charAt(0);  
		char c;
		for(int i=0; i<input.length(); i++) {
		c=	input.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
				continue;
			} 
			else {
				System.out.print(c);
			}
		}
	}
}
