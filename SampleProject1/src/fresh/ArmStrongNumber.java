package fresh;
import java.util.Scanner;
public class ArmStrongNumber { 

	public static void main(String args[]) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=Sc.nextInt();
		int sum=0;
		int temp=num;
		while(num>0) {
			int digit=num%10;
			sum=sum+(digit*digit*digit);
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("the entered number "+ temp + " is a armstrong ");
		}else {
			System.out.println("the entered number "+ temp + " is not a armstrong number ");
		}
	}

}
