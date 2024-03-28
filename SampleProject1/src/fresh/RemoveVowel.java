package fresh;
import java.util.Scanner;
public class RemoveVowel {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the string");
		String input=Sc.nextLine();
		char c;
		for(int i=0; i<input.length(); i++) {
			c=input.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
				continue;
			}
			else {
				System.out.print(c);
				
			}
		}
		
	}
}