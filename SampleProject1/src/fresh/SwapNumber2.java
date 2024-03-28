package fresh;
import java.util.Scanner;
public class SwapNumber2 {
	public static void swapNumber(int num1, int num2) {
		int temp =0;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After Swaping num1 = " + num1 + " & num2 = " + num2);

	}

	public static void main(String[] args) {
		Scanner Sc=new Scanner (System.in);
		System.out.println("enter num1");
		int num1=Sc.nextInt();
		System.out.println("enter num2");
		int num2=Sc.nextInt();
		System.out.println("Before Swaping num1 = " + num1 + " & num2 = " + num2);
	swapNumber(num1,num2);
		
	}

}
