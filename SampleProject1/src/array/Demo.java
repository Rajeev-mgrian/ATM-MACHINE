package array;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int Size=Sc.nextInt();
		int number []=new int[Size];
		for(int i=0; i<Size; i++) {
			number[i]=Sc.nextInt();
			
			
		}
		int x=Sc.nextInt();
		
		for(int i=0; i<number.length; i++) {
			if(number[i]==x) {
				System.out.println("x found at indexed at : " + i );
			}
			
		}
	}
}
