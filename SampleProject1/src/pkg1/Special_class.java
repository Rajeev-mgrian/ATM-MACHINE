package pkg1;
import java.util.Scanner;
public class Special_class {
public static void main(String[]args) {
//	Scanner Sc=new Scanner(System.in );
//	System.out.println("Enter a number");
//	String str=Sc.nextLine();	
	StringBuilder str =new StringBuilder("RAJEEV");
	String temp="";
	for(int i=0; i<=str.length()-1; i++) {
		temp=str.charAt(i)+temp;
	}
	System.out.println(temp);
}
}
